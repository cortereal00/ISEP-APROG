package xxsd.aprog.pl06;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar5 {
        
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Introduza as dimensões do paralelepípedo...%nComprimento: ");

		double comprimento = scanner.nextDouble();

		System.out.printf("Largura: ");

		double largura = scanner.nextDouble();

		System.out.printf("Altura: ");

		double altura = scanner.nextDouble();

		if (validaDimensoes(largura, comprimento, altura)) {
			showMenu(scanner, largura, comprimento, altura);
		} else {
			System.out.printf("Parametros Inválidos");
		}

		scanner.close();
	}

	public static void showMenu(Scanner scanner, double largura, double comprimento, double altura) {
		System.out.printf("Selecione a operação que pretende realizar:%n");
		System.out.printf("1 - Calcular área da base%n");
		System.out.printf("2 - Calcular área lateral%n");
		System.out.printf("3 - Calcular área total%n");
		System.out.printf("4 - Calcular volume%n");

		int opcao = scanner.nextInt();

		while (!validarOpcaoMenu(opcao)) {
			System.out.printf("Opção Inválida%n");

			opcao = scanner.nextInt();
		}
		
		System.out.printf("o Resultado é: %.2f", calcular(opcao, largura, comprimento, altura));

	}

	public static boolean validaDimensoes(double largura, double comprimento, double altura) {
                return !(largura <= 0 || comprimento <= 0 || altura <= 0);
	}

	public static boolean validarOpcaoMenu(int opcao) {
                return !(opcao < 1 || opcao > 4);
	}

	public static double calcular(int opcao, double largura, double comprimento, double altura) {
		double resultado = 0;
		switch (opcao) {
		case 1:
			resultado = 2 * largura * comprimento;
			break;
		case 2:
			resultado = 2 * largura * altura + 2 * comprimento * altura;
			break;
		case 3:
			resultado = 2 * largura * comprimento + 2 * largura * altura + 2 * comprimento * altura;
			break;
		case 4:
			resultado = largura * comprimento * altura;
			break;
		}
		return resultado;
	}
}
