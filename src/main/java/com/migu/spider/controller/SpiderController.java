package com.migu.spider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.migu.spider.config.WebPageConfig;
import com.migu.spider.crawler.CommonCrawler;
import com.migu.spider.model.Webpage;


// @RestController
public class SpiderController {

    @Autowired
    private WebPageConfig webPageConfig;
    
    private CommonCrawler cc;
    
    @RequestMapping(value="/spider")
    public String saveArea() throws Exception {
        List<Webpage> list = webPageConfig.getMappings();
        cc = new CommonCrawler("test", true);
        cc.init(list);
        cc.start(2);
        return "";
    }
}
