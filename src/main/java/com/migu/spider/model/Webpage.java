package com.migu.spider.model;

public class Webpage {

    private String rootUrl;
    private String rootRegex;
    private String seedRegex;
    private String templatePath;
    
    
    /**
    * rootRegex.
    *
    * @return  the rootRegex
    */
    
    public String getRootRegex() {
        return rootRegex;
    }
    
    /**
    * rootRegex.
    *
    * @param   rootRegex    the rootRegex to set
    */
    
    public void setRootRegex(String rootRegex) {
        this.rootRegex = rootRegex;
    }
    /**
    * seedRegex.
    *
    * @return  the seedRegex
    */
    
    public String getSeedRegex() {
        return seedRegex;
    }
    /**
    * seedRegex.
    *
    * @param   seedRegex    the seedRegex to set
    */
    
    public void setSeedRegex(String seedRegex) {
        this.seedRegex = seedRegex;
    }

    /**
    * rootUrl.
    *
    * @return  the rootUrl
    */
    
    public String getRootUrl() {
        return rootUrl;
    }

    /**
    * rootUrl.
    *
    * @param   rootUrl    the rootUrl to set
    */
    
    public void setRootUrl(String rootUrl) {
        this.rootUrl = rootUrl;
    }

    /**
    * templatePath.
    *
    * @return  the templatePath
    */
    
    public String getTemplatePath() {
        return templatePath;
    }
    
    /**
    * templatePath.
    *
    * @param   templatePath    the templatePath to set
    */
    
    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }
}
