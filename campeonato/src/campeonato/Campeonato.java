/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campeonato;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Campeonato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        double alt;
        int idade;

      
        alt= Double.parseDouble( JOptionPane.showInputDialog("Qual é a sua altura:"));

        idade= Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade:"));

        
        if ((alt>=1.75) && (idade>=18)){

            JOptionPane.showMessageDialog(null, "Você poderá participar do campeonato de vôlei por ter os requisitos");

        }else{

            JOptionPane.showMessageDialog(null, "Você não poderá participar do campeonato,por não ter o requisitos minímos!");
        }

