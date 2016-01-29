package com.sifat;

import java.io.*;

public class LongName {
    private static final String mFile="name.txt";

    public static void main(String[] names) {

        if(names.length==0) {
            System.out.println("Enter names!");
            return;
        }else storeName(mFile, names);

        //find long name...
        getLongName(names);
    }

    public static void getLongName(String[] names) {
        int max = names[0].length();
        String longName =names[0];
        for (int i = 0; i < names.length; i++) {
            if(names[i].length()>max) {
                max = names[i].length();
                longName = names[i];
            }
        }
        System.out.print("Long name:"+longName);

    }

    public static void storeName(String fileName, String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter(fileName);
            for (int i = 0; i < args.length; i++) {
                printWriter.append(args[i]+" ");
            }
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Error: "+e.toString());
        }
    }

    public static String[] getNames(String fileName){
        String[] names = {};
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            names = reader.readLine().split(" ");
        } catch (Exception e) {
            System.out.println("Exception "+e.toString());
        }
        return names;
    }


}
