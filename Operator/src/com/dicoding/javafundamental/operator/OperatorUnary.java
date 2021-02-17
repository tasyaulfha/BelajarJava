package com.dicoding.javafundamental.operator;

import java.util.Optional;

public class OperatorUnary {
    public static void main (String[]args){
        System.out.println("Operator Unary Plus");
        int nilaiAwal = 5;
        int hasil = +nilaiAwal;
        System.out.println("Hasilnya +5 adalah" + nilaiAwal);
        System.out.println();


        System.out.println("Operator Unary Minus");
        int nilaiAwal2 =5;
        nilaiAwal2 = -nilaiAwal2;
        System.out.println("Hasil -5 adalah" +nilaiAwal2);
        System.out.println("");

        System.out.println("Operator peningkatan nilai sebesar 1 point");
        int nilaiAwal3 = 5;
        nilaiAwal3++;
        System.out.println("Hasilnya 5++ adalah" + nilaiAwal3);
        System.out.println();

        System.out.println("Operator pengurangan nilai sebesar 1 point");
        int nilaiAwal4 = 5;
        nilaiAwal4--;
        System.out.println("Hasil 5-- adalah" +nilaiAwal4);
        System.out.println();

        System.out.println("Operator komplemen logika");
        boolean sukes= false;
        System.out.println("Hasil !False :"  + !sukes);
        System.out.println();



    }
}
