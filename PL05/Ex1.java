package xxsd.aprog.pl05;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1 {

	public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduza quantos números quer escrever: ");

		int numeros = scanner.nextInt();
		int somaPares = 0, contadorPares = 0;

		for (int i = 1; i <= numeros; i++) {
			System.out.println("Número: ");

			int numero = scanner.nextInt();

			if (numero % 2 == 0) {
				somaPares += numero;
				contadorPares++;
			}
		}

		if (contadorPares != 0) {
			float media = (float) somaPares / (float) contadorPares;
			float proporcao = (float) contadorPares / (float) numeros;
			System.out.println("Média dos pares: " + new DecimalFormat("#.##").format(media));
			System.out.println("Proporção de pares para ímpares: " + new DecimalFormat("#.##").format(proporcao));
		} else {
			System.out.println("Não existe...");
		}

		scanner.close();
	}

}

