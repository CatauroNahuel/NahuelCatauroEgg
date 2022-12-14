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
public class ejersicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int n1=0;
        int n2=0;
        String cadena;
        do {
            System.out.println("ingrese una cadena");
            cadena=leer.nextLine();
            if (!"&&&&&".equals(cadena)){
                if ((cadena.length()<=5)&&("X".equals(cadena.substring(0,1)))&&("O".equals(cadena.substring(cadena.length()-1,cadena.length())))){
                    n1++;
                }else{
                    n2++;
                }
            }
        } while (!"&&&&&".equals(cadena));
        System.out.println("la cantidad de cadenas corectas es " + n1);
        System.out.println("la cantidad de cadenas incorectas es " + n2);
    }
}
