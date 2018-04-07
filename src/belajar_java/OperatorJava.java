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
public class OperatorJava {
    public static void main(String[] args){
        //Sedikit angka
        int x = 25;
        int y = 50;
        double z = 5.5;
        double a = 3.14;
        System.out.println("Value");
        System.out.println("X = " +x);
        System.out.println("Y = " +y);
        System.out.println("Z = " +z);
        System.out.println("A = " +a);
        //Penjumlahan
            System.out.println("Penjumlahan");
            System.out.println("===========");
            System.out.println("X + Y = "+ (x + y));
            System.out.println("X + Z = " +(x + z));
            System.out.println("X + A = " +(x + a));
            System.out.println("Y + Z = " +(y+z));
            System.out.println("Y + A = " +(y+a));
            System.out.println("Z + A = " +(z+a));
        //Pengurangan
            System.out.println("Pengurang");
            System.out.println("=========");
            System.out.println("Y - X = " +(y-x));
            System.out.println("Y - Z = " +(y-z));
        //Perkalian
            System.out.println("Perkalian");
            System.out.println("=========");
            System.out.println("X * Y = " +(x*y));
            System.out.println("X * Z = " +(x*z));
        //Pembagian
            System.out.println("Pembagian");
            System.out.println("=========");
            System.out.println("Y / X = "+(y/x));
            System.out.println("Y / Z = "+(y/z));
        //Modulus
            System.out.println("Modulus");
            System.out.println("=======");
            System.out.println("Y % X = "+(y%x));
            System.out.println("Y & A = "+(y%a));
        //Increments
            System.out.println("Increment");
            System.out.println("=========");
            System.out.println("++X + Y = "+(++x + y));
            System.out.println("Y++ - X =" +(y++ - x));
        //Decrements
            System.out.println("Decrement");
            System.out.println("=========");
            System.out.println("--Y * X = " +(--y * x));
            System.out.println("Z-- - A = " +(z-- - a));
    }
    
}
