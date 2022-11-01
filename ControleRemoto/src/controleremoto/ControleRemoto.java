
package controleremoto;

public class ControleRemoto {

    public static void main(String[] args) {
        ControleProgamacao c1 = new ControleProgamacao();
        ControleProgamacao c2 = new ControleProgamacao();
        c1.ligar();
        c1.play();
        c1.abrirMenu();
        c2.ligar();
        c2.abrirMenu();
    }
    
}
