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
public class Statement_IF {
    public static void main (String[] args){
        //Statement if
        int nilai = 70;
        if (nilai >= 70){
            System.out.println("Selamat Anda Lulus");
        }    
        System.out.println("===========================");
        //Statement if-else
        int value = 60;
        if (value >= 70){
            System.out.println("Selamat Anda Lulus");
        }else {
            System.out.println("Anda Tidak Lulus");
        }
        System.out.println("============================");
        //Statement if - else - if
        int angka = 80;
        if (angka >= 90){
            System.out.println("Sangat Bagus");
        }else if (angka >= 70 && angka <= 90){
            System.out.println("Bagus");
        }else
            System.out.println("Cukup");
        System.out.println("=============================");
        //Statement if-else-else if
        double grade = 92.0;
        if (grade >= 80){
            System.out.println("Sangat bagus");
        }    else if ((grade <= 80) && (grade >= 70)){
            System.out.println("baik");
        } else if ((grade <= 70) && (grade >= 65 )){
            System.out.println("Cukup");
        }else { System.out.println("Kurang");
        }
    }
}
