package bytebankComposto;

public class TestaContaSemCliente {

	public static void main(String[] args) {
		
		
		Cliente paulo = new Cliente();
	    Conta conta = new Conta();
	    paulo.setNome("Paulo");
	    
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		
		
		

	}

}
