/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizes;

/**
 *
 * @author Duloko
 */
public class Matrizes {

    public static int [][] somaMatriz(int a [][], int b [][]){
        int [][] resp = new int [a.length][a[0].length];
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[0].length;j++){
                resp[i][j] = a[i][j] + b[i][j];
            }
        }
    return resp;    
    }
    public static void imprimeMatriz(int[][]matriz){
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
        System.out.println("");
        }
    }
    public static void main(String[] args) {
        
    int m [][]= new int [][]{{2,4,5},{3,5,7}};
    
    somaMatriz (new int[][]{{3,3},{7,7}},new int[][]{{5,8},{7,4}});
    imprimeMatriz (somaMatriz(new int[][]{{2,2},{2,2}},new int[][]{{2,2},{2,2}}));
    imprimeMatriz (m);
       
    }
    
}
