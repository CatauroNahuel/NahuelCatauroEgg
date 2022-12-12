/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejersiciosPractica;

import java.util.Scanner;

/**
 *
 * @author nahuel
 */
public class ejersicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, suma;
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese un numero");
        num1=leer.nextInt();
        System.out.println("ingrese el segundo numero");
        num2=leer.nextInt();
        suma=num1+num2;
        System.out.println("la suma es: " + suma);
    }
    
}
