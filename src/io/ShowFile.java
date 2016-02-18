package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sifat on 1/26/2016.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileOutputStream fout = null;
        FileInputStream fin = null;
        String f1="src/io/delicious.txt";
        String f2 = "name.txt";

        try {
            fout = new FileOutputStream(f2);
            fin = new FileInputStream(f1);
            do {
                fout.write(fin.read());
            }while (fin.read()!=-1);
            fout.close();
            fin.close();

//            while(fin.read()!=-1)
//                fout.write(fin.read());
//            fout.close();
//            fin.close();
            FileInputStream fin1 = new FileInputStream(f2);
            List<Integer> bytevalAr = new ArrayList<>();
            do {
                bytevalAr.add(fin1.read());
            }while (fin1.read()!=-1);
            fin1.close();
            int j=0;

            for (Integer integer : bytevalAr) {
                System.out.print((char)integer.byteValue());
            }

        }catch (Exception e1){
            e1.printStackTrace();
        }
    }
}
