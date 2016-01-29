package com.sifat;

/**
 * Created by Sifat on 1/26/2016.
 */
public class LongNameFromFile {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Enter File Name");
        }else LongName.getLongName(LongName.getNames(args[0]));
    }
}
