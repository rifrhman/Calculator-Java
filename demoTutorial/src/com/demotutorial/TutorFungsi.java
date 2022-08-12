package com.demotutorial;

import java.util.*;

public class TutorFungsi {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        System.out.print("Masukan Panjang : ");
        int masukPanjang = inp.nextInt();
        System.out.print("Masukan Lebar : ");
        int masukLebar = inp.nextInt();

        System.out.println();
        drawKotak(masukPanjang, masukLebar);
        System.out.println();

        tampilKelilingDanLuas(masukPanjang, masukLebar);

    }


    private static void drawKotak(int panjang, int lebar){
        for(int i = 0; i < lebar; i++){
            for (int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void tampilKelilingDanLuas(int panjang, int lebar){
        System.out.println("Luas nya adalah : " + luas(panjang, lebar));
        System.out.println("Keliling nya adalah : " + keliling(panjang, lebar));
    }
    private static int luas(int panjang, int lebar){
        int hasil;
        hasil = panjang * lebar;
        return  hasil;
    }

    private static int keliling(int panjang, int lebar){
        int hasil;
        hasil = (panjang + lebar) * 2;
        return hasil;
    }

/*

 public static void drawSegitiga(int dasar){
        for(int i = dasar; i >= 0; i--){
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void drawS(int dasars){
        for(int i = 0; i < dasars; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawSe(int dasarse){
        for (int i = 0; i < dasarse; i++){
            for (int j = dasarse; j >= i; j--){
                System.out.print(" "); // untuk spasi kiri ke samping
            }
            for (int k = 0; k <= i; k++){
                System.out.print("*"); // star dari kanan ke kiri
            }
            for (int l = 0; l <= i - 1; l++){
                System.out.print("*"); // star dari kiri ke kanan
            }
            System.out.print("\n");
        }
    }

 */


}
