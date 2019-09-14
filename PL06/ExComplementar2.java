package xxsd.aprog.pl06;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar2 {
       
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduza um número: ");
		
		int number = scanner.nextInt(), numberCount = 1;
		
		while (!isCapicua(number) && numberCount < 100) {
			System.out.print("Introduza um número: ");
			
			numberCount++;
			number = scanner.nextInt();
		}

		if (numberCount >= 100) {
			System.out.println("O programa terminou porque foram introduzidos 100 números não correspondentes a uma capicua.");
		} else {
			System.out.println(number + " é uma capicua!");
		}
		
		scanner.close();
	}

	private static boolean isCapicua(int numero) {
		int capicua = numero;
		int numeroInvertido = 0;

		while (capicua != 0) {
			int remainder = capicua % 10;
			numeroInvertido = numeroInvertido * 10 + remainder;
			capicua = capicua / 10;
		}

		return numero == numeroInvertido;
	}
}
