package alura;

public class Somatória {

	public static void main(String[] args) {
		
		int contador = 0;
		int total = 0;
		
		while(contador <= 1000) {
			
			total = total + contador;
			
			System.out.println(total);
			
			if (contador == 1000) {
				System.out.println("a soma de todos os numeros de 0 a 100 é " + total);
			}
			contador++;
			
}
}
}
		

