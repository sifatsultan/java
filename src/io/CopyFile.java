package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Sifat on 1/26/2016.
 */
public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if(args.length==0) {
            System.out.println("java io.CopyFile File1 File2");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1], true);

            do{
                i = fin.read();
                if (i!=-1)fout.write(i);
            }while (i!=-1);
        }catch (IOException e){
            System.out.println("IO Error "+e);
        }finally {
            try {
                if(fin != null)fin.close();
            }catch (IOException e) {
                System.out.println("IOException "+e);
            }
            try {
                if(fout != null)fout.close();
            }catch (IOException e){
                System.out.println("IOException "+e);
            }
        }

    }
}
