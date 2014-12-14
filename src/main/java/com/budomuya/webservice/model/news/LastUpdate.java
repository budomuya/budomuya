package com.budomuya.webservice.model.news;

import com.budomuya.webservice.model.BaseModel;

/**
 * Created by alparslanb
 * on 14/12/14.
 */
public class LastUpdate extends BaseModel{

    private String key;
    private String value;
    private String link;

    public LastUpdate(String key, String value, String link) {
        super();
        this.key = key;
        this.value = value;
        this.link = link;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public String getLink() {
        return link;
    }
}
