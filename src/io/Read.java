package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Sifat on 2/18/2016.
 */
public class Read {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = null;

        if(args.length!=-1) {
            System.out.println("Usage: Read fileName");
            return;
        }

        reader = new BufferedReader(new FileReader(args[0]));
        System.out.println(reader.readLine());


    }
}
