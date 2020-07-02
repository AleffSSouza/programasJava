/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impostoderenda;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Impostoderenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        double sal, total;

        sal= Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário:"));

       
        if (salario<=1903.98){
        total = 0;
        }
        else if((sal>=1903.99) && (sal<=2826.65)){
        total = sal * 0.075;
        }
        else if ((sal>=2826.66) && (sal<=3751.05)){
        total = sal * 0.15;
        }
        else if ((sal>=3751.06) && (sal<=4664.68)){
        total = sal * 0.225;
        }else{   
        total = sal * 0.275;
        }

        JOptionPane.showMessageDialog(null, "Você irá pagar de imposto de renda este valor: R$"+total);
        
        
        
        
        
        
        
        
        
    }
    
}
