
/**
 * Representa uma conta bancária de um sistema bancário.
 * Existem vários tipos possíveis de conta bancária como, por exemplo,
 * conta corrente e conta investimento.
 * @author Fábio Levy Siqueira
 */
public interface ContaBancaria {
	/**
	 * Obtêm o valor do saldo da conta.
	 */
	public double getSaldo();
	
	/**
	 * Retira o valor da conta corrente, decrementando o seu saldo.
	 * @param valor O valor a ser retirado.
	 * @return true se há saldo para a retirada, ou false caso contrário.
	 * @throw IllegalArgumentException Caso o valor a ser retirado seja menor ou igual a 0.
	 */
	public boolean retirar(double valor);
	
	/**
	 * Deposita um valor na conta corrente.
	 * @param valor O valor a ser depositado
	 * @throw IllegalArgumentException Caso o valor a ser depositado seja menor ou igual a 0.
	 */
	public void depositar(double valor);
	
	/**
	 * Transfere o valor da conta atual para a conta destino.
	 * @param destino A conta destino, a qual terá o seu saldo incrementado com o valor.
	 * @param valor O valor a ser transferido.
	 * @return true caso tenha sido possível transferir, ou false caso contrário.
	 * @throw IllegalArgumentException Caso o valor a ser transferido seja menor ou igual a 0.
	 */
	public boolean transferirPara(ContaBancaria destino, double valor);


}
