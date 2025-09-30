package com.pluralsight;

import java.util.jar.JarEntry;

public class Menu {

    //the method we will call our method
    public static void main(String[] args) {

    String first = "J";
    String last = "D";

    String fullName = formatName(first, last);

    System.out.println(fullName);


    }

    public static String formatName(String first, String Last){
        return Last + ", "+ first;
    }
}

