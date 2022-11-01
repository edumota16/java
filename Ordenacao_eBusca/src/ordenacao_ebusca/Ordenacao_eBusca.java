/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacao_ebusca;

import java.util.Arrays;
/**
 *
 * @author Duloko
 */
public class Ordenacao_eBusca {

    public static int buscaSeq (int[]vetor, int num){
        for(int i=0; i<vetor.length;i++){
            if (vetor[i]==num) return i;
        }
    return -1;    
    }
    public static int buscaBin(int[]vetor, int num){
        int fim = vetor.length-1;
        int inicio = 0;
        while(inicio<=fim){
            int meio = (fim+inicio)/2;
            if(vetor[meio]<num)inicio=meio+1;
            else
                if(vetor[meio]>num)fim=meio-1;
                else
                return meio;
        }
        return (-1);
    }
    public static void bolha(int[]vetor){
       for(int ult=vetor.length-1;ult>0;ult--){ 
        for(int i=0;i<ult;i++){
            if(vetor[i]>vetor[i+1]){
                int aux = vetor[i];
                vetor[i]=vetor[i+1];
                vetor[i+1]=aux;
            }
        }
       } 
    }
              
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println(buscaSeq(new int[]{3,7,5,9,6,4,3},4));
    System.out.println(buscaBin(new int[]{3,7,5,11,6,4,2,8,9},8));  
    
    int []v = {2,8,-4,-6,9,5,-7,8,-2,-5,7,4};
    bolha(v);
    for(int valor:v){
        System.out.print(valor+" ");
          }
    System.out.println("");
    System.out.println(buscaBin(v,-2)); 
        }
    }
    

