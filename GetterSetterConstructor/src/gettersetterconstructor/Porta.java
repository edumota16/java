
package gettersetterconstructor;

public class Porta {
    private String tipo;
    private String cor;
    private boolean trancada;

    public Porta(String tipo, String cor, boolean trancada) {
        this.tipo = tipo;
        this.cor = cor;
        this.trancada = trancada;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public boolean isTrancada() {
        return trancada;
    }
    public void setTrancada(boolean trancada) {
        this.trancada = trancada;
    }
    public void status(){
        System.out.println("Sobre a porta: ");
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Cor: "+ this.getCor());
        System.out.println("Trancada? "+ this.isTrancada());
    }
}