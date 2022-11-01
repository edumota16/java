/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Duloko
 */
public class ComparacaoStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome1 = "Eduardo";
        String nome2 = "Eduardo";
        String nome3 = new String ("Eduardo");
        /*String r = nome1 == nome3?"iguais":"diferentes";*/
        String r = (nome1.equals(nome3))?"iguais":"diferentes";
        System.out.println(r);
        
    }
    
}
