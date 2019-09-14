package xxsd.aprog.pl06;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex1 {
        
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduza uma palavra: ");
		
		String palavra = scanner.nextLine();
		
		int contPalavras = 1;

		while (!isPalindromo(palavra)) {
			contPalavras++;

			System.out.print("Introduza uma palavra: ");
			
			palavra = scanner.nextLine();
		}
		
		System.out.println(palavra + " is a palindrome and it took you " + contPalavras + " words to find a palindrome.");

		scanner.close();
	}

	public static boolean isPalindromo(String palavra) {
                
		palavra = palavra.toLowerCase();

		boolean isPalindromo = true;

		for (int i = 0; i < palavra.length() / 2; i++) {
                        
			if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
				isPalindromo = false;
				break;
			}
		}

		return isPalindromo;
	}
        
}
