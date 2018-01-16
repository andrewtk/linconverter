/*
 * This file is generated by jOOQ.
*/
package lorgNew.tables.records;


import javax.annotation.Generated;

import lorgNew.tables.UserToVotes;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class UserToVotesRecord extends UpdatableRecordImpl<UserToVotesRecord> implements Record6<Integer, Integer, Integer, Integer, Integer, String> {

    private static final long serialVersionUID = 68594429;

    /**
     * Setter for <code>lorgNew.user_to_votes.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>lorgNew.user_to_votes.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>lorgNew.user_to_votes.usid</code>.
     */
    public void setUsid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>lorgNew.user_to_votes.usid</code>.
     */
    public Integer getUsid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>lorgNew.user_to_votes.qsid</code>.
     */
    public void setQsid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>lorgNew.user_to_votes.qsid</code>.
     */
    public Integer getQsid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>lorgNew.user_to_votes.answid</code>.
     */
    public void setAnswid(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>lorgNew.user_to_votes.answid</code>.
     */
    public Integer getAnswid() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>lorgNew.user_to_votes.comid</code>.
     */
    public void setComid(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>lorgNew.user_to_votes.comid</code>.
     */
    public Integer getComid() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>lorgNew.user_to_votes.type</code>.
     */
    public void setType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>lorgNew.user_to_votes.type</code>.
     */
    public String getType() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Integer, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Integer, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UserToVotes.USER_TO_VOTES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return UserToVotes.USER_TO_VOTES.USID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return UserToVotes.USER_TO_VOTES.QSID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return UserToVotes.USER_TO_VOTES.ANSWID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return UserToVotes.USER_TO_VOTES.COMID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return UserToVotes.USER_TO_VOTES.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getUsid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getQsid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getAnswid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getComid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUsid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getQsid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAnswid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getComid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserToVotesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserToVotesRecord value2(Integer value) {
        setUsid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserToVotesRecord value3(Integer value) {
        setQsid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserToVotesRecord value4(Integer value) {
        setAnswid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserToVotesRecord value5(Integer value) {
        setComid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserToVotesRecord value6(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserToVotesRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserToVotesRecord
     */
    public UserToVotesRecord() {
        super(UserToVotes.USER_TO_VOTES);
    }

    /**
     * Create a detached, initialised UserToVotesRecord
     */
    public UserToVotesRecord(Integer id, Integer usid, Integer qsid, Integer answid, Integer comid, String type) {
        super(UserToVotes.USER_TO_VOTES);

        set(0, id);
        set(1, usid);
        set(2, qsid);
        set(3, answid);
        set(4, comid);
        set(5, type);
    }
}
