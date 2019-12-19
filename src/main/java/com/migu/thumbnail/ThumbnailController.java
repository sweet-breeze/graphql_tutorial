package com.migu.thumbnail;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import net.coobird.thumbnailator.Thumbnails;

/**
 * 图片压缩成缩略图 Project Name:HelloResearch File Name:ThumbnailController.java
 * Package Name:com.migu.thumbnail ClassName: ThumbnailController <br/>
 * date: 2019年6月3日 下午2:09:52 <br/>
 * 
 * @author breeze
 * @version
 * @since JDK 1.6
 */

@RestController
public class ThumbnailController {

    @RequestMapping(value = "/thumb", method = RequestMethod.GET)
    public String saveArea() throws IOException {

        Thumbnails.of("D:/1.png").size(256, 256).toFile("D:/1_thumbnail.jpg");
        
        return "handle successful";
    }
}