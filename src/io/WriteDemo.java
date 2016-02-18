package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sifat on 2/14/2016.
 */

public class WriteDemo {
    public static void main(String[] args) throws IOException{
        byte b[];
        char c[];
        char d[];

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write text: ");
        String text = read.readLine();
        b = text.getBytes();
        d = new char[100];
        text.getChars(0,text.length(), d, 0);

        System.out.println("String: " + text);

        System.out.println("Byte: ");
        for (byte b1 : b) {
            System.out.println((byte) b1);
        }

        System.out.println("\n");

        System.out.println("Char: ");
        for (char c1 : d) {
            System.out.println(c1);
        }
    }
}
