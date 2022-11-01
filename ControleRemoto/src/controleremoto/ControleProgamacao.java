
package controleremoto;

public class ControleProgamacao implements Controlador {
  //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
  //Métodos de inicialização
    public ControleProgamacao(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    private int getVolume(){
        return volume;
    }
    private void setVolume(int volume){
        this.volume = volume;
    }
    private boolean getLigado(){
        return ligado;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    private boolean getTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
  //Métodos da implementação
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        if(this.getLigado()){
            System.out.println("------MENU------");
            System.out.println("Está ligado? "+this.getLigado());
            System.out.println("Está tocando? "+this.getTocando());
            System.out.println("Volume: "+this.getVolume());
            for(int i=1;i<=this.getVolume();i+=10){
                System.out.print("|");
            }
            System.out.println("");
        }
    }    
    @Override
    public void fecharMenu() {
        if(this.getLigado())
            System.out.println("Fechando Menu...");
    }
    @Override
    public void aumentaVolume() {
        if(this.getLigado()&& this.getVolume()<100)
            this.setVolume(this.getVolume()+5);    
    }
    @Override
    public void diminuiVolume() {
        if(this.getLigado()&& this.getVolume()>0)
            this.setVolume(this.getVolume()-5);
    }
    @Override
    public void ligarMudo() {
        if(this.getLigado()&& this.getVolume()>0)
            this.setVolume(0);
    }
    @Override
    public void desligarMudo() {
        if(this.getLigado()&& this.getVolume()==0){
            this.setVolume(50);
        }
    }
    @Override
    public void play() {
        if(this.getLigado()&& !(this.getTocando()))
            this.setTocando(true);
    }
    @Override
    public void pause() {
        if(this.getLigado()&& this.getTocando())
            this.setTocando(false);
    }
    
}
