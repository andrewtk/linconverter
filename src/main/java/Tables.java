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


/**
 * Convenience access to all tables in lorgNew
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>lorgNew.answers</code>.
     */
    public static final Answers ANSWERS = lorgNew.tables.Answers.ANSWERS;

    /**
     * The table <code>lorgNew.closed</code>.
     */
    public static final Closed CLOSED = lorgNew.tables.Closed.CLOSED;

    /**
     * The table <code>lorgNew.comments</code>.
     */
    public static final Comments COMMENTS = lorgNew.tables.Comments.COMMENTS;

    /**
     * The table <code>lorgNew.fos_user</code>.
     */
    public static final FosUser FOS_USER = lorgNew.tables.FosUser.FOS_USER;

    /**
     * The table <code>lorgNew.logger</code>.
     */
    public static final Logger LOGGER = lorgNew.tables.Logger.LOGGER;

    /**
     * The table <code>lorgNew.logger_actions</code>.
     */
    public static final LoggerActions LOGGER_ACTIONS = lorgNew.tables.LoggerActions.LOGGER_ACTIONS;

    /**
     * The table <code>lorgNew.messages</code>.
     */
    public static final Messages MESSAGES = lorgNew.tables.Messages.MESSAGES;

    /**
     * The table <code>lorgNew.permissions</code>.
     */
    public static final Permissions PERMISSIONS = lorgNew.tables.Permissions.PERMISSIONS;

    /**
     * The table <code>lorgNew.qs_to_topic</code>.
     */
    public static final QsToTopic QS_TO_TOPIC = lorgNew.tables.QsToTopic.QS_TO_TOPIC;

    /**
     * The table <code>lorgNew.questions</code>.
     */
    public static final Questions QUESTIONS = lorgNew.tables.Questions.QUESTIONS;

    /**
     * The table <code>lorgNew.roles</code>.
     */
    public static final Roles ROLES = lorgNew.tables.Roles.ROLES;

    /**
     * The table <code>lorgNew.routes</code>.
     */
    public static final Routes ROUTES = lorgNew.tables.Routes.ROUTES;

    /**
     * The table <code>lorgNew.seo_profile</code>.
     */
    public static final SeoProfile SEO_PROFILE = lorgNew.tables.SeoProfile.SEO_PROFILE;

    /**
     * The table <code>lorgNew.seo_redirect</code>.
     */
    public static final SeoRedirect SEO_REDIRECT = lorgNew.tables.SeoRedirect.SEO_REDIRECT;

    /**
     * The table <code>lorgNew.seo_stationary</code>.
     */
    public static final SeoStationary SEO_STATIONARY = lorgNew.tables.SeoStationary.SEO_STATIONARY;

    /**
     * The table <code>lorgNew.topics</code>.
     */
    public static final Topics TOPICS = lorgNew.tables.Topics.TOPICS;

    /**
     * The table <code>lorgNew.user_profile</code>.
     */
    public static final UserProfile USER_PROFILE = lorgNew.tables.UserProfile.USER_PROFILE;

    /**
     * The table <code>lorgNew.user_to_favorites</code>.
     */
    public static final UserToFavorites USER_TO_FAVORITES = lorgNew.tables.UserToFavorites.USER_TO_FAVORITES;

    /**
     * The table <code>lorgNew.user_to_votes</code>.
     */
    public static final UserToVotes USER_TO_VOTES = lorgNew.tables.UserToVotes.USER_TO_VOTES;

    /**
     * The table <code>lorgNew.votes</code>.
     */
    public static final Votes VOTES = lorgNew.tables.Votes.VOTES;
}