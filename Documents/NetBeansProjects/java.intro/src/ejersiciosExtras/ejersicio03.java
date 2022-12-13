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
public class ejersicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner valor = new Scanner(System.in);
       System.out.println("Ingrese letra ");
       String caracter=valor.next();
       caracter=caracter.toUpperCase();
       if(caracter.equals("A") || caracter.equals("E") || caracter.equals("I") || caracter.equals("O") || caracter.equals("U")){
           System.out.println("Letra ingresada vocal");
       }else{
           System.out.println("Letra ingresada no es vocal");
       }
    }
    
}
