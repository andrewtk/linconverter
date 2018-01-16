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
public class SeoStationary implements Serializable {

    private static final long serialVersionUID = 1471471315;

    private Integer id;
    private String  page;
    private String  title;
    private String  description;
    private String  segment;
    private String  hreflandDefaultLocation;
    private String  hreflandForEnglish;
    private String  hreflandForSpanish;
    private String  hreflandForKorean;
    private String  hreflandForJapanese;

    public SeoStationary() {}

    public SeoStationary(SeoStationary value) {
        this.id = value.id;
        this.page = value.page;
        this.title = value.title;
        this.description = value.description;
        this.segment = value.segment;
        this.hreflandDefaultLocation = value.hreflandDefaultLocation;
        this.hreflandForEnglish = value.hreflandForEnglish;
        this.hreflandForSpanish = value.hreflandForSpanish;
        this.hreflandForKorean = value.hreflandForKorean;
        this.hreflandForJapanese = value.hreflandForJapanese;
    }

    public SeoStationary(
        Integer id,
        String  page,
        String  title,
        String  description,
        String  segment,
        String  hreflandDefaultLocation,
        String  hreflandForEnglish,
        String  hreflandForSpanish,
        String  hreflandForKorean,
        String  hreflandForJapanese
    ) {
        this.id = id;
        this.page = page;
        this.title = title;
        this.description = description;
        this.segment = segment;
        this.hreflandDefaultLocation = hreflandDefaultLocation;
        this.hreflandForEnglish = hreflandForEnglish;
        this.hreflandForSpanish = hreflandForSpanish;
        this.hreflandForKorean = hreflandForKorean;
        this.hreflandForJapanese = hreflandForJapanese;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPage() {
        return this.page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSegment() {
        return this.segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SeoStationary (");

        sb.append(id);
        sb.append(", ").append(page);
        sb.append(", ").append(title);
        sb.append(", ").append(description);
        sb.append(", ").append(segment);
        sb.append(", ").append(hreflandDefaultLocation);
        sb.append(", ").append(hreflandForEnglish);
        sb.append(", ").append(hreflandForSpanish);
        sb.append(", ").append(hreflandForKorean);
        sb.append(", ").append(hreflandForJapanese);

        sb.append(")");
        return sb.toString();
    }
}