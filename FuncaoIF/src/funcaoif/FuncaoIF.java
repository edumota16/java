/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaoif;

import java.util.*;


public class FuncaoIF {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a 1ª nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a 2ª nota: ");
        float n2 = teclado.nextFloat();
        System.out.print("Digite a 3ª nota: ");
        float n3 = teclado.nextFloat();
        float m = (n1+n2+n3)/3;
        System.out.println("Sua média é:"+ m);
            if (m>7){
                System.out.println("PARABÉNS");
            } else {
                System.out.println("ESTUDE MAIS");
            }
        
    }
    
}
