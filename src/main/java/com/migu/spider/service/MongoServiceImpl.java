package com.migu.spider.service;

import org.springframework.stereotype.Service;

import com.migu.spider.model.Compet;

@Service
public class MongoServiceImpl implements IMongoService{

    @Override
    public void save(Compet compet) {
        System.out.println("--------------------------------mongo save--------------------------------");
        if(compet.getType().equals("list")) {
            System.out.println("存榜单数据库存储！");
        }else if(compet.getType().equals("info")) {
            System.out.println("存详细信息数据库存储！");
        }
        
        
    }
}
