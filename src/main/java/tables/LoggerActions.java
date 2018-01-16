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
import lorgNew.tables.records.LoggerActionsRecord;

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
public class LoggerActions extends TableImpl<LoggerActionsRecord> {

    private static final long serialVersionUID = 757542560;

    /**
     * The reference instance of <code>lorgNew.logger_actions</code>
     */
    public static final LoggerActions LOGGER_ACTIONS = new LoggerActions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LoggerActionsRecord> getRecordType() {
        return LoggerActionsRecord.class;
    }

    /**
     * The column <code>lorgNew.logger_actions.id</code>.
     */
    public final TableField<LoggerActionsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>lorgNew.logger_actions.action</code>.
     */
    public final TableField<LoggerActionsRecord, String> ACTION = createField("action", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>lorgNew.logger_actions.title</code>.
     */
    public final TableField<LoggerActionsRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>lorgNew.logger_actions</code> table reference
     */
    public LoggerActions() {
        this(DSL.name("logger_actions"), null);
    }

    /**
     * Create an aliased <code>lorgNew.logger_actions</code> table reference
     */
    public LoggerActions(String alias) {
        this(DSL.name(alias), LOGGER_ACTIONS);
    }

    /**
     * Create an aliased <code>lorgNew.logger_actions</code> table reference
     */
    public LoggerActions(Name alias) {
        this(alias, LOGGER_ACTIONS);
    }

    private LoggerActions(Name alias, Table<LoggerActionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private LoggerActions(Name alias, Table<LoggerActionsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.LOGGER_ACTIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LoggerActionsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LOGGER_ACTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LoggerActionsRecord> getPrimaryKey() {
        return Keys.KEY_LOGGER_ACTIONS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LoggerActionsRecord>> getKeys() {
        return Arrays.<UniqueKey<LoggerActionsRecord>>asList(Keys.KEY_LOGGER_ACTIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoggerActions as(String alias) {
        return new LoggerActions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LoggerActions as(Name alias) {
        return new LoggerActions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public LoggerActions rename(String name) {
        return new LoggerActions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public LoggerActions rename(Name name) {
        return new LoggerActions(name, null);
    }
}