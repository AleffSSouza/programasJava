
package preçogasolina;

import java.util.Scanner;

public class Preçogasolina {

    public static void main(String[] args) {
      double km,preco,consome,totalone,two,three;
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("quantos quilôlometros vc irá andar ?");
        km= entrada.nextDouble();
        System.out.println("quantoo carro consome de gasolina ao andar ?");
        consome= entrada.nextDouble();
        System.out.println("qual o preço medio da gasolina ?");
        preco= entrada.nextDouble();
        
        totalone= (km/consome);
        two=(totalone*preco);
        three=(two*2);
        
        System.out.println("você gastará em média"+two+"R$ para ida ou"+three+"R$ para ida e volta");
        
        
        
        
        
       
        
        
        
    }
    
}
