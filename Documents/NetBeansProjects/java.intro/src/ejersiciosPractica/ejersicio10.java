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
public class ejersicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el limite positibo");
        int limite=leer.nextInt();
        int num,suma;
        suma=0;
        do {
            System.out.println("ingrese un numero");
            num=leer.nextInt();
            suma=suma+num;
        }while(suma<limite);
               
    }
    
}
