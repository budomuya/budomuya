package com.budomuya.webservice.controller.news;

import com.budomuya.webservice.controller.BaseController;
import com.budomuya.webservice.mockData.MockDataManager;
import com.budomuya.webservice.model.news.LastUpdate;
import com.oxinews.servis.OxinewsService;
import com.oxinews.servis.model.NewsData;
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
public class NewsController extends BaseController {

    @Autowired
    private OxinewsService oxinewsService;

    @RequestMapping("/getNews")
    public List<NewsData> getNews() {
        List<NewsData> response = new ArrayList<NewsData>();
        try {
            response = oxinewsService.getNewsList(null, null, null, 0, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

    @RequestMapping("/getLastUpdate")
    public LastUpdate getLastUpdate() {

        return MockDataManager.mockLastUpdate();
    }

}
