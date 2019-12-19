package com.migu.spider.util;

public class ReflectUtil {
    /**
     * getObject: 利用反射生成对象. <br/>
     * 
     * @author breeze
     * @param path
     * @return
     * @throws ClassNotFoundException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static Object getObject(String path) {
        Object obj = null;
        try {
            obj =  Class.forName(path).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); 
        }
        return obj;
    }
}
