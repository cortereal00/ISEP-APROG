package xxsd.aprog.pl05;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex8 {
        
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		boolean isBinario = true;
		
		while (num > 0) {
			int ultimoDigito = num % 10;
			
			if (ultimoDigito == 1 || ultimoDigito == 0) {
				num /= 10;	
			} else {
				isBinario = false;
				break;
			}
		}
		
		System.out.println(isBinario == true ? "O número introduzido é binário" : "O número introduzido não é binário");
		
		scanner.close();
	}
}
