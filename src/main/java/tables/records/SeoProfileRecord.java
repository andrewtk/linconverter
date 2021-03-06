/*
 * This file is generated by jOOQ.
*/
package lorgNew.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import lorgNew.tables.SeoProfile;

import org.jooq.Record1;
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
public class SeoProfileRecord extends UpdatableRecordImpl<SeoProfileRecord> {

    private static final long serialVersionUID = -1434725626;

    /**
     * Setter for <code>lorgNew.seo_profile.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.qsid</code>.
     */
    public void setQsid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.qsid</code>.
     */
    public Integer getQsid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.tpid</code>.
     */
    public void setTpid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.tpid</code>.
     */
    public Integer getTpid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.auto_alias</code>.
     */
    public void setAutoAlias(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.auto_alias</code>.
     */
    public Byte getAutoAlias() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.url_canonical</code>.
     */
    public void setUrlCanonical(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.url_canonical</code>.
     */
    public String getUrlCanonical() {
        return (String) get(4);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.meta_title</code>.
     */
    public void setMetaTitle(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.meta_title</code>.
     */
    public String getMetaTitle() {
        return (String) get(5);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.meta_description</code>.
     */
    public void setMetaDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.meta_description</code>.
     */
    public String getMetaDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.graph_page_url</code>.
     */
    public void setGraphPageUrl(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.graph_page_url</code>.
     */
    public String getGraphPageUrl() {
        return (String) get(7);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.graph_content_title</code>.
     */
    public void setGraphContentTitle(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.graph_content_title</code>.
     */
    public String getGraphContentTitle() {
        return (String) get(8);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.graph_content_description</code>.
     */
    public void setGraphContentDescription(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.graph_content_description</code>.
     */
    public String getGraphContentDescription() {
        return (String) get(9);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.graph_content_data</code>.
     */
    public void setGraphContentData(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.graph_content_data</code>.
     */
    public String getGraphContentData() {
        return (String) get(10);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.graph_article_data</code>.
     */
    public void setGraphArticleData(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.graph_article_data</code>.
     */
    public String getGraphArticleData() {
        return (String) get(11);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.hrefland_default_location</code>.
     */
    public void setHreflandDefaultLocation(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.hrefland_default_location</code>.
     */
    public String getHreflandDefaultLocation() {
        return (String) get(12);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.hrefland_for_english</code>.
     */
    public void setHreflandForEnglish(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.hrefland_for_english</code>.
     */
    public String getHreflandForEnglish() {
        return (String) get(13);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.hrefland_for_spanish</code>.
     */
    public void setHreflandForSpanish(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.hrefland_for_spanish</code>.
     */
    public String getHreflandForSpanish() {
        return (String) get(14);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.hrefland_for_korean</code>.
     */
    public void setHreflandForKorean(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.hrefland_for_korean</code>.
     */
    public String getHreflandForKorean() {
        return (String) get(15);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.hrefland_for_japanese</code>.
     */
    public void setHreflandForJapanese(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.hrefland_for_japanese</code>.
     */
    public String getHreflandForJapanese() {
        return (String) get(16);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.robots_allow_search_to_index</code>.
     */
    public void setRobotsAllowSearchToIndex(Byte value) {
        set(17, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.robots_allow_search_to_index</code>.
     */
    public Byte getRobotsAllowSearchToIndex() {
        return (Byte) get(17);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.robots_allow_search_to_follow</code>.
     */
    public void setRobotsAllowSearchToFollow(Byte value) {
        set(18, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.robots_allow_search_to_follow</code>.
     */
    public Byte getRobotsAllowSearchToFollow() {
        return (Byte) get(18);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.robots_prevents_search_from_index</code>.
     */
    public void setRobotsPreventsSearchFromIndex(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.robots_prevents_search_from_index</code>.
     */
    public Byte getRobotsPreventsSearchFromIndex() {
        return (Byte) get(19);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.robots_prevents_search_from_follow</code>.
     */
    public void setRobotsPreventsSearchFromFollow(Byte value) {
        set(20, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.robots_prevents_search_from_follow</code>.
     */
    public Byte getRobotsPreventsSearchFromFollow() {
        return (Byte) get(20);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.robots_prevents_cached</code>.
     */
    public void setRobotsPreventsCached(Byte value) {
        set(21, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.robots_prevents_cached</code>.
     */
    public Byte getRobotsPreventsCached() {
        return (Byte) get(21);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.robots_prevents_descriptoin_from</code>.
     */
    public void setRobotsPreventsDescriptoinFrom(Byte value) {
        set(22, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.robots_prevents_descriptoin_from</code>.
     */
    public Byte getRobotsPreventsDescriptoinFrom() {
        return (Byte) get(22);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.sitemap_frequency</code>.
     */
    public void setSitemapFrequency(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.sitemap_frequency</code>.
     */
    public String getSitemapFrequency() {
        return (String) get(23);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.sitemap_priority</code>.
     */
    public void setSitemapPriority(Double value) {
        set(24, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.sitemap_priority</code>.
     */
    public Double getSitemapPriority() {
        return (Double) get(24);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(25, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(25);
    }

    /**
     * Setter for <code>lorgNew.seo_profile.updated</code>.
     */
    public void setUpdated(Timestamp value) {
        set(26, value);
    }

    /**
     * Getter for <code>lorgNew.seo_profile.updated</code>.
     */
    public Timestamp getUpdated() {
        return (Timestamp) get(26);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SeoProfileRecord
     */
    public SeoProfileRecord() {
        super(SeoProfile.SEO_PROFILE);
    }

    /**
     * Create a detached, initialised SeoProfileRecord
     */
    public SeoProfileRecord(Integer id, Integer qsid, Integer tpid, Byte autoAlias, String urlCanonical, String metaTitle, String metaDescription, String graphPageUrl, String graphContentTitle, String graphContentDescription, String graphContentData, String graphArticleData, String hreflandDefaultLocation, String hreflandForEnglish, String hreflandForSpanish, String hreflandForKorean, String hreflandForJapanese, Byte robotsAllowSearchToIndex, Byte robotsAllowSearchToFollow, Byte robotsPreventsSearchFromIndex, Byte robotsPreventsSearchFromFollow, Byte robotsPreventsCached, Byte robotsPreventsDescriptoinFrom, String sitemapFrequency, Double sitemapPriority, Timestamp created, Timestamp updated) {
        super(SeoProfile.SEO_PROFILE);

        set(0, id);
        set(1, qsid);
        set(2, tpid);
        set(3, autoAlias);
        set(4, urlCanonical);
        set(5, metaTitle);
        set(6, metaDescription);
        set(7, graphPageUrl);
        set(8, graphContentTitle);
        set(9, graphContentDescription);
        set(10, graphContentData);
        set(11, graphArticleData);
        set(12, hreflandDefaultLocation);
        set(13, hreflandForEnglish);
        set(14, hreflandForSpanish);
        set(15, hreflandForKorean);
        set(16, hreflandForJapanese);
        set(17, robotsAllowSearchToIndex);
        set(18, robotsAllowSearchToFollow);
        set(19, robotsPreventsSearchFromIndex);
        set(20, robotsPreventsSearchFromFollow);
        set(21, robotsPreventsCached);
        set(22, robotsPreventsDescriptoinFrom);
        set(23, sitemapFrequency);
        set(24, sitemapPriority);
        set(25, created);
        set(26, updated);
    }
}
