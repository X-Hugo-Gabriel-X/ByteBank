package alura;

public class Fatorial {

	public static void main(String[] args) {
		int fatorial = 1;
		for (int n = 1; n < 11; n++) {
			fatorial = fatorial * n;
			
			System.out.println("o fatorial de "+ n + " é " + fatorial);

		}
	}
}
