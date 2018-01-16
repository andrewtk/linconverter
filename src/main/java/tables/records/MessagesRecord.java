/*
 * This file is generated by jOOQ.
*/
package lorgNew.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import lorgNew.tables.Messages;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class MessagesRecord extends UpdatableRecordImpl<MessagesRecord> implements Record9<Integer, Integer, Integer, String, String, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 781947329;

    /**
     * Setter for <code>lorgNew.messages.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>lorgNew.messages.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>lorgNew.messages.user_from</code>.
     */
    public void setUserFrom(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>lorgNew.messages.user_from</code>.
     */
    public Integer getUserFrom() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>lorgNew.messages.user_to</code>.
     */
    public void setUserTo(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>lorgNew.messages.user_to</code>.
     */
    public Integer getUserTo() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>lorgNew.messages.message</code>.
     */
    public void setMessage(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>lorgNew.messages.message</code>.
     */
    public String getMessage() {
        return (String) get(3);
    }

    /**
     * Setter for <code>lorgNew.messages.title</code>.
     */
    public void setTitle(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>lorgNew.messages.title</code>.
     */
    public String getTitle() {
        return (String) get(4);
    }

    /**
     * Setter for <code>lorgNew.messages.status</code>.
     */
    public void setStatus(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>lorgNew.messages.status</code>.
     */
    public String getStatus() {
        return (String) get(5);
    }

    /**
     * Setter for <code>lorgNew.messages.is_new</code>.
     */
    public void setIsNew(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>lorgNew.messages.is_new</code>.
     */
    public Byte getIsNew() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>lorgNew.messages.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>lorgNew.messages.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>lorgNew.messages.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>lorgNew.messages.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, String, String, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, String, String, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Messages.MESSAGES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Messages.MESSAGES.USER_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Messages.MESSAGES.USER_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Messages.MESSAGES.MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Messages.MESSAGES.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Messages.MESSAGES.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return Messages.MESSAGES.IS_NEW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Messages.MESSAGES.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return Messages.MESSAGES.UPDATED;
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
        return getUserFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getUserTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getIsNew();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getUpdated();
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
        return getUserFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getUserTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getIsNew();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord value2(Integer value) {
        setUserFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord value3(Integer value) {
        setUserTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord value4(String value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord value5(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord value6(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord value7(Byte value) {
        setIsNew(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord value8(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord value9(Timestamp value) {
        setUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord values(Integer value1, Integer value2, Integer value3, String value4, String value5, String value6, Byte value7, Timestamp value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MessagesRecord
     */
    public MessagesRecord() {
        super(Messages.MESSAGES);
    }

    /**
     * Create a detached, initialised MessagesRecord
     */
    public MessagesRecord(Integer id, Integer userFrom, Integer userTo, String message, String title, String status, Byte isNew, Timestamp created, Timestamp updated) {
        super(Messages.MESSAGES);

        set(0, id);
        set(1, userFrom);
        set(2, userTo);
        set(3, message);
        set(4, title);
        set(5, status);
        set(6, isNew);
        set(7, created);
        set(8, updated);
    }
}