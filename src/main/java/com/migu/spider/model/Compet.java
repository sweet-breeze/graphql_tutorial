package com.migu.spider.model;

public class Compet {
    
    private String type;
    private String videoType;
    
    //列表页
    private String shortTitle;
    private String url;
    
    //详细页
    private String title;
    private String content;
    
    
    /**
    * type.
    *
    * @return  the type
    */
    
    public String getType() {
        return type;
    }

    
    /**
    * type.
    *
    * @param   type    the type to set
    */
    
    public void setType(String type) {
        this.type = type;
    }

    /**
    * shortTitle.
    *
    * @return  the shortTitle
    */
    
    public String getShortTitle() {
        return shortTitle;
    }
    
    /**
    * shortTitle.
    *
    * @param   shortTitle    the shortTitle to set
    */
    
    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }
    
    /**
    * url.
    *
    * @return  the url
    */
    
    public String getUrl() {
        return url;
    }
    
    /**
    * url.
    *
    * @param   url    the url to set
    */
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    /**
    * title.
    *
    * @return  the title
    */
    
    public String getTitle() {
        return title;
    }
    
    /**
    * title.
    *
    * @param   title    the title to set
    */
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    /**
    * content.
    *
    * @return  the content
    */
    
    public String getContent() {
        return content;
    }
    
    /**
    * content.
    *
    * @param   content    the content to set
    */
    
    public void setContent(String content) {
        this.content = content;
    }
    
    
}
