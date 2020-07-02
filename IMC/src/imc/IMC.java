/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        double alt,peso,imc;
        
        alt= Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));

        peso= Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:"));

      
        imc=(peso/(alt*alt);

        if (imc<=18.5){
            JOptionPane.showMessageDialog(null, "Você está abaixo do peso!");
        }

        if ((imc>=18.6) && (imc<=24.9)){
            JOptionPane.showMessageDialog(null, "Você está com o peso normal para sua estatura!");
        }

        if ((imc>=25) && (imc<=29.9)){
            JOptionPane.showMessageDialog(null, "Você está acima do peso!");
        }

        if ((imc>=30) && (imc<=34.9)){
            JOptionPane.showMessageDialog(null, "Você está na faixa de obesidade grau 1!");
        }

        if ((imc>=35) && (imc<=39.9)){
            JOptionPane.showMessageDialog(null, "Você está na faixa de obesidade grau 2!");
        }

        if (imc>=40){
            JOptionPane.showMessageDialog(null, "Você está na faixa de obesidade grau 3!");
        }

        JOptionPane.showMessageDialog(null, "Seu IMC é: "+imc);

    }
    
}
