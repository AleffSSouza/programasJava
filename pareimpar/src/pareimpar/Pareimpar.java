/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pareimpar;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Pareimpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int numero;

      
        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite qualquer número"));

       
        if ((numero % 2)==0){

            JOptionPane.showMessageDialog(null, "Seu número é par!");

        }else{

            JOptionPane.showMessageDialog(null, "Seu número é ímpar!");

        }

    }
}
    
    

