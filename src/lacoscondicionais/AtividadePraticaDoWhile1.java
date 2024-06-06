package lacoscondicionais;

import java.util.Scanner;

public class AtividadePraticaDoWhile1 {

	public static void main(String[] args) {

		int numero, soma = 0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número inteiro: ");
			numero = leia.nextInt();
			
			if (numero > 0) {
				soma+=numero;
			}
			
		} while (numero != 0);

		System.out.println("\nA soma dos números positivos é: " + soma);
		
	}

}
