package lacoscondicionais;

import java.util.Scanner;

public class AtividadePraticaFor1 {

	public static void main(String[] args) {
		
		int contador, numero, par = 0, impar = 0;
		Scanner leia = new Scanner(System.in);
		
		
		for(contador = 1; contador < 11; contador++) {
			System.out.println("\nDigite o " + contador + "º número inteiro: ");
			numero = leia.nextInt();
			
			if (numero%2 == 0) {
				par += 1;
			}
			else {
				impar += 1;
			}
			
		}
		System.out.println("\n Total de números pares: " + par);
		System.out.println("\n Total de números ímpares: " + impar);
	}

}