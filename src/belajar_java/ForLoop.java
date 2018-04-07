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
public class ForLoop {
    public static void main(String args[]){
        int x, y, z;
        for(x = 1;x <= 10; x++){
        for(y = x;y <= 10; y++){
            System.out.print(" ");
        }
        for(z = 0; z <= (x * 2) - 2; z++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
    
}
