package com.demotutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int angkaAwal, angkaKedua, operator, result = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("======= KALKULATOR SEDERHANA =======");
        System.out.println("====================================");
        System.out.println();
        System.out.println("Silahkan Pilih Operator Kalkulator");
        System.out.println();
        System.out.println("1. Penjumlahan" );
        System.out.println("2. Pengurangan" );
        System.out.println("3. Perkalian" );
        System.out.println("4. Pembagian" );
        System.out.println("5. Sisa Bagi" );


        System.out.print("Masukan Angka Awal : ");
        angkaAwal = inp.nextInt();
        System.out.print("Masukan Angka Kedua : ");
        angkaKedua = inp.nextInt();

        System.out.print("Masukan Operator Berdasarkan Nomor :");
        operator = inp.nextInt();

        switch (operator) {
            case 1 : result = angkaAwal + angkaKedua; break;
            case 2 : result = angkaAwal - angkaKedua; break;
            case 3 : result = angkaAwal * angkaKedua; break;
            case 4 : result = angkaAwal / angkaKedua; break;
            case 5 : result = angkaAwal % angkaKedua; break;
            default : System.out.println("Operator yang anda masukan tidak ada");
        }

        System.out.println("Hasil : " + result);


    }
}
