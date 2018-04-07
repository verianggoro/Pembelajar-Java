/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar_java;

/**
 *
 * @author veri
 */
public class Lathian_Operator_Logika {
    public static void main (String[] args){
        //Nomor satu
        /*
        *Mendeklarasikan dan mencetak variabel
        */
        int number = 10;
        char letter = 'a';
        boolean result = true;
        String str = "Hello";
        System.out.println("Number = " +number);
        System.out.println("Letter = " +letter);
        System.out.println("Result = " +result);
        System.out.println("Str = " +str);
        System.out.println("=======================================");
        //Nomor dua
        /*
        Mencari Rata rata sebuah nilai
        */
        int angka1 = 10;
        int angka2 = 20;
        int angka3 = 45;
        System.out.println("Angka 1 = " +angka1);
        System.out.println("Angka 2 = " +angka2);
        System.out.println("Angka 3 = " +angka3);
        System.out.println("Rata rata = " +((angka1 + angka2 + angka3)/3));
        System.out.println("==================================================");
        //Nomor tiga
        /*
        Menampilkan Nilai terbesar dengan ?:
        */        
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        String nilai = "";
        nilai = (number1 > number3)?"Nilai Tertingginya adalah = "+number2:"Nilai terendahnya adalah = "+number3;
        System.out.println("Number 1 = " +number1);
        System.out.println("Number 2 = " +number2);
        System.out.println("Number 3 = " +number3);
        System.out.println(nilai);
        System.out.println("=========================================================");
    }
}
