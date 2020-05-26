
package velocidade.media.java;

import java.util.Scanner;

public class VelocidadeMediaJava {

    public static void main(String[] args) {
   double km,hora,minutos,tempototal,respfinal;
   
   Scanner entrada= new Scanner(System.in);
   
   System.out.println("Quantos quilômetros você percorreu ?");
   km= entrada.nextDouble();
    System.out.println("em quantas horas você percorreu está distância ?");
   hora= entrada.nextDouble();
     System.out.println("em quantos minutos você percorreu está distância ?");
   minutos= entrada.nextDouble();
     
   tempototal= (minutos/60) + hora;
   respfinal= (km/tempototal);
   
      
     System.out.println("sua velocidade media era: "+respfinal+"km/h");
   
   
           
   
   
   
   
   
    }
    
}
