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
public class ejersicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] mat = new int[10][10];
        int[][] mat2 = new int[3][3];
        llenar(mat);
        System.out.println();
        llenar(mat2);
        Buscar(mat, mat2);
    }

    public static void llenar(int[][] mat) {
        int longitud = mat.length;
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                mat[i][j] = (int) (Math.random() * 2);
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println();
        }
    }

    public static void Buscar(int[][] mat, int[][] mat2) {
        boolean bandera, bandera2;
        int i, j, i1, j1;
        bandera = true;
        i = 0;
        bandera2 = false;
        do {
            j = 0;
            do {
                i1 = 0;
                do {
                    j1 = 0;
                    do {
                        bandera2 = (mat[i + i1][j + j1] == mat2[i1][j1]);
                        j1++;
                    } while (bandera2 && j1 < 3);
                    i1++;
                } while (bandera2 && i1 < 3);
                if (bandera2) {
                    bandera = false;
                    System.out.println("Se encontro la matriz");
                    System.out.println("posicion i:" + i + "posicion en j:" + j );
                }
                j++;
            } while (bandera && j < 8);
            i++;
        } while (bandera && i < 8);

        if (bandera) {
            System.out.println("No se encontro");
        }
    }

}
