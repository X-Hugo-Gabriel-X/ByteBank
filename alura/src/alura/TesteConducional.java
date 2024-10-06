package alura;

public class TesteConducional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 20;
		int quantidadePessoas = 2;
		if (idade >= 18) {
			System.out.println("você é maior de idade");
		}else {
			if (quantidadePessoas >= 2){
				System.out.println("você pode entrar pois ta acompanhado");
		}else {
			System.out.println("você é menor de idade");
		}
		}
	}
}


