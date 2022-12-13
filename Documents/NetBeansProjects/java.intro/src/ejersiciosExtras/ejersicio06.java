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
public class ejersicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner valor =new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int cantidad=valor.nextInt();
        int cont=0;
        double cont1=0;
        double cont2=0;
        double alturas;
        for (int i = 0; i <cantidad; i++) {
            System.out.println("Ingrese la alturas");
            alturas=valor.nextDouble();
            if(alturas<1.60){
                cont=cont+1;
                cont1+=alturas;
            }
               cont2+=(alturas/cantidad);
        }
        
            cont1=cont1/cont;
            System.out.println("Promedio de menores a 1.60 "+cont1);
            System.out.println("Promedio general "+cont2);
    }
    
}
