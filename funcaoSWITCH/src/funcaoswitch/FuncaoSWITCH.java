/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaoswitch;
import java.util.Scanner;

public class FuncaoSWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Diga o número de patas: ");
        int perna = teclado.nextInt();
        String tipo;
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println("Isso é um: " + tipo);
    }
    
}
