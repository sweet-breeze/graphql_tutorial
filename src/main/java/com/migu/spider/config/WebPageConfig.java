/**
 * All rights Reserved, Designed By MiGu
 * Copyright: Copyright(C) 2016-2020
 * Company MiGu Co., Ltd.
 */
package com.migu.spider.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.migu.spider.model.Webpage;

import java.util.List;

/**
 * 项目名称: Gateway
 * 包: com.migu.gateway.config
 * 类描述: 共享密钥类
 * 创建人: wangxiaowei
 * 创建时间: 2017/10/19 15:40
 */
@Component
@ConfigurationProperties(prefix = "target-web-page")
public class WebPageConfig {
    // key: deviceCode, value: sharedSecret
    private List<Webpage> mappings;

    
    /**
    * mappings.
    *
    * @return  the mappings
    */
    public List<Webpage> getMappings() {
        return mappings;
    }
    /**
    * mappings.
    *
    * @param mappings the mappings to set
    */
    public void setMappings(List<Webpage> mappings) {
        this.mappings = mappings;
    }
    
    
    /*
    public String getSharedSecret(final String deviceCode) {
        for (DeviceSecret deviceSecret : mappings) {
            if (deviceSecret.getDeviceCode().equals(deviceCode)) {
                return deviceSecret.getSharedSecret();
            }
        }
        return StringUtils.EMPTY;
    }
    */
}
