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
public class PraktikumTigaA {
    public static void main (String args[]){
        double panjang = 25;
        double lebar = 10;
        double jumlah, kurang, kali, bagi, modulus;
        
        //operasi
        jumlah = panjang + lebar;
        kurang = panjang - lebar;
        kali = panjang * lebar;
        bagi = panjang / lebar;
        modulus = panjang % lebar;
        
        System.out.println(jumlah);
        System.out.println(kurang);
        System.out.println(kali);
        System.out.println(bagi);
        System.out.println(modulus);
    }
}
