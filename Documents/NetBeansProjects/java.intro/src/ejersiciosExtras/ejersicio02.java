/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejersiciosExtras;

import java.util.Scanner;

/**
 *
 * @author nahuel
 */
public class ejersicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el valor de A");
        int A = leer.nextInt();
        System.out.println("ingrese el valor de B");
        int B = leer.nextInt();
        System.out.println("ingrese el valor de C");
        int C = leer.nextInt();
        System.out.println("ingrese el valor de D");
        int D = leer.nextInt();
        System.out.println("el valor original de A es " + A);
        System.out.println("el valor original de B es " + B);
        System.out.println("el valor original de C es " + C);
        System.out.println("el valor original de D es " + D);
        int AUX = B;
        B = C;
        C = A;
        A = D;
        D = AUX;
        System.out.println("el valor final de A es " + A);
        System.out.println("el valor final de B es " + B);
        System.out.println("el valor final de C es " + C);
        System.out.println("el valor final de D es " + D);
    }

}
