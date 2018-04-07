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
public class StatementSwitch {
    public static void main (String[] args){
        int nilai = 78;
        switch(nilai){
            case 100 :
                System.out.println("Sangat Bagus");
                break;
            case 90 :
                System.out.println("Bagus Sekali");
                break;
            case 80 :
                System.out.println("Bagus");
                break;
            case 70 :
                System.out.println("cukup");
                break;
            default :
                System.out.println("Maaf Anda Tidak Lulus");
        }
    }
    
}
