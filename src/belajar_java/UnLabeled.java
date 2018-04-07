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
public class UnLabeled {
    public static void main(String args[]){
        String Hero[] = {"Roger", "Eudora", "Lancelot", "Zhack", "Lesley","Harley"};
        String SearchHero = "Harley";
        boolean foundHero = false;
        for (int i = 0; i < Hero.length; i++){
            if (Hero[i].equals(SearchHero)){
                foundHero = true;
                break;
            }
        }
        
            if (foundHero){
                System.out.println(SearchHero + " Ditemukan");
            }else{
                System.out.println(SearchHero + " Tidak Ditemukan");
            }    
            } 
        }
