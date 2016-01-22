package com.sifat;

public class Main {

    public static void main(String[] names) {

        if(names.length==0) {
            System.out.println("Enter names!");
            return;
        }

        int[] nameLength = new int[names.length];

        for (int i = 0; i < names.length; i++) {
            nameLength[i] = names[i].length();
        }

        
        int max = nameLength[0];
        for (int i = 0; i < nameLength.length; i++) {
            if(nameLength[i]>max) max = nameLength[i];
        }


        int maxPosition = 0;
        for (int i = 0; i < nameLength.length; i++) {
            if(nameLength[i] == max) maxPosition = i;
        }

        System.out.print("Long name: "+names[maxPosition]);
    }
}
