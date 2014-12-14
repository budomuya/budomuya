package com.budomuya.webservice.model.language;

import com.budomuya.webservice.model.BaseModel;

/**
 * Created by alparslanb
 * on 14/12/14.
 */
public class Language extends BaseModel{

    private String href;
    private String image;
    private String ket;
    private String value;

    public Language(String href, String image, String ket, String value) {
        this.href = href;
        this.image = image;
        this.ket = ket;
        this.value = value;
    }

    public String getImage() {
        return image;
    }

    public String getHref() {
        return href;
    }

    public String getKet() {
        return ket;
    }

    public String getValue() {
        return value;
    }
}
