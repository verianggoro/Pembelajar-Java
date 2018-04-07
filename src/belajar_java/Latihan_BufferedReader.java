/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar_java;
    import java.io.InputStreamReader;
    import java.io.BufferedReader;
    import java.io.IOException;
/**
 *
 * @author veri
 */
public class Latihan_BufferedReader {
    public static void main (String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader ( System.in));
        String word1 = "";
        System.out.print("Masukan Kata 1 : ");
        try{
            word1 = dataIn.readLine();
        }catch (IOException e){
            System.out.println("Error");
        }
        String word2 = "";
        System.out.print("Masukan Kata 2 : ");
        try {
            word2 = dataIn.readLine();
        }catch (IOException e){
            System.out.println("Error");
        }
        System.out.println(word1+ " and " +word2);
    }
}
