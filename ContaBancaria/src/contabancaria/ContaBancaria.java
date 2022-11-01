
package contabancaria;

public class ContaBancaria {

    public static void main(String[] args) {
       ContaBanco joao = new ContaBanco(01, "Joao");
       ContaBanco cleusa = new ContaBanco(02,"Cleusa");
       joao.estado();
       joao.abrirConta("CC");
       joao.sacar(5000);
       joao.pagarMensal();
       joao.estado();
       cleusa.abrirConta("CC");
       cleusa.depositar(10000);
       cleusa.estado();
        
    }
    
}
