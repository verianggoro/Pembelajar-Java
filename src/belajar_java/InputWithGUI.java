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
public class InputWithGUI {
    public static void main (String[] args){
        String name = "";
        name = JOptionPane.showInputDialog("Please Enter Your Name ? ");
        String tv = "Hello My Name is " +name+ "!!";
        JOptionPane.showMessageDialog(null, tv);
    }
}
