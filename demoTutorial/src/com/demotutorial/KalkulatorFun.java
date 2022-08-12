package com.demotutorial;

import java.util.*;

public class KalkulatorFun {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        int a,b,operasi;
        System.out.println("============================");
        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.println("============================");
        System.out.println();

        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

       while (true){
           System.out.print("Masukan Nomor Operator (Angka) : ");
           operasi = inp.nextInt();
           if (operasi < 1 || operasi > 4){
               System.out.println("Tidak ada operator yang dipilih / Operator Salah");
               continue;
           }
           break;
       }

        if (operasi == 1) {
            System.out.println("--- 1. PENJUMLAHAN ---");
        } else if (operasi == 2) {
            System.out.println("--- 2. PENGURANGAN ---");
        } else if (operasi == 3) {
            System.out.println("--- 3. PERKALIAN ---");
        } else {
            System.out.println("--- 4. PEMBAGIAN ---");
        }

        System.out.print("Masukan Angka Pertama : ");
        a = inp.nextInt();
        System.out.print("Masukan Angka Kedua : ");
        b = inp.nextInt();

        if(operasi == 1){
            System.out.println("Perjumlahan dari : " + a + " + " + b + " = " + penjumlahan(a, b));
        } else if(operasi == 2){
            System.out.println("Pengurangan dari : " + a + " - " + b + " = " + pengurangan(a, b));
        } else if (operasi == 3) {
            System.out.println("Perkalian dari : " + a + " x " + b + " = " + perkalian(a, b));
        } else {
            System.out.println("Pembagian dari : " + a + " / " + b + " = " + pembagian(a, b));
        }


    }

    private static int penjumlahan(int a, int b){
       int hasil;
       hasil = a + b;
       return  hasil;
    }
    private static int pengurangan(int a, int b){
        int hasil;
        hasil = a - b;
        return  hasil;
    }
    private static int perkalian(int a, int b){
        int hasil;
        hasil = a * b;
        return  hasil;
    }
    private static float pembagian(float a, float b){
        float hasil;
        hasil = a / b;
        return  hasil;
    }
}
