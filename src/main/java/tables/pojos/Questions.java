/*
 * This file is generated by jOOQ.
*/
package lorgNew.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class Questions implements Serializable {

    private static final long serialVersionUID = 1613998673;

    private Integer   id;
    private Integer   userid;
    private String    title;
    private String    content;
    private Integer   views;
    private String    slug;
    private String    status;
    private Byte      mailme;
    private String    segment;
    private Timestamp created;
    private Timestamp updated;

    public Questions() {}

    public Questions(Questions value) {
        this.id = value.id;
        this.userid = value.userid;
        this.title = value.title;
        this.content = value.content;
        this.views = value.views;
        this.slug = value.slug;
        this.status = value.status;
        this.mailme = value.mailme;
        this.segment = value.segment;
        this.created = value.created;
        this.updated = value.updated;
    }

    public Questions(
        Integer   id,
        Integer   userid,
        String    title,
        String    content,
        Integer   views,
        String    slug,
        String    status,
        Byte      mailme,
        String    segment,
        Timestamp created,
        Timestamp updated
    ) {
        this.id = id;
        this.userid = userid;
        this.title = title;
        this.content = content;
        this.views = views;
        this.slug = slug;
        this.status = status;
        this.mailme = mailme;
        this.segment = segment;
        this.created = created;
        this.updated = updated;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getViews() {
        return this.views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Byte getMailme() {
        return this.mailme;
    }

    public void setMailme(Byte mailme) {
        this.mailme = mailme;
    }

    public String getSegment() {
        return this.segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public Timestamp getCreated() {
        return this.created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return this.updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Questions (");

        sb.append(id);
        sb.append(", ").append(userid);
        sb.append(", ").append(title);
        sb.append(", ").append(content);
        sb.append(", ").append(views);
        sb.append(", ").append(slug);
        sb.append(", ").append(status);
        sb.append(", ").append(mailme);
        sb.append(", ").append(segment);
        sb.append(", ").append(created);
        sb.append(", ").append(updated);

        sb.append(")");
        return sb.toString();
    }
}
