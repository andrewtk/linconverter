/*
 * This file is generated by jOOQ.
*/
package lorgNew.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class LoggerActions implements Serializable {

    private static final long serialVersionUID = -1152879422;

    private Integer id;
    private String  action;
    private String  title;

    public LoggerActions() {}

    public LoggerActions(LoggerActions value) {
        this.id = value.id;
        this.action = value.action;
        this.title = value.title;
    }

    public LoggerActions(
        Integer id,
        String  action,
        String  title
    ) {
        this.id = id;
        this.action = action;
        this.title = title;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LoggerActions (");

        sb.append(id);
        sb.append(", ").append(action);
        sb.append(", ").append(title);

        sb.append(")");
        return sb.toString();
    }
}