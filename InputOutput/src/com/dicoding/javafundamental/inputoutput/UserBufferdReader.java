package com.dicoding.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferdReader {
    public static void main(String[]args){
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program penjumlahan sangat sederhana");
        int value = 0;
        int anotherValue =0;
        try{
            System.out.println("Masukkan Angka pertama");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukkan angka kedua :");
            anotherValue = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah " + result);
    }
}
