/*
 * This file is generated by jOOQ.
*/
package lorgNew.tables.records;


import javax.annotation.Generated;

import lorgNew.tables.Routes;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class RoutesRecord extends UpdatableRecordImpl<RoutesRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 304838544;

    /**
     * Setter for <code>lorgNew.routes.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>lorgNew.routes.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>lorgNew.routes.route</code>.
     */
    public void setRoute(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>lorgNew.routes.route</code>.
     */
    public String getRoute() {
        return (String) get(1);
    }

    /**
     * Setter for <code>lorgNew.routes.title</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>lorgNew.routes.title</code>.
     */
    public String getTitle() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Routes.ROUTES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Routes.ROUTES.ROUTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Routes.ROUTES.TITLE;
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
        return getRoute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTitle();
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
        return getRoute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoutesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoutesRecord value2(String value) {
        setRoute(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoutesRecord value3(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoutesRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoutesRecord
     */
    public RoutesRecord() {
        super(Routes.ROUTES);
    }

    /**
     * Create a detached, initialised RoutesRecord
     */
    public RoutesRecord(Integer id, String route, String title) {
        super(Routes.ROUTES);

        set(0, id);
        set(1, route);
        set(2, title);
    }
}