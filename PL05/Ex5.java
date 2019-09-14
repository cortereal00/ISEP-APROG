package xxsd.aprog.pl05;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex5 {
        
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);

		int res = 0, aux = 1;
		int num = scanner.nextInt();

		while (num != 0) {
			int d = num % 10;
			if (d % 2 == 1) {
				res += d * aux;
				aux *= 10;
			}
			num /= 10;
		}

		System.out.println("O resultado é: " + res);
		
		scanner.close();
	}

}
