/*
 * This file is generated by jOOQ.
*/
package lorgNew.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import lorgNew.tables.FosUser;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
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
public class FosUserRecord extends UpdatableRecordImpl<FosUserRecord> implements Record20<Integer, String, String, String, String, Byte, String, String, Timestamp, String, Timestamp, String, Integer, Integer, Byte, String, String, String, String, String> {

    private static final long serialVersionUID = 515100906;

    /**
     * Setter for <code>lorgNew.fos_user.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>lorgNew.fos_user.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>lorgNew.fos_user.username_canonical</code>.
     */
    public void setUsernameCanonical(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.username_canonical</code>.
     */
    public String getUsernameCanonical() {
        return (String) get(2);
    }

    /**
     * Setter for <code>lorgNew.fos_user.email</code>.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.email</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>lorgNew.fos_user.email_canonical</code>.
     */
    public void setEmailCanonical(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.email_canonical</code>.
     */
    public String getEmailCanonical() {
        return (String) get(4);
    }

    /**
     * Setter for <code>lorgNew.fos_user.enabled</code>.
     */
    public void setEnabled(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.enabled</code>.
     */
    public Byte getEnabled() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>lorgNew.fos_user.salt</code>.
     */
    public void setSalt(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.salt</code>.
     */
    public String getSalt() {
        return (String) get(6);
    }

    /**
     * Setter for <code>lorgNew.fos_user.password</code>.
     */
    public void setPassword(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.password</code>.
     */
    public String getPassword() {
        return (String) get(7);
    }

    /**
     * Setter for <code>lorgNew.fos_user.last_login</code>.
     */
    public void setLastLogin(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.last_login</code>.
     */
    public Timestamp getLastLogin() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>lorgNew.fos_user.confirmation_token</code>.
     */
    public void setConfirmationToken(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.confirmation_token</code>.
     */
    public String getConfirmationToken() {
        return (String) get(9);
    }

    /**
     * Setter for <code>lorgNew.fos_user.password_requested_at</code>.
     */
    public void setPasswordRequestedAt(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.password_requested_at</code>.
     */
    public Timestamp getPasswordRequestedAt() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>lorgNew.fos_user.roles</code>. (DC2Type:array)
     */
    public void setRoles(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.roles</code>. (DC2Type:array)
     */
    public String getRoles() {
        return (String) get(11);
    }

    /**
     * Setter for <code>lorgNew.fos_user.userid</code>.
     */
    public void setUserid(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.userid</code>.
     */
    public Integer getUserid() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>lorgNew.fos_user.owner_id</code>.
     */
    public void setOwnerId(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.owner_id</code>.
     */
    public Integer getOwnerId() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>lorgNew.fos_user.is_owner</code>.
     */
    public void setIsOwner(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.is_owner</code>.
     */
    public Byte getIsOwner() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>lorgNew.fos_user.localize</code>.
     */
    public void setLocalize(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.localize</code>.
     */
    public String getLocalize() {
        return (String) get(15);
    }

    /**
     * Setter for <code>lorgNew.fos_user.slug</code>.
     */
    public void setSlug(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.slug</code>.
     */
    public String getSlug() {
        return (String) get(16);
    }

    /**
     * Setter for <code>lorgNew.fos_user.status</code>.
     */
    public void setStatus(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.status</code>.
     */
    public String getStatus() {
        return (String) get(17);
    }

    /**
     * Setter for <code>lorgNew.fos_user.cropic</code>.
     */
    public void setCropic(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.cropic</code>.
     */
    public String getCropic() {
        return (String) get(18);
    }

    /**
     * Setter for <code>lorgNew.fos_user.logo_url</code>.
     */
    public void setLogoUrl(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>lorgNew.fos_user.logo_url</code>.
     */
    public String getLogoUrl() {
        return (String) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, String, String, String, String, Byte, String, String, Timestamp, String, Timestamp, String, Integer, Integer, Byte, String, String, String, String, String> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, String, String, String, String, Byte, String, String, Timestamp, String, Timestamp, String, Integer, Integer, Byte, String, String, String, String, String> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return FosUser.FOS_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FosUser.FOS_USER.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FosUser.FOS_USER.USERNAME_CANONICAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FosUser.FOS_USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FosUser.FOS_USER.EMAIL_CANONICAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return FosUser.FOS_USER.ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return FosUser.FOS_USER.SALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FosUser.FOS_USER.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return FosUser.FOS_USER.LAST_LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return FosUser.FOS_USER.CONFIRMATION_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return FosUser.FOS_USER.PASSWORD_REQUESTED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return FosUser.FOS_USER.ROLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return FosUser.FOS_USER.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return FosUser.FOS_USER.OWNER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field15() {
        return FosUser.FOS_USER.IS_OWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return FosUser.FOS_USER.LOCALIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return FosUser.FOS_USER.SLUG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return FosUser.FOS_USER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return FosUser.FOS_USER.CROPIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return FosUser.FOS_USER.LOGO_URL;
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
    public String component2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUsernameCanonical();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEmailCanonical();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getLastLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getConfirmationToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getPasswordRequestedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getRoles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getOwnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component15() {
        return getIsOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getLocalize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getSlug();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component18() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getCropic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getLogoUrl();
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
    public String value2() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUsernameCanonical();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEmailCanonical();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getLastLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getConfirmationToken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getPasswordRequestedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getRoles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getOwnerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value15() {
        return getIsOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getLocalize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getSlug();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getCropic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getLogoUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value2(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value3(String value) {
        setUsernameCanonical(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value5(String value) {
        setEmailCanonical(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value6(Byte value) {
        setEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value7(String value) {
        setSalt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value8(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value9(Timestamp value) {
        setLastLogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value10(String value) {
        setConfirmationToken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value11(Timestamp value) {
        setPasswordRequestedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value12(String value) {
        setRoles(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value13(Integer value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value14(Integer value) {
        setOwnerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value15(Byte value) {
        setIsOwner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value16(String value) {
        setLocalize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value17(String value) {
        setSlug(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value18(String value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value19(String value) {
        setCropic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord value20(String value) {
        setLogoUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FosUserRecord values(Integer value1, String value2, String value3, String value4, String value5, Byte value6, String value7, String value8, Timestamp value9, String value10, Timestamp value11, String value12, Integer value13, Integer value14, Byte value15, String value16, String value17, String value18, String value19, String value20) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FosUserRecord
     */
    public FosUserRecord() {
        super(FosUser.FOS_USER);
    }

    /**
     * Create a detached, initialised FosUserRecord
     */
    public FosUserRecord(Integer id, String username, String usernameCanonical, String email, String emailCanonical, Byte enabled, String salt, String password, Timestamp lastLogin, String confirmationToken, Timestamp passwordRequestedAt, String roles, Integer userid, Integer ownerId, Byte isOwner, String localize, String slug, String status, String cropic, String logoUrl) {
        super(FosUser.FOS_USER);

        set(0, id);
        set(1, username);
        set(2, usernameCanonical);
        set(3, email);
        set(4, emailCanonical);
        set(5, enabled);
        set(6, salt);
        set(7, password);
        set(8, lastLogin);
        set(9, confirmationToken);
        set(10, passwordRequestedAt);
        set(11, roles);
        set(12, userid);
        set(13, ownerId);
        set(14, isOwner);
        set(15, localize);
        set(16, slug);
        set(17, status);
        set(18, cropic);
        set(19, logoUrl);
    }
}