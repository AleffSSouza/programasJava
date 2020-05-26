
package comição;

import java.util.Scanner;

public class Comição {

    public static void main(String[] args) {
        
        double quantidade,preco,totalone,totaltwo;
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Qual o valor da peça em preço unitário ?");
        preco= entrada.nextDouble();
        System.out.println("quantas foram vendidas?");
       quantidade= entrada.nextDouble();
       
       totalone=(quantidade*preco);
       totaltwo=totalone*0.05;
       
       System.out.println("valor total da venda é:"+totalone);
       System.out.println("O valor da comissão será:"+totaltwo);
}
}
