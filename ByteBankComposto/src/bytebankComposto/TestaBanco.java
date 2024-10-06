package bytebankComposto;

public class TestaBanco {

	public static void main(String[] args) {
		Cliente Hugo = new Cliente();
		
		Hugo.setNome("Hugo Gabriel Da Silva");
		Hugo.setCpf ("195.350.197-40");
		Hugo.setProfissao ("programador");
		
		Conta ContaDoHugo = new Conta();
		
		ContaDoHugo.deposita(100);
		
		ContaDoHugo.setTitular(Hugo);
		
		System.out.println(Hugo.getCpf());
	}

}
