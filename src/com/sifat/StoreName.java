package com.sifat;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Sifat on 1/24/2016.
 */
public class StoreName {
    private final String mFile="name.txt";

    public static void main(String[] args){
        LongName.storeName(args[0], Arrays.copyOfRange(args,1,args.length-1));
    }
}
