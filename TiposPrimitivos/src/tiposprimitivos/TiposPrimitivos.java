
package tiposprimitivos;
import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        String nome = "Eduardo";
        float nota = (float)10.5;
        System.out.println("Minha nota é: " + nota);
        System.out.printf("%s\n", nome);
        System.out.format("A nota de %s é %.2f\n", nome, nota);
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String aluno = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota1 = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f\n", aluno, nota1);
    }
    
}
