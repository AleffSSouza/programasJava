/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saquebanquario;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Saquebanquario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double retirar, saldoatual, saldofinal, limite;
    
    retirar= Double.parseDouble(JOptionPane.showInputDialog("quanto você deseja retirar:"));
    saldoatual=1000;
    limite=2000;
    
    saldofinal= saldoatual-retirar;
    
     if (saldofinal>=0){
        JOptionPane.showMessageDialog(null, "Seu saldo final é positivo com: R$"+saldofinal);
        }
     
      if ((saldofinal<0) && (saldofinal>=(-limite))){
        JOptionPane.showMessageDialog(null, "Seu saldo final é negativo com: R$"+saldofinal);

        }else{
          JOptionPane.showMessageDialog(null, "Você não possui limite suficiente. Seu limite é de: "+limite);  
        }


    }

}
     
    
    
    
}
