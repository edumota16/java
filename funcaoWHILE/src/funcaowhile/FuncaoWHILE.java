/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaowhile;

/**
 *
 * @author Duloko
 */
public class FuncaoWHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int contador = 0;
        String s = "Corinthians";
        while (contador < 5){
            contador++;
            System.out.println(s + contador);
        }*/
       /* int contador = 0;
        while (contador<30){
            if (contador%2 == 1){
                System.out.println(contador);
            }
            contador++;*/
       int contador = 0;
       while (contador < 10){
           contador++;
           if ((contador == 3)||(contador==9)){
               continue;
           }
           System.out.print(contador);
        }
    }
    
}
