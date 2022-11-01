
package contabancaria;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
   public ContaBanco(int numConta, String dono) {
        this.numConta = numConta;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }
    public int getNumConta(){
        return numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        if(tipo == "CC")this.tipo = tipo;
        else if(tipo == "CP")this.tipo = tipo;
             else System.out.println("ERRO!TIPO!");
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo.equals("CC"))this.setSaldo(50);
        else if(tipo.equals("CP"))this.setSaldo(150);
        System.out.println("Conta do "+this.getDono()+" aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.saldo > 0) 
            System.out.println("ERRO!Conta com saldo!");  
        else if (this.saldo < 0)
            System.out.println("ERRO!Conta em débito!");
        else 
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
    }
    public void depositar(double valor){
        if(this.status == true){
            this.setSaldo(this.getSaldo()+valor);
            System.out.println("Depósito de "+valor+" feito com sucesso!");
        }else{
            System.out.println("IMPOSSÍVEL DEPOSITAR!");
        }
    }
    public void sacar(double valor){
        if(this.status == true) 
            if(valor <= this.getSaldo()){
                this.setSaldo(this.getSaldo()- valor);
                System.out.println("Saque de "+valor+" feito com sucesso!");
            } else { 
                System.out.println("SALDO INSUFICIENTE PARA SAQUE!");
            }    
        else 
            System.out.println("CONTA FECHADA");
    }
    public void pagarMensal(){
        double v = 0;
        if(this.getTipo()== "CC")v = 12;
        else if(this.getTipo()== "CP")v = 20; 
        if(isStatus()){
            if(this.getSaldo() > v)this.setSaldo(this.getSaldo()-v);
            else System.out.println("Saldo Insuficiente para a mensalidade!");
        } else System.out.println("Conta fechada!");
    }
    public void estado(){
        System.out.println("------------------------");
        System.out.println("SOBRE A CONTA: ");
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Número: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Aberta? "+ this.isStatus());
    }
}
