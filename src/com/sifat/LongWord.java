package com.sifat;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class LongWord {
    public static void main(String[] args) {
        Document doc = null;
        String words[] = null;

        //get words from html page..
        try {
            doc = Jsoup.connect("http://www.thedailystar.net/offbeat/bizarre-two-legged-fish-found-new-zealand-205624").get();
            Elements p = doc.select("p");
            String text = p.text();
            words = text.split(" ");
            System.out.println("words: "+words.length+"\n\n");
            for(String word:words) System.out.println(word);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //find long word...
        int max = words[0].length();
        String longWord = words[0];
        for (int i = 0; i < words.length; i++) {
            if(words[i].length()>max) {
                max = words[i].length();
                longWord = words[i];
            }
        }

        System.out.print("Lengthy Word:"+longWord);

    }
}
