package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Sifat on 1/26/2016.
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        if(args.length != 1){
            System.out.println("Enter File Name");
            return;
        }
        try{
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            }while (i!=-1);
        }catch (IOException e){
            System.out.println("I/O Error "+e);
        }finally {
            try {
                if(fin != null) fin.close();
            }catch (IOException e){
                System.out.println("Could not close file!");
            }
        }
    }
}
