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
import lorgNew.tables.records.VotesRecord;

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
public class Votes extends TableImpl<VotesRecord> {

    private static final long serialVersionUID = -1004622682;

    /**
     * The reference instance of <code>lorgNew.votes</code>
     */
    public static final Votes VOTES = new Votes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VotesRecord> getRecordType() {
        return VotesRecord.class;
    }

    /**
     * The column <code>lorgNew.votes.id</code>.
     */
    public final TableField<VotesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>lorgNew.votes.qsid</code>.
     */
    public final TableField<VotesRecord, Integer> QSID = createField("qsid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>lorgNew.votes.answid</code>.
     */
    public final TableField<VotesRecord, Integer> ANSWID = createField("answid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>lorgNew.votes.comid</code>.
     */
    public final TableField<VotesRecord, Integer> COMID = createField("comid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>lorgNew.votes.balance</code>.
     */
    public final TableField<VotesRecord, Integer> BALANCE = createField("balance", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>lorgNew.votes.upvotes</code>.
     */
    public final TableField<VotesRecord, Integer> UPVOTES = createField("upvotes", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>lorgNew.votes.downvotes</code>.
     */
    public final TableField<VotesRecord, Integer> DOWNVOTES = createField("downvotes", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>lorgNew.votes</code> table reference
     */
    public Votes() {
        this(DSL.name("votes"), null);
    }

    /**
     * Create an aliased <code>lorgNew.votes</code> table reference
     */
    public Votes(String alias) {
        this(DSL.name(alias), VOTES);
    }

    /**
     * Create an aliased <code>lorgNew.votes</code> table reference
     */
    public Votes(Name alias) {
        this(alias, VOTES);
    }

    private Votes(Name alias, Table<VotesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Votes(Name alias, Table<VotesRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.VOTES_PRIMARY, Indexes.VOTES_UNIQ_518B7ACF5A90BB43, Indexes.VOTES_UNIQ_518B7ACF82BCB078, Indexes.VOTES_UNIQ_518B7ACFC51A3009);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<VotesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_VOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VotesRecord> getPrimaryKey() {
        return Keys.KEY_VOTES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VotesRecord>> getKeys() {
        return Arrays.<UniqueKey<VotesRecord>>asList(Keys.KEY_VOTES_PRIMARY, Keys.KEY_VOTES_UNIQ_518B7ACF5A90BB43, Keys.KEY_VOTES_UNIQ_518B7ACF82BCB078, Keys.KEY_VOTES_UNIQ_518B7ACFC51A3009);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Votes as(String alias) {
        return new Votes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Votes as(Name alias) {
        return new Votes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Votes rename(String name) {
        return new Votes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Votes rename(Name name) {
        return new Votes(name, null);
    }
}