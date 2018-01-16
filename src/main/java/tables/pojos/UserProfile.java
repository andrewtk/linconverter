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
public class UserProfile implements Serializable {

    private static final long serialVersionUID = -1024005826;

    private Integer   id;
    private Integer   userid;
    private String    username;
    private String    fullname;
    private String    location;
    private String    website;
    private String    email;
    private String    businessStatus;
    private String    bonusPoints;
    private String    about;
    private Timestamp created;
    private Timestamp updated;

    public UserProfile() {}

    public UserProfile(UserProfile value) {
        this.id = value.id;
        this.userid = value.userid;
        this.username = value.username;
        this.fullname = value.fullname;
        this.location = value.location;
        this.website = value.website;
        this.email = value.email;
        this.businessStatus = value.businessStatus;
        this.bonusPoints = value.bonusPoints;
        this.about = value.about;
        this.created = value.created;
        this.updated = value.updated;
    }

    public UserProfile(
        Integer   id,
        Integer   userid,
        String    username,
        String    fullname,
        String    location,
        String    website,
        String    email,
        String    businessStatus,
        String    bonusPoints,
        String    about,
        Timestamp created,
        Timestamp updated
    ) {
        this.id = id;
        this.userid = userid;
        this.username = username;
        this.fullname = fullname;
        this.location = location;
        this.website = website;
        this.email = email;
        this.businessStatus = businessStatus;
        this.bonusPoints = bonusPoints;
        this.about = about;
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

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }

    public String getBonusPoints() {
        return this.bonusPoints;
    }

    public void setBonusPoints(String bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public String getAbout() {
        return this.about;
    }

    public void setAbout(String about) {
        this.about = about;
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
        StringBuilder sb = new StringBuilder("UserProfile (");

        sb.append(id);
        sb.append(", ").append(userid);
        sb.append(", ").append(username);
        sb.append(", ").append(fullname);
        sb.append(", ").append(location);
        sb.append(", ").append(website);
        sb.append(", ").append(email);
        sb.append(", ").append(businessStatus);
        sb.append(", ").append(bonusPoints);
        sb.append(", ").append(about);
        sb.append(", ").append(created);
        sb.append(", ").append(updated);

        sb.append(")");
        return sb.toString();
    }
}
