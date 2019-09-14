package xxsd.aprog.pl07;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex4 {
        
        static Scanner scanner = new Scanner(System.in);
	static Formatter formatter = new Formatter(System.out);

	public static void main(String args[]) {
		formatter.format("Introduza a quantidade de números que pretende introduzir ... ");

		int intQuantidade = scanner.nextInt();
		int[] vetor = new int[intQuantidade];

		lerVetor(vetor);
		showVetor(vetor);
		inverterVetor(vetor);
		showVetor(vetor);
		rodarVetor(vetor);
		showVetor(vetor);
	}

	public static void lerVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			formatter.format("Introduza o %dº número... ", i + 1);
			vetor[i] = scanner.nextInt();
		}
	}

	public static void inverterVetor(int[] vetor) {
		for (int i = 0; i < vetor.length / 2; i++) {
			int a = vetor[i];
			int b = vetor[vetor.length - 1 - i];

			vetor[i] = b;
			vetor[vetor.length - 1 - i] = a;
		}
	}

	public static void showVetor(int[] vec) {
		for (int i = 0; i < vec.length; i++) {
			formatter.format(i != vec.length - 1 ? "%d  " : "%d%n", vec[i]);
		}
	}

	public static void rodarVetor(int[] vec) {
		int ultimo = vec[vec.length - 1];

		for (int i = vec.length - 1; i > 0; i--) {
			vec[i] = vec[i - 1];
		}

		vec[0] = ultimo;
	}

}
