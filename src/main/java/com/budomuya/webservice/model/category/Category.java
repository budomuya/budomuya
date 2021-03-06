package com.budomuya.webservice.model.category;

import com.budomuya.webservice.model.BaseModel;

/**
 * Created by alparslanb
 * on 11/12/14.
 */
public class Category extends BaseModel {

    private String key;
    private String value;
    private String href;

    public Category (String key, String value, String href) {
        super();
        this.key = key;
        this.value = value;
        this.href = href;
    }

    public String getHref() {
        return href;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
