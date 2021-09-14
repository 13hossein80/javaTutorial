package com.company;


import java.io.File;
import java.io.IOException;

public class Main {
    public static void printInformation(int number) throws Exception {
        if (number == 0) {
            System.out.println("this is kahr");
        } else if (number == 1){
            throw new IllegalAccessException("pish");
        } else if (number == 2) {
            throw new ArithmeticException("salam");
        } else if (number == 3) {
            throw new NullPointerException("null");
        } else if (number == 4) {
            throw new VahidException("vahiiiiiiiiid","pishi");
        } else {
            throw new Exception("number khare");
        }
    }

    public static void main(String[] args) {
        try {
            printInformation(4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}