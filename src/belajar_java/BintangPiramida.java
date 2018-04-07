/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar_java;
import javax.swing.JOptionPane;

/**
 *
 * @author veri
 */
public class BintangPiramida {
    public static void main(String args[]){
        int bintang;
        bintang = Integer.parseInt(JOptionPane.showInputDialog("Masukan Tinggi Piramida : "));
        for(int t = 1; t <= bintang; t++){ //buat tinggi
        for(int s = t; s <= bintang; s++){ //Buat spasi
            System.out.print(" ");
        }
        for(int b = 0; b <= (t*2)-2; b++){
            System.out.print("*");//buat nulis bintang
        }
        System.out.println();
        }
    }
}
