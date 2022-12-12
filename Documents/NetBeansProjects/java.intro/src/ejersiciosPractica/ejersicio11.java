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
public class ejersicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1=leer.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2=leer.nextInt();
        String salir="N";
        int opcion;
        do{
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
            opcion=leer.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("la suma da" + (num1 + num2));
                break;
                case 2:
                    System.out.println("la resta da" + (num1 - num2));
                break;
                case 3:
                    System.out.println("la multiplicacion da" + (num1 * num2));
                break;
                case 4:
                    System.out.println("la divicion da" + (num1 / num2));
                break;
                case 5:
                    do{
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        salir=leer.next();
                    }while(!salir.equals("N")&!salir.equals("S"));
                break;
            }
        }while(salir.equals("N"));
    }
    
}

