package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Sifat on 1/26/2016.
 */
public class CopyMultipleFiles {
    public static void main(String[] args) {
        FileOutputStream fout = null;
        int i;

        if(args.length==0){
            System.out.println("CopyMultipleFiles.java usage:\njava io.CopyMultipleFiles outFile inFile1 inFile1...");
            return;
        }


        try {
            fout = new FileOutputStream(args[0],true);
            for (int j = 1; j < args.length; j++) {
                FileInputStream fin = new FileInputStream(args[j]);
                do {
                    i = fin.read();
                    if(i!=-1)fout.write((char)i);
                }while (i!=-1);
                try {
                    fin.close();
                }catch (IOException e){
                    System.out.println("IOException "+e);
                }

            }
        }catch (IOException e){
            System.out.println("IO Exception "+e);
        }finally {
            try{
                fout.close();
            }catch (IOException e){ System.out.println("IOException "+e);}
        }
    }
}
