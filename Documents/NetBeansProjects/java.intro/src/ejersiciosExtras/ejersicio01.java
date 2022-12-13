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
public class ejersicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer= new Scanner(System.in);
         System.out.println("ingrese un tiempo en minutos");
         int tiempo=leer.nextInt();
         int horas=Math.floorDiv(tiempo,60);
         tiempo=tiempo%60;
         int dias=Math.floorDiv(horas,24);
         horas=horas%24;
         System.out.println("el tiempo equibale a " + dias + " dias, " + horas + " horas y " + tiempo + " minutos");
    }
    
}
