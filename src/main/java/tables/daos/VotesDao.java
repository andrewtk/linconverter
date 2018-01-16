/*
 * This file is generated by jOOQ.
*/
package lorgNew.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import lorgNew.tables.Votes;
import lorgNew.tables.records.VotesRecord;

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
public class VotesDao extends DAOImpl<VotesRecord, lorgNew.tables.pojos.Votes, Integer> {

    /**
     * Create a new VotesDao without any configuration
     */
    public VotesDao() {
        super(Votes.VOTES, lorgNew.tables.pojos.Votes.class);
    }

    /**
     * Create a new VotesDao with an attached configuration
     */
    public VotesDao(Configuration configuration) {
        super(Votes.VOTES, lorgNew.tables.pojos.Votes.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(lorgNew.tables.pojos.Votes object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Votes> fetchById(Integer... values) {
        return fetch(Votes.VOTES.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public lorgNew.tables.pojos.Votes fetchOneById(Integer value) {
        return fetchOne(Votes.VOTES.ID, value);
    }

    /**
     * Fetch records that have <code>qsid IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Votes> fetchByQsid(Integer... values) {
        return fetch(Votes.VOTES.QSID, values);
    }

    /**
     * Fetch a unique record that has <code>qsid = value</code>
     */
    public lorgNew.tables.pojos.Votes fetchOneByQsid(Integer value) {
        return fetchOne(Votes.VOTES.QSID, value);
    }

    /**
     * Fetch records that have <code>answid IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Votes> fetchByAnswid(Integer... values) {
        return fetch(Votes.VOTES.ANSWID, values);
    }

    /**
     * Fetch a unique record that has <code>answid = value</code>
     */
    public lorgNew.tables.pojos.Votes fetchOneByAnswid(Integer value) {
        return fetchOne(Votes.VOTES.ANSWID, value);
    }

    /**
     * Fetch records that have <code>comid IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Votes> fetchByComid(Integer... values) {
        return fetch(Votes.VOTES.COMID, values);
    }

    /**
     * Fetch a unique record that has <code>comid = value</code>
     */
    public lorgNew.tables.pojos.Votes fetchOneByComid(Integer value) {
        return fetchOne(Votes.VOTES.COMID, value);
    }

    /**
     * Fetch records that have <code>balance IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Votes> fetchByBalance(Integer... values) {
        return fetch(Votes.VOTES.BALANCE, values);
    }

    /**
     * Fetch records that have <code>upvotes IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Votes> fetchByUpvotes(Integer... values) {
        return fetch(Votes.VOTES.UPVOTES, values);
    }

    /**
     * Fetch records that have <code>downvotes IN (values)</code>
     */
    public List<lorgNew.tables.pojos.Votes> fetchByDownvotes(Integer... values) {
        return fetch(Votes.VOTES.DOWNVOTES, values);
    }
}
