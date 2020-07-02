/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Carro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade;
        string habilitado;

       
        idade= Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade:"));

        
        if (idade>=18){
        JOptionPane.showInputDialog(null, "Você possui habilitação senhor(a)?");

          if (habilitado="sim"){
              
           JOptionPane.showInternalMessageDialog(null, "Pode passar);
          }else{
              JOptionPane.showMessageDialog(null, "Carro rebocado");
          }
        }else{
              JOptionPane.showMessageDialog(null, "Não poderá seguir ");
        }
    }
    
}
