
package somadosnumeros;

import java.util.Scanner;

public class Somadosnumeros {

    private static double quad;

    public static void main(String[] args) {

        double n1,n2,n3,n4,total,quad;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite o primeiro numero:");
        n1=entrada.nextDouble();
        System.out.println("digite o segundo numero:");
        n2=entrada.nextDouble();
        System.out.println("digite o terceiro numero:");
        n3=entrada.nextDouble();
        System.out.println("digite o quarto numero:");
        n4=entrada.nextDouble();
        quad=2;
                
        total =Math.pow(n1,quad)+(Math.pow(n2,quad))+(Math.pow(n3,quad))+(Math.pow(n4,quad));
        
      System.out.println("O total e "+total);
      
      
                
        
       
        
        
        
        
        
        
        
        
        
        
    }
    
}
