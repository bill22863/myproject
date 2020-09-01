package com.bill.io;

import java.io.*;

public class Tester {
    public static void main(String[] args) {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());

        try {
            InputStream is = new FileInputStream(file);
            int n = is.read();
            while (n != -1){
                System.out.print((char)n);
                n = is.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("檔案開啟成功");
    }
}
