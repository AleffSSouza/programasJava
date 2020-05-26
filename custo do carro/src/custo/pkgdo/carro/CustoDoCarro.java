
package custo.pkgdo.carro;

import java.util.Scanner;

public class CustoDoCarro {

    public static void main(String[] args) {
        
        double custocarro,totalone,totaltwo;
        
        Scanner entrada= new Scanner(System.in);
         
        System.out.println("qual o valor do veiculo de fabrica:");
        custocarro= entrada.nextDouble();
        
        totalone=(1.48*custocarro);
        totaltwo=(1.28*totalone);
        
         System.out.println("preço de venda do carro é:"+totaltwo);
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
