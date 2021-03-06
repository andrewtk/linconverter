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
import lorgNew.tables.records.RolesRecord;

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
public class Roles extends TableImpl<RolesRecord> {

    private static final long serialVersionUID = 60100121;

    /**
     * The reference instance of <code>lorgNew.roles</code>
     */
    public static final Roles ROLES = new Roles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RolesRecord> getRecordType() {
        return RolesRecord.class;
    }

    /**
     * The column <code>lorgNew.roles.id</code>.
     */
    public final TableField<RolesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>lorgNew.roles.role</code>.
     */
    public final TableField<RolesRecord, String> ROLE = createField("role", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>lorgNew.roles.title</code>.
     */
    public final TableField<RolesRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>lorgNew.roles</code> table reference
     */
    public Roles() {
        this(DSL.name("roles"), null);
    }

    /**
     * Create an aliased <code>lorgNew.roles</code> table reference
     */
    public Roles(String alias) {
        this(DSL.name(alias), ROLES);
    }

    /**
     * Create an aliased <code>lorgNew.roles</code> table reference
     */
    public Roles(Name alias) {
        this(alias, ROLES);
    }

    private Roles(Name alias, Table<RolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Roles(Name alias, Table<RolesRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ROLES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RolesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ROLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RolesRecord> getPrimaryKey() {
        return Keys.KEY_ROLES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RolesRecord>> getKeys() {
        return Arrays.<UniqueKey<RolesRecord>>asList(Keys.KEY_ROLES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Roles as(String alias) {
        return new Roles(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Roles as(Name alias) {
        return new Roles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Roles rename(String name) {
        return new Roles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Roles rename(Name name) {
        return new Roles(name, null);
    }
}
