package xxsd.aprog.pl05;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar4 {
        
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);

		System.out.print("Quantos elementos da sucessão de Fibonacci pretende visualizar?");

		int numbers = scanner.nextInt();

		showSucessaoFibonacci(numbers);

		scanner.close();
	}

	public static void showSucessaoFibonacci(int termos) {
                
		int sequencia[] = new int[termos];

		sequencia[0] = 1;
		sequencia[1] = 1;

		for (int i = 2; i < termos; i++) {
			sequencia[i] = sequencia[i - 1] + sequencia[i - 2];
		}

		for (int i = 0; i < termos; i++) {
			System.out.println("Termo" + (i + 1) + " : " + sequencia[i]);
		}
	}

}
