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
public class ejersicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner valor = new Scanner(System.in);
        double descuentos;
        System.out.println("Ingrese la clase del socio");
        char caracter = valor.next().charAt(0);
        System.out.println("Ingrese el monto");
        double numero;
        numero = valor.nextInt();
        switch (caracter) {
            case 'A':
                descuentos = numero * 0.5;
                System.out.println("El Precio total es: "+descuentos);
                break;
            case 'B':
                descuentos = numero * 0.35;
                System.out.println("El Precio total es: "+descuentos);
                break;
            case 3:                   
                System.out.println("Precio total"+numero);
                break;
            default:
                System.out.println("Clase incorrecta");
        }

    }

}
