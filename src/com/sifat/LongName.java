package com.sifat;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


import java.io.IOException;

public class LongName {

    public static void main(String[] names) {

        Document doc = null;

        try {
            doc = Jsoup.connect("http://en.wikipedia.org/").get();
            Elements newsHeadlines = doc.select("#mp-itn b a");
            System.out.println(newsHeadlines);
        } catch (IOException e) {
            e.printStackTrace();
        }


//        if(names.length==0) {
//            System.out.println("Enter names!");
//            return;
//        }

        //find long name...
        int max = 0;
        String longName ="";
        for (int i = 0; i < names.length; i++) {
            if(names[i].length()>max) {
                max = names[i].length();
                longName = names[i];
            }
        }

        System.out.print("Long name:"+longName);

    }

}
