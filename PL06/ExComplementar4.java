package xxsd.aprog.pl06;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar4 {
        
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Introduza o número que pretende converter: ");

		String number = scanner.nextLine();

		System.out.printf("Introduza a base do número introduzido: ");

		String baseFrom = scanner.nextLine();

		System.out.printf("Introduza a base para a qual pretende converter o número: ");

		String baseTo = scanner.nextLine();

		System.out.printf("O número convertido de base %s para base %s é: %s", baseFrom, baseTo,
				converterBase(number, baseFrom, baseTo));

		scanner.close();
	}

	public static String converterBase(String numero, String baseInicial, String baseFinal) {
		try {
			return Integer.toString(Integer.parseInt(numero, Integer.parseInt(baseInicial)), Integer.parseInt(baseFinal));
		} catch (NumberFormatException e) {
			return "";
		}

	}
}
