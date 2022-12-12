/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejersiciosTeoria;

import java.util.Scanner;

/**
 *
 * @author nahuel
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer  =  new Scanner(System.in);
        System.out.println("Ingresar el primer numero");
        int numero1 = leer.nextInt();
        System.out.println("Ingresar el segundo numero");
        int numero2 = leer.nextInt();
        
        if (numero1 > 25 & numero2 > 25 ) {
             System.out.println("Los dos numero son mayor a 25");
        } else if (numero1> 25) {
            System.out.println("el primer numero es mayor a 25");
        } else if (numero2> 25) {
            System.out.println("el segundo numero es mayor a 25");
        } else System.out.println("ninguno de los dos numeros son mayores");
    }    
}