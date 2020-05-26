
package cotação;

import java.util.Scanner;

public class Cotação {

    public static void main(String[] args) {
        double valor,dolar,resp;
        
       Scanner entrada = new Scanner(System.in);
       
       System.out.println("O valor do dolar é:");
      dolar =entrada.nextDouble();
      
        System.out.println("você ira converter: R$");
      valor =entrada.nextDouble();
      
      resp=(valor/dolar);
      
     System.out.println("você terá: R$"+resp);
      
      
      
       
               
               
        
        
        
        
        
        
    }
    
}
