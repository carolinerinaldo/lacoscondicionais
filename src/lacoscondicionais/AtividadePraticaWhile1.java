package lacoscondicionais;

import java.util.Scanner;

public class AtividadePraticaWhile1 {

	public static void main(String[] args) {
		
		int idade, menor = 0, maior = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while (idade >= 0) {

			if (idade < 21) {
				menor += 1;
			}
				
			if (idade > 50) {
					maior += 1;
			}
	         	System.out.println("Digite uma idade ou um número negativo para sair: ");
	            idade = leia.nextInt();
		}
			System.out.println("Total de pessoas menores de 21 anos: " + menor);
			System.out.println("Total de pessoas maiores de 50 anos: " + maior);

		}	
	}


