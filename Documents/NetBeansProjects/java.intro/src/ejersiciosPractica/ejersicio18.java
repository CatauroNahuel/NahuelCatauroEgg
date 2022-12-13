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
public class ejersicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int[][] mat=new int[3][3];
       int[][] matTras=new int[3][3];
       matriz(mat);
        System.out.println();
       Traspuesta(mat,matTras);
    }
    
            
    public static void Traspuesta(int[][] mat,int[][] matTras){
        for (int i = 0; i<mat.length; i++) {
            for (int j = 0; j <3; j++) {
                matTras[j][i]=mat[i][j];
         }
        }
        
         for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(matTras[i][j]);
            }
            System.out.println();
        }
    }
    public static void matriz(int[][] mat){
        Scanner valor=new Scanner(System.in);
        for (int i = 0; i<mat.length; i++) {
            for (int j = 0; j <3; j++) {
              mat[i][j]=valor.nextInt();
            }
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
