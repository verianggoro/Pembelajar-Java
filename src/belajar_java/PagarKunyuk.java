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
public class PagarKunyuk {
    public static void main(String args[]){
        int a,b,c;
        for(a=1; a <= 10; a++){ //buat tinggi
        for(b=a; b<=10;  b++){ //buat spasi
            System.out.print(" ");
        }
        for(c=0; c<=(a*2)-2; c++){//buat bintang
            System.out.print("*");
        }
        System.out.println();
    }
    } 
}
