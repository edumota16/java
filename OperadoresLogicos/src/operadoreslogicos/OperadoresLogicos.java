/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoreslogicos;

/**
 *
 * @author Duloko
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, y, z;
        x = 7;
        y = 7;
        z = 7 ;
        boolean r;
        boolean s;
        boolean w;
        r = x<y && y<z ? true:false;
        s = x==y || y==z ? true:false;
        w = x!=y ^ y!=z ? true:false;
        System.out.println(r);
        System.out.println(s);
        System.out.println(w);
    }
    
}
