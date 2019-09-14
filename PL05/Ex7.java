package xxsd.aprog.pl05;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex7 {
        
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if (a > b) {
			int aux = a;
			a = b;
			b = aux;
		}
		
		int e = 0;
		
		int d = scanner.nextInt();
		
		for (int i = 1; i <= d; i++) {
			int num;
			do {
				num = scanner.nextInt();
			} while (num < 0);
			if (num % a == 0 && b % num == 0) {
				e += 1;
			}
		}
		
		System.out.println("... " + e);
		
		scanner.close();
	}
}
