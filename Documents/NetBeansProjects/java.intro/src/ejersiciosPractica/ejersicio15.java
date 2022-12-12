/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejersiciosPractica;

/**
 *
 * @author nahuel
 */
public class ejersicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arreglo = new int[100];
        llenar(arreglo);
    }
    public static void llenar(int[] arreglo){
        for (int i = 0; i<arreglo.length; i++) {
                arreglo[i]=i;
         
        }
        for (int i = arreglo.length-1; i >=0; i--) {
            System.out.println(arreglo[i]);
        }      
    }  
}
