package io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sifat on 2/14/2016.
 */
public class ReadBytes {
    public static void main(String[] args) throws IOException{
        byte data[] = new byte[40];
//        List<Byte> data = new ArrayList<Byte>();

        System.out.println("Write some characters");
//        System.in.read(data.toArray());
        System.out.print("You entered: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char)data[i]);

        }
    }
}
