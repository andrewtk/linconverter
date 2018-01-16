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
public class SeoProfile implements Serializable {

    private static final long serialVersionUID = -642041269;

    private Integer   id;
    private Integer   qsid;
    private Integer   tpid;
    private Byte      autoAlias;
    private String    urlCanonical;
    private String    metaTitle;
    private String    metaDescription;
    private String    graphPageUrl;
    private String    graphContentTitle;
    private String    graphContentDescription;
    private String    graphContentData;
    private String    graphArticleData;
    private String    hreflandDefaultLocation;
    private String    hreflandForEnglish;
    private String    hreflandForSpanish;
    private String    hreflandForKorean;
    private String    hreflandForJapanese;
    private Byte      robotsAllowSearchToIndex;
    private Byte      robotsAllowSearchToFollow;
    private Byte      robotsPreventsSearchFromIndex;
    private Byte      robotsPreventsSearchFromFollow;
    private Byte      robotsPreventsCached;
    private Byte      robotsPreventsDescriptoinFrom;
    private String    sitemapFrequency;
    private Double    sitemapPriority;
    private Timestamp created;
    private Timestamp updated;

    public SeoProfile() {}

    public SeoProfile(SeoProfile value) {
        this.id = value.id;
        this.qsid = value.qsid;
        this.tpid = value.tpid;
        this.autoAlias = value.autoAlias;
        this.urlCanonical = value.urlCanonical;
        this.metaTitle = value.metaTitle;
        this.metaDescription = value.metaDescription;
        this.graphPageUrl = value.graphPageUrl;
        this.graphContentTitle = value.graphContentTitle;
        this.graphContentDescription = value.graphContentDescription;
        this.graphContentData = value.graphContentData;
        this.graphArticleData = value.graphArticleData;
        this.hreflandDefaultLocation = value.hreflandDefaultLocation;
        this.hreflandForEnglish = value.hreflandForEnglish;
        this.hreflandForSpanish = value.hreflandForSpanish;
        this.hreflandForKorean = value.hreflandForKorean;
        this.hreflandForJapanese = value.hreflandForJapanese;
        this.robotsAllowSearchToIndex = value.robotsAllowSearchToIndex;
        this.robotsAllowSearchToFollow = value.robotsAllowSearchToFollow;
        this.robotsPreventsSearchFromIndex = value.robotsPreventsSearchFromIndex;
        this.robotsPreventsSearchFromFollow = value.robotsPreventsSearchFromFollow;
        this.robotsPreventsCached = value.robotsPreventsCached;
        this.robotsPreventsDescriptoinFrom = value.robotsPreventsDescriptoinFrom;
        this.sitemapFrequency = value.sitemapFrequency;
        this.sitemapPriority = value.sitemapPriority;
        this.created = value.created;
        this.updated = value.updated;
    }

    public SeoProfile(
        Integer   id,
        Integer   qsid,
        Integer   tpid,
        Byte      autoAlias,
        String    urlCanonical,
        String    metaTitle,
        String    metaDescription,
        String    graphPageUrl,
        String    graphContentTitle,
        String    graphContentDescription,
        String    graphContentData,
        String    graphArticleData,
        String    hreflandDefaultLocation,
        String    hreflandForEnglish,
        String    hreflandForSpanish,
        String    hreflandForKorean,
        String    hreflandForJapanese,
        Byte      robotsAllowSearchToIndex,
        Byte      robotsAllowSearchToFollow,
        Byte      robotsPreventsSearchFromIndex,
        Byte      robotsPreventsSearchFromFollow,
        Byte      robotsPreventsCached,
        Byte      robotsPreventsDescriptoinFrom,
        String    sitemapFrequency,
        Double    sitemapPriority,
        Timestamp created,
        Timestamp updated
    ) {
        this.id = id;
        this.qsid = qsid;
        this.tpid = tpid;
        this.autoAlias = autoAlias;
        this.urlCanonical = urlCanonical;
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.graphPageUrl = graphPageUrl;
        this.graphContentTitle = graphContentTitle;
        this.graphContentDescription = graphContentDescription;
        this.graphContentData = graphContentData;
        this.graphArticleData = graphArticleData;
        this.hreflandDefaultLocation = hreflandDefaultLocation;
        this.hreflandForEnglish = hreflandForEnglish;
        this.hreflandForSpanish = hreflandForSpanish;
        this.hreflandForKorean = hreflandForKorean;
        this.hreflandForJapanese = hreflandForJapanese;
        this.robotsAllowSearchToIndex = robotsAllowSearchToIndex;
        this.robotsAllowSearchToFollow = robotsAllowSearchToFollow;
        this.robotsPreventsSearchFromIndex = robotsPreventsSearchFromIndex;
        this.robotsPreventsSearchFromFollow = robotsPreventsSearchFromFollow;
        this.robotsPreventsCached = robotsPreventsCached;
        this.robotsPreventsDescriptoinFrom = robotsPreventsDescriptoinFrom;
        this.sitemapFrequency = sitemapFrequency;
        this.sitemapPriority = sitemapPriority;
        this.created = created;
        this.updated = updated;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQsid() {
        return this.qsid;
    }

    public void setQsid(Integer qsid) {
        this.qsid = qsid;
    }

    public Integer getTpid() {
        return this.tpid;
    }

    public void setTpid(Integer tpid) {
        this.tpid = tpid;
    }

    public Byte getAutoAlias() {
        return this.autoAlias;
    }

    public void setAutoAlias(Byte autoAlias) {
        this.autoAlias = autoAlias;
    }

    public String getUrlCanonical() {
        return this.urlCanonical;
    }

    public void setUrlCanonical(String urlCanonical) {
        this.urlCanonical = urlCanonical;
    }

    public String getMetaTitle() {
        return this.metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getMetaDescription() {
        return this.metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public String getGraphPageUrl() {
        return this.graphPageUrl;
    }

    public void setGraphPageUrl(String graphPageUrl) {
        this.graphPageUrl = graphPageUrl;
    }

    public String getGraphContentTitle() {
        return this.graphContentTitle;
    }

    public void setGraphContentTitle(String graphContentTitle) {
        this.graphContentTitle = graphContentTitle;
    }

    public String getGraphContentDescription() {
        return this.graphContentDescription;
    }

    public void setGraphContentDescription(String graphContentDescription) {
        this.graphContentDescription = graphContentDescription;
    }

    public String getGraphContentData() {
        return this.graphContentData;
    }

    public void setGraphContentData(String graphContentData) {
        this.graphContentData = graphContentData;
    }

    public String getGraphArticleData() {
        return this.graphArticleData;
    }

    public void setGraphArticleData(String graphArticleData) {
        this.graphArticleData = graphArticleData;
    }

    public String getHreflandDefaultLocation() {
        return this.hreflandDefaultLocation;
    }

    public void setHreflandDefaultLocation(String hreflandDefaultLocation) {
        this.hreflandDefaultLocation = hreflandDefaultLocation;
    }

    public String getHreflandForEnglish() {
        return this.hreflandForEnglish;
    }

    public void setHreflandForEnglish(String hreflandForEnglish) {
        this.hreflandForEnglish = hreflandForEnglish;
    }

    public String getHreflandForSpanish() {
        return this.hreflandForSpanish;
    }

    public void setHreflandForSpanish(String hreflandForSpanish) {
        this.hreflandForSpanish = hreflandForSpanish;
    }

    public String getHreflandForKorean() {
        return this.hreflandForKorean;
    }

    public void setHreflandForKorean(String hreflandForKorean) {
        this.hreflandForKorean = hreflandForKorean;
    }

    public String getHreflandForJapanese() {
        return this.hreflandForJapanese;
    }

    public void setHreflandForJapanese(String hreflandForJapanese) {
        this.hreflandForJapanese = hreflandForJapanese;
    }

    public Byte getRobotsAllowSearchToIndex() {
        return this.robotsAllowSearchToIndex;
    }

    public void setRobotsAllowSearchToIndex(Byte robotsAllowSearchToIndex) {
        this.robotsAllowSearchToIndex = robotsAllowSearchToIndex;
    }

    public Byte getRobotsAllowSearchToFollow() {
        return this.robotsAllowSearchToFollow;
    }

    public void setRobotsAllowSearchToFollow(Byte robotsAllowSearchToFollow) {
        this.robotsAllowSearchToFollow = robotsAllowSearchToFollow;
    }

    public Byte getRobotsPreventsSearchFromIndex() {
        return this.robotsPreventsSearchFromIndex;
    }

    public void setRobotsPreventsSearchFromIndex(Byte robotsPreventsSearchFromIndex) {
        this.robotsPreventsSearchFromIndex = robotsPreventsSearchFromIndex;
    }

    public Byte getRobotsPreventsSearchFromFollow() {
        return this.robotsPreventsSearchFromFollow;
    }

    public void setRobotsPreventsSearchFromFollow(Byte robotsPreventsSearchFromFollow) {
        this.robotsPreventsSearchFromFollow = robotsPreventsSearchFromFollow;
    }

    public Byte getRobotsPreventsCached() {
        return this.robotsPreventsCached;
    }

    public void setRobotsPreventsCached(Byte robotsPreventsCached) {
        this.robotsPreventsCached = robotsPreventsCached;
    }

    public Byte getRobotsPreventsDescriptoinFrom() {
        return this.robotsPreventsDescriptoinFrom;
    }

    public void setRobotsPreventsDescriptoinFrom(Byte robotsPreventsDescriptoinFrom) {
        this.robotsPreventsDescriptoinFrom = robotsPreventsDescriptoinFrom;
    }

    public String getSitemapFrequency() {
        return this.sitemapFrequency;
    }

    public void setSitemapFrequency(String sitemapFrequency) {
        this.sitemapFrequency = sitemapFrequency;
    }

    public Double getSitemapPriority() {
        return this.sitemapPriority;
    }

    public void setSitemapPriority(Double sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
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
        StringBuilder sb = new StringBuilder("SeoProfile (");

        sb.append(id);
        sb.append(", ").append(qsid);
        sb.append(", ").append(tpid);
        sb.append(", ").append(autoAlias);
        sb.append(", ").append(urlCanonical);
        sb.append(", ").append(metaTitle);
        sb.append(", ").append(metaDescription);
        sb.append(", ").append(graphPageUrl);
        sb.append(", ").append(graphContentTitle);
        sb.append(", ").append(graphContentDescription);
        sb.append(", ").append(graphContentData);
        sb.append(", ").append(graphArticleData);
        sb.append(", ").append(hreflandDefaultLocation);
        sb.append(", ").append(hreflandForEnglish);
        sb.append(", ").append(hreflandForSpanish);
        sb.append(", ").append(hreflandForKorean);
        sb.append(", ").append(hreflandForJapanese);
        sb.append(", ").append(robotsAllowSearchToIndex);
        sb.append(", ").append(robotsAllowSearchToFollow);
        sb.append(", ").append(robotsPreventsSearchFromIndex);
        sb.append(", ").append(robotsPreventsSearchFromFollow);
        sb.append(", ").append(robotsPreventsCached);
        sb.append(", ").append(robotsPreventsDescriptoinFrom);
        sb.append(", ").append(sitemapFrequency);
        sb.append(", ").append(sitemapPriority);
        sb.append(", ").append(created);
        sb.append(", ").append(updated);

        sb.append(")");
        return sb.toString();
    }
}
