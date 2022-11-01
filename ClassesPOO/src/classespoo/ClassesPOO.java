
package classespoo;

public class ClassesPOO {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.carga = 50;
        c1.cor = "Azul";
        c1.modelo = "Bic";
        c1.ponta = 0.7f;
        c1.tampada = false;
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c1.carga = 50;
        c1.cor = "Vermelho";
        c1.modelo = "Faber";
        c1.ponta = 0.5f;
        c1.tampada = true;
        c1.status();
        c1.rabiscar();
    }
    
}
