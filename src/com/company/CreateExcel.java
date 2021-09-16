package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class CreateExcel {
    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("GhasemiFamily.csv");
        PrintWriter pw =new PrintWriter(fos);

        pw.println("Name,Age,Weight");
        pw.println("Hossein,20,82");
        pw.println("Vahid,24,86");
        pw.close();

        System.out.println("Ghasemi Family Information");
    }
}
