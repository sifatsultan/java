package com.sifat;

public class LongName {

    public static void main(String[] names) {

        if(names.length==0) {
            System.out.println("Enter names!");
            return;
        }

        //find long name...
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

}
