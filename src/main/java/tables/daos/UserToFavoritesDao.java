/*
 * This file is generated by jOOQ.
*/
package lorgNew.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import lorgNew.tables.UserToFavorites;
import lorgNew.tables.records.UserToFavoritesRecord;

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
public class UserToFavoritesDao extends DAOImpl<UserToFavoritesRecord, lorgNew.tables.pojos.UserToFavorites, Integer> {

    /**
     * Create a new UserToFavoritesDao without any configuration
     */
    public UserToFavoritesDao() {
        super(UserToFavorites.USER_TO_FAVORITES, lorgNew.tables.pojos.UserToFavorites.class);
    }

    /**
     * Create a new UserToFavoritesDao with an attached configuration
     */
    public UserToFavoritesDao(Configuration configuration) {
        super(UserToFavorites.USER_TO_FAVORITES, lorgNew.tables.pojos.UserToFavorites.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(lorgNew.tables.pojos.UserToFavorites object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<lorgNew.tables.pojos.UserToFavorites> fetchById(Integer... values) {
        return fetch(UserToFavorites.USER_TO_FAVORITES.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public lorgNew.tables.pojos.UserToFavorites fetchOneById(Integer value) {
        return fetchOne(UserToFavorites.USER_TO_FAVORITES.ID, value);
    }

    /**
     * Fetch records that have <code>usid IN (values)</code>
     */
    public List<lorgNew.tables.pojos.UserToFavorites> fetchByUsid(Integer... values) {
        return fetch(UserToFavorites.USER_TO_FAVORITES.USID, values);
    }

    /**
     * Fetch records that have <code>qsid IN (values)</code>
     */
    public List<lorgNew.tables.pojos.UserToFavorites> fetchByQsid(Integer... values) {
        return fetch(UserToFavorites.USER_TO_FAVORITES.QSID, values);
    }

    /**
     * Fetch records that have <code>answid IN (values)</code>
     */
    public List<lorgNew.tables.pojos.UserToFavorites> fetchByAnswid(Integer... values) {
        return fetch(UserToFavorites.USER_TO_FAVORITES.ANSWID, values);
    }

    /**
     * Fetch records that have <code>usidfav IN (values)</code>
     */
    public List<lorgNew.tables.pojos.UserToFavorites> fetchByUsidfav(Integer... values) {
        return fetch(UserToFavorites.USER_TO_FAVORITES.USIDFAV, values);
    }

    /**
     * Fetch records that have <code>topid IN (values)</code>
     */
    public List<lorgNew.tables.pojos.UserToFavorites> fetchByTopid(Integer... values) {
        return fetch(UserToFavorites.USER_TO_FAVORITES.TOPID, values);
    }
}