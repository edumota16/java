/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author Duloko
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* int n [] = new int [4];
        n[0]= 4;
        n[1]= 7;
        n[2]= 9;
        n[3]= 9;
        for (int i=0;i<n.length;i++){
            System.out.println(n[i]);*/
       
      /* int n[] = {0,5,7,9,11};
       for (int valor:n){
           System.out.println(valor);*/
      
     /* String mes[]= {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun",
          "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
      int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
      
      for(int i=0;i<mes.length;i++){
          System.out.println(mes[i] + " tem " + tot[i] + " dias");*/
     
     int vet[] = {1,7,31,47,21,12,9,6,7,9};
     Arrays.sort(vet);
     for(int valor:vet){
        System.out.println(valor);
      }
     int p = Arrays.binarySearch(vet, 9);
        System.out.println("Está na pos: " + p);
    }}
    

