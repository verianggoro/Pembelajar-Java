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
public class DoWhileLooping {
    public static void main(String args[]){ 
    System.out.println("Contoh Sederhana Do While");
        int x = 0;
        do{
        System.out.println(x);
        x++;
        }while(x < 10);
    
    System.out.println("Contoh kedua do While");
        int u = 0;
        do {
            System.out.println("Saya adalah " +u);
            u++;
        }while(u < 10);
    System.out.println("Contoh ketiga do while");
        int p = 12;
        do {
            System.out.println("Saya Urutan Ke " +p);
            p--;
        }while(p > 0);
    
    }
}