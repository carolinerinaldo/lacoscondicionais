package lacoscondicionais;

import java.util.Scanner;

public class AtividadePraticaLacoSwitch2 {
	public static void main(String[] args) {

		String nome;
		int codigo;
		float salario;

		Scanner leia = new Scanner(System.in);

		System.out.println(
			    "Confira seu novo salário\n\n" +
			    "Código - Cargo - Reajuste\n" +
			    "1 - Gerente - 10%\n" +
			    "2 - Vendedor - 7%\n" +
			    "3 - Supervisor - 9%\n" +
			    "4 - Motorista - 6%\n" +
			    "5 - Estoquista - 5%\n" +
			    "6 - Técnico de TI - 8%");
		
		System.out.println("\nPara iniciar, digite seu nome completo: ");
		nome = leia.nextLine();
		System.out.println("\nDigite o código do seu cargo: ");
		codigo = leia.nextInt();
		System.out.println("\nDigite seu salário atual: ");
		salario = leia.nextFloat();

		switch (codigo) {
		case 1:
			System.out.printf("\nNome do colaborador: %s\n\nCargo: Gerente\n\nSalário: R$ %.2f\n", nome, salario*1.1);
			break;
		case 2:
			System.out.printf("\nNome do colaborador: %s\n\nCargo: Vendedor\n\nSalário: R$ %.2f\n", nome, salario*1.07);
			break;
		case 3:
			System.out.printf("\nNome do colaborador: %s\n\nCargo: Supervisor\n\nSalário: R$ %.2f\n", nome, salario*1.09);
			break;
		case 4:
			System.out.printf("\nNome do colaborador: %s\n\nCargo: Motorista\n\nSalário: R$ %.2f\n", nome, salario*1.06);
			break;
		case 5:
			System.out.printf("\nNome do colaborador: %s\n\nCargo: Estoquista\n\nSalário: R$ %.2f\n", nome, salario*1.05);
			break;
		case 6:
			System.out.printf("\nNome do colaborador: %s\n\nCargo: Técnico de TI\n\nSalário: R$ %.2f\n", nome, salario*1.08);
			break;
			
		default:
			System.out.println("Opção inválida!");
		}
	}
}