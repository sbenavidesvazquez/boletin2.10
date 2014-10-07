//cuantos billetes de 100, 20, 5 y monedas de 1 hay en total
package boletin2.pkg10;

import java.util.Scanner;


public class Boletin210 {

    
    public static void main(String[] args) {
    float dinero;
    
    System.out.print("dinero= ");
    Scanner dato= new Scanner(System.in);
    dinero=dato.nextFloat();
    
    System.out.println("billetes de 100= "+ (int)dinero/100);
    System.out.println("billetes de 20= "+ (int)dinero%100/20);
    System.out.println("billetes de 5= "+ (int)dinero%100%20/5);
    System.out.println("monedas de 1= "+ (int)dinero%100%20%5);
    
    }
    
}
