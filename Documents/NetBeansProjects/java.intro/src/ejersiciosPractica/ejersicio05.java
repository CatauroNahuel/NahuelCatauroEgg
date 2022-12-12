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
public class ejersicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num=leer.nextInt();
        System.out.println("el doble del numero es " + num*2);
        System.out.println("el triple del numero es " + num*3);
        System.out.println("la raiz cuadrada del numero es " + Math.sqrt(num));
    }
    
}
