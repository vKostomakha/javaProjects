package com.javarush.test.level16.lesson13.bonus01;


import com.javarush.test.level16.lesson13.bonus01.common.*;


/**
 * Created by Home on 25.02.2016.
 */
public class ImageReaderFactory  implements ImageReader{

    public static ImageReader getReader(ImageTypes type) {

        switch (type){
            case BMP : return new BmpReader();
            case JPG : return new JpgReader();
            case PNG : return new PngReader();
            default :  new IllegalArgumentException();
        }
     return null;
    }
}
