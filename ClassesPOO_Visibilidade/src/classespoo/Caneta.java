
package classespoo;

public class Caneta {
    public String cor;
    public String modelo;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    public void status(){
        System.out.println("Cor: "+this.cor);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga(%): "+this.carga);
        System.out.println("Tampada?: "+this.tampada);
    }
    public void rabiscar(){
        if (this.tampada==false) System.out.println("Desenhei");
        else System.out.println("Ela está tampada");
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
}
