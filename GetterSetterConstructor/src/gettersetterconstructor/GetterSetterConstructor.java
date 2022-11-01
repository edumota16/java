/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gettersetterconstructor;

public class GetterSetterConstructor {

    public static void main(String[] args) {
      
        Porta p1 = new Porta("Ferro","Marrom",false); 
        Porta p2 = new Porta("Madeira","Laranja",true);
        p1.status();
        p2.status();
    }
    
}
