package lacoscondicionais;

import java.util.Scanner;

public class AtividadePraticaLacoSwitch1 {
	public static void main(String[] args) {

		int produto, quantidade;
		Scanner leia = new Scanner(System.in);

		System.out.println(
			    "Escolha uma opção do menu:\n" +
			    "Código - Produto - Preço\n" +
			    "1 - Cachorro Quente - R$ 10.00\n" +
			    "2 - X-Salada - R$ 15.00\n" +
			    "3 - X-Bacon - R$ 18.00\n" +
			    "4 - Bauru - R$ 12.00\n" +
			    "5 - Refrigerante - R$ 8.00\n" +
			    "6 - Suco de laranja - R$ 13.00");
		System.out.println("\nDigite o código do produto escolhido: ");
		produto = leia.nextInt();
		System.out.println("\nDigite a quantidade desejada: ");
		quantidade = leia.nextInt();

		switch (produto) {
		case 1:
			System.out.printf("\nProduto: cachorro quente\n\nValor total: R$ %.2f", 10 * quantidade / 1.0);
			break;
		case 2:
			System.out.printf("\nProduto: X-salada\n\nValor total: R$ %.2f", 15 * quantidade / 1.0);
			break;
		case 3:
			System.out.printf("Produto: X-Bacon\n\nValor total: R$ %.2f", 18 * quantidade / 1.0);
			break;
		case 4:
			System.out.printf("Produto: Bauru\n\nValor total: R$ %.2f", 12 * quantidade / 1.0);
			break;
		case 5:
			System.out.printf("Produto: Refrigerante\n\nValor total: R$ %.2f", 8 * quantidade / 1.0);
			break;
		case 6:
			System.out.printf("Produto: Suco de laranja\n\nValor total: R$ %.2f", 13 * quantidade / 1.0);
			break;
		default:
			System.out.println("Opção inválida!");
		}
	}
}