
package classespoo;

public class Caneta {
    String cor;
    String modelo;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Cor: "+this.cor);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga(%): "+this.carga);
        System.out.println("Tampada?: "+this.tampada); 
    }
    void rabiscar(){
        if (this.tampada==false) System.out.println("Desenhei");
        else System.out.println("Ela está tampada");
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
