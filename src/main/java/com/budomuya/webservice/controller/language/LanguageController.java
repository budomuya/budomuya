package com.budomuya.webservice.controller.language;

import com.budomuya.webservice.controller.BaseController;
import com.budomuya.webservice.mockData.MockDataManager;
import com.budomuya.webservice.model.language.Language;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by alparslanb
 * on 14/12/14.
 */
@RestController
public class LanguageController extends BaseController {

    @RequestMapping("/getLanguages")
    public List<Language> getLanguages() {

        return MockDataManager.mockLanguagList();
    }


}
