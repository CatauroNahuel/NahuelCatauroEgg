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
public class ejersicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el monto en euros a comvertir");
        double m=leer.nextDouble();
        System.out.println("A que cambio");
        System.out.println("Dolar");
        System.out.println("Yen");
        System.out.println("Libras");
        String c = leer.next();
        Conversion(m,c);
    }
    public static void Conversion(double moneda, String cambio) {

        switch (cambio) {
            case "dolar":
                moneda=moneda * 1.28611;
                System.out.println("Dolar: " + moneda);
                break;
            case "yen":
                moneda = moneda * 129.852;
                System.out.println("Yen: " + moneda);
                break;
            case "libras":
                moneda = moneda * 0.86;
                System.out.println("libras: " + moneda);
                break;
            default:
                System.out.println("Cambio incorrecto");
                break;
        }
    }
   
    
}
