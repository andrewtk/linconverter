/*
 * This file is generated by jOOQ.
*/
package lorgNew.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import lorgNew.Indexes;
import lorgNew.Keys;
import lorgNew.Lorgnew;
import lorgNew.tables.records.UserToVotesRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class UserToVotes extends TableImpl<UserToVotesRecord> {

    private static final long serialVersionUID = 1781375878;

    /**
     * The reference instance of <code>lorgNew.user_to_votes</code>
     */
    public static final UserToVotes USER_TO_VOTES = new UserToVotes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserToVotesRecord> getRecordType() {
        return UserToVotesRecord.class;
    }

    /**
     * The column <code>lorgNew.user_to_votes.id</code>.
     */
    public final TableField<UserToVotesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>lorgNew.user_to_votes.usid</code>.
     */
    public final TableField<UserToVotesRecord, Integer> USID = createField("usid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>lorgNew.user_to_votes.qsid</code>.
     */
    public final TableField<UserToVotesRecord, Integer> QSID = createField("qsid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>lorgNew.user_to_votes.answid</code>.
     */
    public final TableField<UserToVotesRecord, Integer> ANSWID = createField("answid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>lorgNew.user_to_votes.comid</code>.
     */
    public final TableField<UserToVotesRecord, Integer> COMID = createField("comid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>lorgNew.user_to_votes.type</code>.
     */
    public final TableField<UserToVotesRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>lorgNew.user_to_votes</code> table reference
     */
    public UserToVotes() {
        this(DSL.name("user_to_votes"), null);
    }

    /**
     * Create an aliased <code>lorgNew.user_to_votes</code> table reference
     */
    public UserToVotes(String alias) {
        this(DSL.name(alias), USER_TO_VOTES);
    }

    /**
     * Create an aliased <code>lorgNew.user_to_votes</code> table reference
     */
    public UserToVotes(Name alias) {
        this(alias, USER_TO_VOTES);
    }

    private UserToVotes(Name alias, Table<UserToVotesRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserToVotes(Name alias, Table<UserToVotesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Lorgnew.LORGNEW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_TO_VOTES_IDX_BA3AAFFF5A90BB43, Indexes.USER_TO_VOTES_IDX_BA3AAFFF82BCB078, Indexes.USER_TO_VOTES_IDX_BA3AAFFFC51A3009, Indexes.USER_TO_VOTES_IDX_BA3AAFFFD5F22C14, Indexes.USER_TO_VOTES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<UserToVotesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER_TO_VOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserToVotesRecord> getPrimaryKey() {
        return Keys.KEY_USER_TO_VOTES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserToVotesRecord>> getKeys() {
        return Arrays.<UniqueKey<UserToVotesRecord>>asList(Keys.KEY_USER_TO_VOTES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserToVotes as(String alias) {
        return new UserToVotes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserToVotes as(Name alias) {
        return new UserToVotes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserToVotes rename(String name) {
        return new UserToVotes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserToVotes rename(Name name) {
        return new UserToVotes(name, null);
    }
}
