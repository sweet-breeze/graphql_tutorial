package com.migu.spider.crawler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.migu.spider.model.Compet;
import com.migu.spider.model.Webpage;
import com.migu.spider.service.IMongoService;
import com.migu.spider.service.MongoServiceImpl;
import com.migu.spider.template.BaseTemplate;
import com.migu.spider.util.ReflectUtil;

import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.model.Page;
import cn.edu.hfut.dmic.webcollector.plugin.rocks.BreadthCrawler;

public class CommonCrawler extends BreadthCrawler{

    private List<Webpage> wbList = new ArrayList<Webpage>();
    
   
    private IMongoService ms = new MongoServiceImpl();
    
    public CommonCrawler(String crawlPath, boolean autoParse) {
        super(crawlPath, autoParse);
        
    }
    
    public void init(List<Webpage> rwbList) throws Exception {
        this.wbList = rwbList;
        wbList.stream().forEach(element -> {
            System.out.println(element.getRootUrl());
            System.out.println(element.getSeedRegex());
            System.out.println(element.getTemplatePath());
            
            this.addSeed(element.getRootUrl());
            this.addRegex(element.getSeedRegex());
            this.addRegex(element.getRootRegex());
        });
    }

    @Override
    public void visit(Page page, CrawlDatums next) {
        // 用map优化, Regex做key
        System.out.println("----------------visit--------------:"+page);
        this.wbList.stream().forEach(element -> {
            // 或根据 根域名判断
            if(page.matchUrl(element.getRootRegex()) || page.matchUrl(element.getSeedRegex())) {
                BaseTemplate obj = (BaseTemplate)ReflectUtil.getObject(element.getTemplatePath());
                Compet cp = obj.doit(page,next);
                ms.save(cp);
                
            }
        });
        
    }

}
