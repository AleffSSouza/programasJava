
package conversão;

import java.util.Scanner;

public class Conversão {

    public static void main(String[] args) {
    double minuto,hora,total;

    Scanner entrada = new Scanner(System.in);
    
    System.out.println("digite a hora:");
     hora=entrada.nextDouble();
    System.out.println("digite os minutos:");
     minuto=entrada.nextDouble();
     
     total= (minuto/60)+hora;
     
      System.out.println("os minutos foram convertidos em:"+total+"décimos" );
     
     
     
        
        
        
    }
   
}
