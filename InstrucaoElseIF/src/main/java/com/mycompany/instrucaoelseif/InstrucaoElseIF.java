

package com.mycompany.instrucaoelseif;

import java.util.*;
import java.math.*;

public class InstrucaoElseIF {

    public static void main(String[] args) {
        double peso, altura, IMC;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o seu peso: ");
        peso = entrada.nextDouble();
        System.out.print("Digite a sua altura: ");
        altura = entrada.nextDouble();
        
        IMC = peso / (altura*altura);
        
        System.out.printf("Seu IMC é %.2f.", IMC);
      
    }
}
