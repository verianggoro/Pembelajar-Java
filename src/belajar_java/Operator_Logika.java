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
public class Operator_Logika {
    public static void main (String[] args){
        int x = 0;
        int y = 10;
        boolean test = false;
        //Demonstrasi &&
        test = (x > 10) && (y++ > 9);
        System.out.println(x);
        System.out.println(y);
        System.out.println(test);
        //Demonstrasi &
        test = (x > 10) & (y++ > 9);
        System.out.println(x);
        System.out.println(y);
        System.out.println(test);
        //Demonstrasi || (or)
        test = (x < 10) || (y++ > 9);
        System.out.println(x);
        System.out.println(y);
        System.out.println(test);
        //Demonstrasi | (logika or)
        test = (x < 10) | (y++ > 9);
        System.out.println(x);
        System.out.println(y);
        System.out.println(test);
        //Demonstrasi XOR ^
        boolean log1 = true;
        boolean log2 = true;
        System.out.println(log1 ^ log2);
        boolean val1 = false;
        boolean val2 = true;
        System.out.println(val1 ^ val2);
        //Demonstrasi Not !
        boolean not1 = true;
        System.out.println(not1);
        boolean not2 = false;
        System.out.println(not2);
        //Operator Kondisi
        String hasil = "";
        int nilai = 80;
        hasil = (nilai > 75)?"Lulus":"Tidak Lulus";
        System.out.println(hasil);
    }   
}
