package com.budomuya.webservice.controller.category;

import com.budomuya.webservice.controller.BaseController;
import com.oxinews.servis.OxinewsService;
import com.oxinews.servis.model.CategoryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alparslanb
 * on 11/12/14.
 */
@RestController
public class CategoryController extends BaseController {

    @Autowired
    private OxinewsService oxinewsService;

    @RequestMapping("/getCategories")
    public List<CategoryData> getCategories() {
        List<CategoryData> response = new ArrayList<CategoryData>();
        try {
            response = oxinewsService.getCategoryList("tr", null);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return response;
    }
}
