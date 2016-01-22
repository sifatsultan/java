package com.sifat;

public class Main {

    public static void main(String[] names) {

        if(names.length==0) {
            System.out.println("Enter names!");
            return;
        }

        int[] nameLength = new int[names.length];

        //map name array to length array
        for (int i = 0; i < names.length; i++) {
            nameLength[i] = names[i].length();
        }

        //find max length in the array
        int max = nameLength[0];
        for (int i = 0; i < nameLength.length; i++) {
            if(nameLength[i]>max) max = nameLength[i];
        }

        //find position of max
        int maxPosition = 0;
        for (int i = 0; i < nameLength.length; i++) {
            if(nameLength[i] == max) maxPosition = i;
        }

        //get name of the position
        System.out.print("Long name: "+names[maxPosition]);
    }
}
