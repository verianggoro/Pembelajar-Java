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
public class WhileLooping {
    public static void main(String args[]){
        System.out.println("Contoh Perulangan Looping dengan while");
        int a = 10;
        while( a > 0){
            System.out.println(a);
            a--;
        }
        System.out.println("==============================================");
        System.out.println("Contoh 2");
        int x = 1;
        while( x < 10){
            System.out.println(x);
            x++;
        }
        System.out.println("==============================================");
        System.out.println("Contoh 3");
        int y = 10;
        while( y > 0 ){
            System.out.println("Hello Semuanya");
            y--;
        }
    }
    
}
