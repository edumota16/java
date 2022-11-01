/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaorepita.pkgdo;
import java.util.*;
/**
 *
 * @author Duloko
 */
public class FuncaoRepitaDO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, s=0;
        String r = null;
        do{
            System.out.print("Escreva um nº: ");
            n = teclado.nextInt();
            s = s + n;
            System.out.print("Deseja continuar? [S/N]");
            r = teclado.next();
        } while (r.equals("S"));
        System.out.println("A soma é: "+ s);
    }
    
}
