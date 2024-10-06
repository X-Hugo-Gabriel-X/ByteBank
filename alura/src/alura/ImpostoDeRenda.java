package alura;

public class ImpostoDeRenda {

	public static void main(String[] args) {

		double salario = 3300;

		if (salario >= 1900 && salario <= 2800) {
			System.out.println("seu IR é de 7,5%" + " pode deduzir o valor de 142");
		}
		if (salario >= 2800.1 && salario <= 3751.0) {
			System.out.println("seu IR é de 15%" + " pode deduzir o valor de 350");
		}
		if (salario >= 3751.0 && salario <= 4664.00) {
			System.out.println("seu IR é de 22,5%" + " pode deduzir o valor de 636");
		}

	}

}
