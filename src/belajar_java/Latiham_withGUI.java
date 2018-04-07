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
public class Latiham_withGUI {
    public static void main (String[] args){
        String word1 = "";
        word1 = JOptionPane.showInputDialog("Masukan Kata 1");
        String word2 = "";
        word2 = JOptionPane.showInputDialog("Masukan Kata 2 ");
        String tvmsg = word1+ " and " +word2;
        JOptionPane.showMessageDialog(null, tvmsg);
    }
}
