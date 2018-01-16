/*
 * This file is generated by jOOQ.
*/
package lorgNew.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import lorgNew.tables.Questions;
import lorgNew.tables.records.QuestionsRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QuestionsDao extends DAOImpl<QuestionsRecord, lorgNew.tables.pojos.Questions, Integer> {

    /**
     * Create a new QuestionsDao without any configuration
     */
    public QuestionsDao() {
        super(Questions.QUESTIONS, lorgNew.tables.pojos.Questions.class);
    }

    /**
     * Create a new QuestionsDao with an attached configuration
     */
    public QuestionsDao(Configuration configuration) {
        super(Questions.QUESTIONS, lorgNew.tables.pojos.Questions.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(lorgNew.tables.pojos.Questions object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Questions> fetchById(Integer... values) {
        return fetch(Questions.QUESTIONS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public lorgNew.tables.pojos.Questions fetchOneById(Integer value) {
        return fetchOne(Questions.QUESTIONS.ID, value);
    }

    /**
     * Fetch records that have <code>userid IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Questions> fetchByUserid(Integer... values) {
        return fetch(Questions.QUESTIONS.USERID, values);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Questions> fetchByTitle(String... values) {
        return fetch(Questions.QUESTIONS.TITLE, values);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Questions> fetchByContent(String... values) {
        return fetch(Questions.QUESTIONS.CONTENT, values);
    }

    /**
     * Fetch records that have <code>views IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Questions> fetchByViews(Integer... values) {
        return fetch(Questions.QUESTIONS.VIEWS, values);
    }

    /**
     * Fetch records that have <code>slug IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Questions> fetchBySlug(String... values) {
        return fetch(Questions.QUESTIONS.SLUG, values);
    }

    /**
     * Fetch a unique record that has <code>slug = value</code>
     */
    public lorgNew.tables.pojos.Questions fetchOneBySlug(String value) {
        return fetchOne(Questions.QUESTIONS.SLUG, value);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Questions> fetchByStatus(String... values) {
        return fetch(Questions.QUESTIONS.STATUS, values);
    }

    /**
     * Fetch records that have <code>mailme IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Questions> fetchByMailme(Byte... values) {
        return fetch(Questions.QUESTIONS.MAILME, values);
    }

    /**
     * Fetch records that have <code>segment IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Questions> fetchBySegment(String... values) {
        return fetch(Questions.QUESTIONS.SEGMENT, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Questions> fetchByCreated(Timestamp... values) {
        return fetch(Questions.QUESTIONS.CREATED, values);
    }

    /**
     * Fetch records that have <code>updated IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Questions> fetchByUpdated(Timestamp... values) {
        return fetch(Questions.QUESTIONS.UPDATED, values);
    }
}