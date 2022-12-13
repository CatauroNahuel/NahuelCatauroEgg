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
public class ejersicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array");
        int dimension=valor.nextInt();
        int [] arreglo = new int [dimension];
        llenar(arreglo);
        //bubbleSort(arreglo);
        System.out.println();
        System.out.println("Ingrese numero a buscar");
        int num=valor.nextInt();
        buscar(arreglo,num);
        
    }
    
   public static void buscar(int[] arreglo, int num){    
       int superior=arreglo.length;
       int cont;
       cont=0;
       int i;
       i=0;
       while (i<superior ) {
           if(arreglo[i]==num){      
                cont=cont+1;
            }
            i++;
       }
       System.out.println("El numero: "+num+" lo encontramos: "+cont+" veces");
   } 
    
   public static void llenar(int[] arreglo){
        for (int i = 0; i<arreglo.length; i++) {
                arreglo[i]=(int) (Math.random() * 10);
        }
        for (int i = 0; i <arreglo.length-1; i++) {
            System.out.print(arreglo[i]+", ");
       }
    }
     
   public static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }                                           }  
         } 
         for (int i = 0; i <arr.length-1; i++) {
                    System.out.println();
                    System.out.print(arr[i]+", ");
       }
    }
}
