/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaojoptionpane;

import javax.swing.JOptionPane;

public class FuncaoJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        float media = 0;
        int par = 0;
        int impar = 0;
        int dez = 0;
        int total = 0;
        float soma =0;
        do {
        n = Integer.parseInt(JOptionPane.showInputDialog
        (null, "<html>Digite um número (0 interrompe)</html>"));
        total++;
        soma+=n;
        if (n%2==0){
            par++;
        } else {
            impar++;
        }
        if (n>10){
            dez++;
        }
        media = Math.round((soma)/total);
    } while (n != 0);  
        JOptionPane.showMessageDialog(null,"<html>Resultado final"+"<br>O total de numeros: "+total+
                "<br>O total de pares é: "+par+"<br>O total de ímpares é: "+impar+"<br>Acima de 10: "+dez+ "<br>A media é: "+media+"</html>");
}
    
}
