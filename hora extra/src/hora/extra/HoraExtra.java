
package hora.extra;

import java.util.Scanner;

public class HoraExtra {

    public static void main(String[] args) {
        
        double horas,minutos,money,tempo
               ,resultado,faturou,total;
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("quantas horas extras trabalhadas?");
        horas=entrada.nextDouble();
         System.out.println("quantas minutos extras trabalhados?");
         minutos=entrada.nextDouble();
         System.out.println("quanto ganha por hora trabalhada?");
        money=entrada.nextDouble();
        
       tempo=(minutos/60)+ horas;
        faturou=(tempo*money);
       resultado=(faturou*0.7);
        total=(faturou+resultado);
        
         System.out.println("você ganhou com os 70%: "+total+"R$ a mais pelas suas horas extras trabalhadas");
        
        
        
        
                
        
        
        
        
        
        

    }
    
}
