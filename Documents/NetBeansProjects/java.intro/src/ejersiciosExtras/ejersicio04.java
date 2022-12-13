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
public class ejersicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int numero;
        numero = valor.nextInt();
        while (numero < 1 || numero > 10) {
            System.out.println("Ingrese numero");
            numero = valor.nextInt();
        }
        switch (numero) {
            case 1:
                System.out.println("Numero ingresado es I en Romano");
                break;
            case 2:
                System.out.println("Numero ingresado es II en Romano");
                break;
            case 3:
                System.out.println("Numero ingresado es III en Romano");
                break;
            case 4:
                System.out.println("Numero ingresado es IV en Romano");
                break;
            case 5:
                System.out.println("Numero ingresado es V en Romano");
                break;
            case 6:
                System.out.println("Numero ingresado es VI en Romano");
                break;
            case 7:
                System.out.println("Numero ingresado es VII en Romano");
                break;
            case 8:
                System.out.println("Numero ingresado es VIII en Romano");
                break;
            case 9:
                System.out.println("Numero ingresado es IX en Romano");
                break;
            case 10:
                System.out.println("Numero ingresado es X en Romano ");
                break;
            default:
                throw new AssertionError();
        }

    }

}


