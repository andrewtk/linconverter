/*
 * This file is generated by jOOQ.
*/
package lorgNew;


import javax.annotation.Generated;

import lorgNew.tables.Answers;
import lorgNew.tables.Closed;
import lorgNew.tables.Comments;
import lorgNew.tables.FosUser;
import lorgNew.tables.Logger;
import lorgNew.tables.LoggerActions;
import lorgNew.tables.Messages;
import lorgNew.tables.Permissions;
import lorgNew.tables.QsToTopic;
import lorgNew.tables.Questions;
import lorgNew.tables.Roles;
import lorgNew.tables.Routes;
import lorgNew.tables.SeoProfile;
import lorgNew.tables.SeoRedirect;
import lorgNew.tables.SeoStationary;
import lorgNew.tables.Topics;
import lorgNew.tables.UserProfile;
import lorgNew.tables.UserToFavorites;
import lorgNew.tables.UserToVotes;
import lorgNew.tables.Votes;
import lorgNew.tables.records.AnswersRecord;
import lorgNew.tables.records.ClosedRecord;
import lorgNew.tables.records.CommentsRecord;
import lorgNew.tables.records.FosUserRecord;
import lorgNew.tables.records.LoggerActionsRecord;
import lorgNew.tables.records.LoggerRecord;
import lorgNew.tables.records.MessagesRecord;
import lorgNew.tables.records.PermissionsRecord;
import lorgNew.tables.records.QsToTopicRecord;
import lorgNew.tables.records.QuestionsRecord;
import lorgNew.tables.records.RolesRecord;
import lorgNew.tables.records.RoutesRecord;
import lorgNew.tables.records.SeoProfileRecord;
import lorgNew.tables.records.SeoRedirectRecord;
import lorgNew.tables.records.SeoStationaryRecord;
import lorgNew.tables.records.TopicsRecord;
import lorgNew.tables.records.UserProfileRecord;
import lorgNew.tables.records.UserToFavoritesRecord;
import lorgNew.tables.records.UserToVotesRecord;
import lorgNew.tables.records.VotesRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>lorgNew</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AnswersRecord, Integer> IDENTITY_ANSWERS = Identities0.IDENTITY_ANSWERS;
    public static final Identity<ClosedRecord, Integer> IDENTITY_CLOSED = Identities0.IDENTITY_CLOSED;
    public static final Identity<CommentsRecord, Integer> IDENTITY_COMMENTS = Identities0.IDENTITY_COMMENTS;
    public static final Identity<FosUserRecord, Integer> IDENTITY_FOS_USER = Identities0.IDENTITY_FOS_USER;
    public static final Identity<LoggerRecord, Integer> IDENTITY_LOGGER = Identities0.IDENTITY_LOGGER;
    public static final Identity<LoggerActionsRecord, Integer> IDENTITY_LOGGER_ACTIONS = Identities0.IDENTITY_LOGGER_ACTIONS;
    public static final Identity<MessagesRecord, Integer> IDENTITY_MESSAGES = Identities0.IDENTITY_MESSAGES;
    public static final Identity<PermissionsRecord, Integer> IDENTITY_PERMISSIONS = Identities0.IDENTITY_PERMISSIONS;
    public static final Identity<QsToTopicRecord, Integer> IDENTITY_QS_TO_TOPIC = Identities0.IDENTITY_QS_TO_TOPIC;
    public static final Identity<QuestionsRecord, Integer> IDENTITY_QUESTIONS = Identities0.IDENTITY_QUESTIONS;
    public static final Identity<RolesRecord, Integer> IDENTITY_ROLES = Identities0.IDENTITY_ROLES;
    public static final Identity<RoutesRecord, Integer> IDENTITY_ROUTES = Identities0.IDENTITY_ROUTES;
    public static final Identity<SeoProfileRecord, Integer> IDENTITY_SEO_PROFILE = Identities0.IDENTITY_SEO_PROFILE;
    public static final Identity<SeoRedirectRecord, Integer> IDENTITY_SEO_REDIRECT = Identities0.IDENTITY_SEO_REDIRECT;
    public static final Identity<SeoStationaryRecord, Integer> IDENTITY_SEO_STATIONARY = Identities0.IDENTITY_SEO_STATIONARY;
    public static final Identity<TopicsRecord, Integer> IDENTITY_TOPICS = Identities0.IDENTITY_TOPICS;
    public static final Identity<UserProfileRecord, Integer> IDENTITY_USER_PROFILE = Identities0.IDENTITY_USER_PROFILE;
    public static final Identity<UserToFavoritesRecord, Integer> IDENTITY_USER_TO_FAVORITES = Identities0.IDENTITY_USER_TO_FAVORITES;
    public static final Identity<UserToVotesRecord, Integer> IDENTITY_USER_TO_VOTES = Identities0.IDENTITY_USER_TO_VOTES;
    public static final Identity<VotesRecord, Integer> IDENTITY_VOTES = Identities0.IDENTITY_VOTES;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AnswersRecord> KEY_ANSWERS_PRIMARY = UniqueKeys0.KEY_ANSWERS_PRIMARY;
    public static final UniqueKey<AnswersRecord> KEY_ANSWERS_UNIQ_50D0C606989D9B62 = UniqueKeys0.KEY_ANSWERS_UNIQ_50D0C606989D9B62;
    public static final UniqueKey<ClosedRecord> KEY_CLOSED_PRIMARY = UniqueKeys0.KEY_CLOSED_PRIMARY;
    public static final UniqueKey<CommentsRecord> KEY_COMMENTS_PRIMARY = UniqueKeys0.KEY_COMMENTS_PRIMARY;
    public static final UniqueKey<FosUserRecord> KEY_FOS_USER_PRIMARY = UniqueKeys0.KEY_FOS_USER_PRIMARY;
    public static final UniqueKey<FosUserRecord> KEY_FOS_USER_UNIQ_957A647992FC23A8 = UniqueKeys0.KEY_FOS_USER_UNIQ_957A647992FC23A8;
    public static final UniqueKey<FosUserRecord> KEY_FOS_USER_UNIQ_957A6479A0D96FBF = UniqueKeys0.KEY_FOS_USER_UNIQ_957A6479A0D96FBF;
    public static final UniqueKey<FosUserRecord> KEY_FOS_USER_UNIQ_957A6479C05FB297 = UniqueKeys0.KEY_FOS_USER_UNIQ_957A6479C05FB297;
    public static final UniqueKey<FosUserRecord> KEY_FOS_USER_UNIQ_957A6479989D9B62 = UniqueKeys0.KEY_FOS_USER_UNIQ_957A6479989D9B62;
    public static final UniqueKey<LoggerRecord> KEY_LOGGER_PRIMARY = UniqueKeys0.KEY_LOGGER_PRIMARY;
    public static final UniqueKey<LoggerActionsRecord> KEY_LOGGER_ACTIONS_PRIMARY = UniqueKeys0.KEY_LOGGER_ACTIONS_PRIMARY;
    public static final UniqueKey<MessagesRecord> KEY_MESSAGES_PRIMARY = UniqueKeys0.KEY_MESSAGES_PRIMARY;
    public static final UniqueKey<PermissionsRecord> KEY_PERMISSIONS_PRIMARY = UniqueKeys0.KEY_PERMISSIONS_PRIMARY;
    public static final UniqueKey<QsToTopicRecord> KEY_QS_TO_TOPIC_PRIMARY = UniqueKeys0.KEY_QS_TO_TOPIC_PRIMARY;
    public static final UniqueKey<QuestionsRecord> KEY_QUESTIONS_PRIMARY = UniqueKeys0.KEY_QUESTIONS_PRIMARY;
    public static final UniqueKey<QuestionsRecord> KEY_QUESTIONS_UNIQ_8ADC54D5989D9B62 = UniqueKeys0.KEY_QUESTIONS_UNIQ_8ADC54D5989D9B62;
    public static final UniqueKey<RolesRecord> KEY_ROLES_PRIMARY = UniqueKeys0.KEY_ROLES_PRIMARY;
    public static final UniqueKey<RoutesRecord> KEY_ROUTES_PRIMARY = UniqueKeys0.KEY_ROUTES_PRIMARY;
    public static final UniqueKey<SeoProfileRecord> KEY_SEO_PROFILE_PRIMARY = UniqueKeys0.KEY_SEO_PROFILE_PRIMARY;
    public static final UniqueKey<SeoRedirectRecord> KEY_SEO_REDIRECT_PRIMARY = UniqueKeys0.KEY_SEO_REDIRECT_PRIMARY;
    public static final UniqueKey<SeoStationaryRecord> KEY_SEO_STATIONARY_PRIMARY = UniqueKeys0.KEY_SEO_STATIONARY_PRIMARY;
    public static final UniqueKey<TopicsRecord> KEY_TOPICS_PRIMARY = UniqueKeys0.KEY_TOPICS_PRIMARY;
    public static final UniqueKey<TopicsRecord> KEY_TOPICS_UNIQ_91F64639989D9B62 = UniqueKeys0.KEY_TOPICS_UNIQ_91F64639989D9B62;
    public static final UniqueKey<UserProfileRecord> KEY_USER_PROFILE_PRIMARY = UniqueKeys0.KEY_USER_PROFILE_PRIMARY;
    public static final UniqueKey<UserToFavoritesRecord> KEY_USER_TO_FAVORITES_PRIMARY = UniqueKeys0.KEY_USER_TO_FAVORITES_PRIMARY;
    public static final UniqueKey<UserToVotesRecord> KEY_USER_TO_VOTES_PRIMARY = UniqueKeys0.KEY_USER_TO_VOTES_PRIMARY;
    public static final UniqueKey<VotesRecord> KEY_VOTES_PRIMARY = UniqueKeys0.KEY_VOTES_PRIMARY;
    public static final UniqueKey<VotesRecord> KEY_VOTES_UNIQ_518B7ACF5A90BB43 = UniqueKeys0.KEY_VOTES_UNIQ_518B7ACF5A90BB43;
    public static final UniqueKey<VotesRecord> KEY_VOTES_UNIQ_518B7ACF82BCB078 = UniqueKeys0.KEY_VOTES_UNIQ_518B7ACF82BCB078;
    public static final UniqueKey<VotesRecord> KEY_VOTES_UNIQ_518B7ACFC51A3009 = UniqueKeys0.KEY_VOTES_UNIQ_518B7ACFC51A3009;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AnswersRecord, Integer> IDENTITY_ANSWERS = createIdentity(Answers.ANSWERS, Answers.ANSWERS.ID);
        public static Identity<ClosedRecord, Integer> IDENTITY_CLOSED = createIdentity(Closed.CLOSED, Closed.CLOSED.ID);
        public static Identity<CommentsRecord, Integer> IDENTITY_COMMENTS = createIdentity(Comments.COMMENTS, Comments.COMMENTS.ID);
        public static Identity<FosUserRecord, Integer> IDENTITY_FOS_USER = createIdentity(FosUser.FOS_USER, FosUser.FOS_USER.ID);
        public static Identity<LoggerRecord, Integer> IDENTITY_LOGGER = createIdentity(Logger.LOGGER, Logger.LOGGER.ID);
        public static Identity<LoggerActionsRecord, Integer> IDENTITY_LOGGER_ACTIONS = createIdentity(LoggerActions.LOGGER_ACTIONS, LoggerActions.LOGGER_ACTIONS.ID);
        public static Identity<MessagesRecord, Integer> IDENTITY_MESSAGES = createIdentity(Messages.MESSAGES, Messages.MESSAGES.ID);
        public static Identity<PermissionsRecord, Integer> IDENTITY_PERMISSIONS = createIdentity(Permissions.PERMISSIONS, Permissions.PERMISSIONS.ID);
        public static Identity<QsToTopicRecord, Integer> IDENTITY_QS_TO_TOPIC = createIdentity(QsToTopic.QS_TO_TOPIC, QsToTopic.QS_TO_TOPIC.ID);
        public static Identity<QuestionsRecord, Integer> IDENTITY_QUESTIONS = createIdentity(Questions.QUESTIONS, Questions.QUESTIONS.ID);
        public static Identity<RolesRecord, Integer> IDENTITY_ROLES = createIdentity(Roles.ROLES, Roles.ROLES.ID);
        public static Identity<RoutesRecord, Integer> IDENTITY_ROUTES = createIdentity(Routes.ROUTES, Routes.ROUTES.ID);
        public static Identity<SeoProfileRecord, Integer> IDENTITY_SEO_PROFILE = createIdentity(SeoProfile.SEO_PROFILE, SeoProfile.SEO_PROFILE.ID);
        public static Identity<SeoRedirectRecord, Integer> IDENTITY_SEO_REDIRECT = createIdentity(SeoRedirect.SEO_REDIRECT, SeoRedirect.SEO_REDIRECT.ID);
        public static Identity<SeoStationaryRecord, Integer> IDENTITY_SEO_STATIONARY = createIdentity(SeoStationary.SEO_STATIONARY, SeoStationary.SEO_STATIONARY.ID);
        public static Identity<TopicsRecord, Integer> IDENTITY_TOPICS = createIdentity(Topics.TOPICS, Topics.TOPICS.ID);
        public static Identity<UserProfileRecord, Integer> IDENTITY_USER_PROFILE = createIdentity(UserProfile.USER_PROFILE, UserProfile.USER_PROFILE.ID);
        public static Identity<UserToFavoritesRecord, Integer> IDENTITY_USER_TO_FAVORITES = createIdentity(UserToFavorites.USER_TO_FAVORITES, UserToFavorites.USER_TO_FAVORITES.ID);
        public static Identity<UserToVotesRecord, Integer> IDENTITY_USER_TO_VOTES = createIdentity(UserToVotes.USER_TO_VOTES, UserToVotes.USER_TO_VOTES.ID);
        public static Identity<VotesRecord, Integer> IDENTITY_VOTES = createIdentity(Votes.VOTES, Votes.VOTES.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AnswersRecord> KEY_ANSWERS_PRIMARY = createUniqueKey(Answers.ANSWERS, "KEY_answers_PRIMARY", Answers.ANSWERS.ID);
        public static final UniqueKey<AnswersRecord> KEY_ANSWERS_UNIQ_50D0C606989D9B62 = createUniqueKey(Answers.ANSWERS, "KEY_answers_UNIQ_50D0C606989D9B62", Answers.ANSWERS.SLUG);
        public static final UniqueKey<ClosedRecord> KEY_CLOSED_PRIMARY = createUniqueKey(Closed.CLOSED, "KEY_closed_PRIMARY", Closed.CLOSED.ID);
        public static final UniqueKey<CommentsRecord> KEY_COMMENTS_PRIMARY = createUniqueKey(Comments.COMMENTS, "KEY_comments_PRIMARY", Comments.COMMENTS.ID);
        public static final UniqueKey<FosUserRecord> KEY_FOS_USER_PRIMARY = createUniqueKey(FosUser.FOS_USER, "KEY_fos_user_PRIMARY", FosUser.FOS_USER.ID);
        public static final UniqueKey<FosUserRecord> KEY_FOS_USER_UNIQ_957A647992FC23A8 = createUniqueKey(FosUser.FOS_USER, "KEY_fos_user_UNIQ_957A647992FC23A8", FosUser.FOS_USER.USERNAME_CANONICAL);
        public static final UniqueKey<FosUserRecord> KEY_FOS_USER_UNIQ_957A6479A0D96FBF = createUniqueKey(FosUser.FOS_USER, "KEY_fos_user_UNIQ_957A6479A0D96FBF", FosUser.FOS_USER.EMAIL_CANONICAL);
        public static final UniqueKey<FosUserRecord> KEY_FOS_USER_UNIQ_957A6479C05FB297 = createUniqueKey(FosUser.FOS_USER, "KEY_fos_user_UNIQ_957A6479C05FB297", FosUser.FOS_USER.CONFIRMATION_TOKEN);
        public static final UniqueKey<FosUserRecord> KEY_FOS_USER_UNIQ_957A6479989D9B62 = createUniqueKey(FosUser.FOS_USER, "KEY_fos_user_UNIQ_957A6479989D9B62", FosUser.FOS_USER.SLUG);
        public static final UniqueKey<LoggerRecord> KEY_LOGGER_PRIMARY = createUniqueKey(Logger.LOGGER, "KEY_logger_PRIMARY", Logger.LOGGER.ID);
        public static final UniqueKey<LoggerActionsRecord> KEY_LOGGER_ACTIONS_PRIMARY = createUniqueKey(LoggerActions.LOGGER_ACTIONS, "KEY_logger_actions_PRIMARY", LoggerActions.LOGGER_ACTIONS.ID);
        public static final UniqueKey<MessagesRecord> KEY_MESSAGES_PRIMARY = createUniqueKey(Messages.MESSAGES, "KEY_messages_PRIMARY", Messages.MESSAGES.ID);
        public static final UniqueKey<PermissionsRecord> KEY_PERMISSIONS_PRIMARY = createUniqueKey(Permissions.PERMISSIONS, "KEY_permissions_PRIMARY", Permissions.PERMISSIONS.ID);
        public static final UniqueKey<QsToTopicRecord> KEY_QS_TO_TOPIC_PRIMARY = createUniqueKey(QsToTopic.QS_TO_TOPIC, "KEY_qs_to_topic_PRIMARY", QsToTopic.QS_TO_TOPIC.ID);
        public static final UniqueKey<QuestionsRecord> KEY_QUESTIONS_PRIMARY = createUniqueKey(Questions.QUESTIONS, "KEY_questions_PRIMARY", Questions.QUESTIONS.ID);
        public static final UniqueKey<QuestionsRecord> KEY_QUESTIONS_UNIQ_8ADC54D5989D9B62 = createUniqueKey(Questions.QUESTIONS, "KEY_questions_UNIQ_8ADC54D5989D9B62", Questions.QUESTIONS.SLUG);
        public static final UniqueKey<RolesRecord> KEY_ROLES_PRIMARY = createUniqueKey(Roles.ROLES, "KEY_roles_PRIMARY", Roles.ROLES.ID);
        public static final UniqueKey<RoutesRecord> KEY_ROUTES_PRIMARY = createUniqueKey(Routes.ROUTES, "KEY_routes_PRIMARY", Routes.ROUTES.ID);
        public static final UniqueKey<SeoProfileRecord> KEY_SEO_PROFILE_PRIMARY = createUniqueKey(SeoProfile.SEO_PROFILE, "KEY_seo_profile_PRIMARY", SeoProfile.SEO_PROFILE.ID);
        public static final UniqueKey<SeoRedirectRecord> KEY_SEO_REDIRECT_PRIMARY = createUniqueKey(SeoRedirect.SEO_REDIRECT, "KEY_seo_redirect_PRIMARY", SeoRedirect.SEO_REDIRECT.ID);
        public static final UniqueKey<SeoStationaryRecord> KEY_SEO_STATIONARY_PRIMARY = createUniqueKey(SeoStationary.SEO_STATIONARY, "KEY_seo_stationary_PRIMARY", SeoStationary.SEO_STATIONARY.ID);
        public static final UniqueKey<TopicsRecord> KEY_TOPICS_PRIMARY = createUniqueKey(Topics.TOPICS, "KEY_topics_PRIMARY", Topics.TOPICS.ID);
        public static final UniqueKey<TopicsRecord> KEY_TOPICS_UNIQ_91F64639989D9B62 = createUniqueKey(Topics.TOPICS, "KEY_topics_UNIQ_91F64639989D9B62", Topics.TOPICS.SLUG);
        public static final UniqueKey<UserProfileRecord> KEY_USER_PROFILE_PRIMARY = createUniqueKey(UserProfile.USER_PROFILE, "KEY_user_profile_PRIMARY", UserProfile.USER_PROFILE.ID);
        public static final UniqueKey<UserToFavoritesRecord> KEY_USER_TO_FAVORITES_PRIMARY = createUniqueKey(UserToFavorites.USER_TO_FAVORITES, "KEY_user_to_favorites_PRIMARY", UserToFavorites.USER_TO_FAVORITES.ID);
        public static final UniqueKey<UserToVotesRecord> KEY_USER_TO_VOTES_PRIMARY = createUniqueKey(UserToVotes.USER_TO_VOTES, "KEY_user_to_votes_PRIMARY", UserToVotes.USER_TO_VOTES.ID);
        public static final UniqueKey<VotesRecord> KEY_VOTES_PRIMARY = createUniqueKey(Votes.VOTES, "KEY_votes_PRIMARY", Votes.VOTES.ID);
        public static final UniqueKey<VotesRecord> KEY_VOTES_UNIQ_518B7ACF5A90BB43 = createUniqueKey(Votes.VOTES, "KEY_votes_UNIQ_518B7ACF5A90BB43", Votes.VOTES.QSID);
        public static final UniqueKey<VotesRecord> KEY_VOTES_UNIQ_518B7ACF82BCB078 = createUniqueKey(Votes.VOTES, "KEY_votes_UNIQ_518B7ACF82BCB078", Votes.VOTES.ANSWID);
        public static final UniqueKey<VotesRecord> KEY_VOTES_UNIQ_518B7ACFC51A3009 = createUniqueKey(Votes.VOTES, "KEY_votes_UNIQ_518B7ACFC51A3009", Votes.VOTES.COMID);
    }
}
