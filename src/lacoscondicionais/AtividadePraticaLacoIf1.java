package lacoscondicionais;

	import java.util.Scanner;

	public class AtividadePraticaLacoIf1 {

		public static void main(String[] args) {
			int numeroA, numeroB, numeroC;
			
			Scanner leia = new Scanner(System.in);

			System.out.println("Digite o número A: ");
			numeroA = leia.nextInt();
		
			System.out.println("Digite o número B: ");
			numeroB = leia.nextInt();
			
			System.out.println("Digite o número C: ");
			numeroC = leia.nextInt();
	
			
			if((numeroA + numeroB) > numeroC) {
				System.out.println("A soma de A + B é maior que C");
			}else if((numeroA + numeroB) == numeroC){
				System.out.println("A soma de A + B é igual a C");
			}else {
				System.out.println("A soma de A + B é menor que C");
			}
		}
	}
