package bytebankComposto;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;

	void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Depósito efetuado com sucesso!!");
		System.out
				.println("Você depositou " + valor + " reais e " + "seu saldo atual é de " + this.saldo + " Reais. \n");
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso!!");
			System.out.println(
					"Você retirou " + valor + " reais da sua conta " + "e restou " + this.saldo + " Reais. \n");
			return true;
		} else {
			System.out.println("Saldo insuficiente pra saque!!\n");
			return false;
		}
	}

	void depositoEmTransferencia(double valor) {
		this.saldo += valor;

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositoEmTransferencia(valor);
			System.out.println("Transderência efetuada com sucesso!!");
			System.out
					.println("você transferiu " + valor + " reais e seu saldo atual é de " + this.saldo + " Reais. \n");
			return true;
		} else
			System.out.println("você não tem o saldo suficiente para essa transação!!");
		return false;

	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular(){
		return titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}