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
public class ejersicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese la temperatura en grados centigrados");
        double c= leer.nextDouble();
        double f=32+c*9/5;
        System.out.println("la temperatura en grados Fahrenheit es: " + f);
    }
    
}
