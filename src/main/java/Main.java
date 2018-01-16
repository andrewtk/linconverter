import lorgNew.tables.Answers;
import lorgNew.tables.Questions;
import lorgNew.tables.records.AnswersRecord;
import lorgNew.tables.records.QuestionsRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {

    public static void main(String[] args) {
        String fileWithNewLink = "";
        String oldLink = "https://s3.eu-central-1.amazonaws.com/devloyverseorg/pictures/";
        String newLink = "BLA-BLA-BLA-BLA-BLA";
        exchangeLink(oldLink, newLink);
        //ExchangeName.exchangeNameInLink();
    }

    private static void exchangeLink(String oldLink, String newLink) {

        String userName = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/lorgNew?autoReconnect=true&useSSL=false";
        System.out.println("Connected database successfully...");

        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext db = DSL.using(conn, SQLDialect.MYSQL);
            System.out.println("Connected database successfully...");
            Result<AnswersRecord> answers = db.selectFrom(Answers.ANSWERS).where(Answers.ANSWERS.CONTENT.contains(oldLink)).fetch();
            Result<QuestionsRecord> questions = db.selectFrom(Questions.QUESTIONS).where(Questions.QUESTIONS.CONTENT.contains(oldLink)).fetch();
            int i = 1;
            for (AnswersRecord answer : answers) {
                String content = answer.getContent();
                if (content != null && content.contains(oldLink)) {
                    answer.setContent(content.replaceAll(oldLink, newLink));
                    System.out.println("записали строку " + i++ + " in answer");
                }

            }
            db.batchUpdate(answers).execute();
            i = 1;
            for (QuestionsRecord question : questions) {
                String content = question.getContent();
                if (content != null && content.contains(oldLink)) {
                    question.setContent(content.replaceAll(oldLink, newLink));
                    System.out.println("записали строку " + i++ + " in question");
                }
            }
            db.batchUpdate(questions).execute();
            db.close();
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }
}

