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
public class Operator_Relasi {
    public static void main (String[] args){
        int x = 50;
        int z = 45;
        double y = 6.80;
        //nilai variabel
        System.out.println("Nilai Variabel");
        System.out.println("X = "+x);
        System.out.println("Z = "+z);
        System.out.println("Y = "+y);
        //Operator Relasi
        System.out.println("X > Y = "+(x > y));
        System.out.println("X < y = "+(x < y));
        System.out.println("Y == Z = "+(y == z));
        System.out.println("Y != X = "+(y != x));
    }
}
