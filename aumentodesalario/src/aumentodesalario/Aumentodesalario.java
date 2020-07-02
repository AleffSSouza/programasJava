/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aumentodesalario;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Aumentodesalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sal,total;

       
        sal= Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário:"));

       
        if (sal<=1500){
            total= sal * 1.2;
        }

        else if ((sal>1500) && (sal<=3000)){
            total= sal * 1.15;
        }

        else{
            total= sal * 1.1;
        }

        JOptionPane.showMessageDialog(null, "De acordo com seu salário, seu aumento irá para: R$"+total);

    }
    
}
