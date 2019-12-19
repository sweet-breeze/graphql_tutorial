package com.migu.spider.template;

import com.migu.spider.model.Compet;

import cn.edu.hfut.dmic.webcollector.model.CrawlDatums;
import cn.edu.hfut.dmic.webcollector.model.Page;

public class WY163Template extends BaseTemplate {

    
    @Override
    public Compet doit(Page page,CrawlDatums next) {
        Compet cpt = new Compet();
        cpt.setTitle("h2");
        cpt.setType("list");
        
        
        return cpt;
    }
}
