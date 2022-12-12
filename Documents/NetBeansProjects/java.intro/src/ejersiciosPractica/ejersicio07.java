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
public class ejersicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase=leer.nextLine();
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        }
        else{
            System.out.println("incorrecto");
        }
    }
    
}
