package xxsd.aprog.pl07;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
/* Este algoritmo lê 10 números e armazena-os todos num vetor.
 * Posteriormente, o algoritmo vai passar por todos os elementos
 * do vetor e verificar se eles são pares, se forem vai adicionar
 * o número par numa variável s e contar quantos pares são. Por fim,
 * com essa informação o algoritmo calcula a média, se for possível.
 */
public class Ex1 {

	public static void main(String[] args) {
		int i, s = 0, c = 0;
		int[] v = new int[10];
		Scanner ler = new Scanner(System.in);
		for (i = 0; i < v.length; i++) {
			System.out.println("Número?");
			v[i] = ler.nextInt();
		}
		for (i = 0; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				s = s + v[i];
				c++;
			}
		}
		if (c != 0)
			System.out.println(((double) s) / c);
		else
			System.out.println("Operação impossível de realizar");
		int[] vec = new int[10];
		int menorNum = menor(v);
		int n = indexMenor(v, vec, menorNum);
		System.out.println("O menor valor armazenado no vetor é: " + menorNum);
		System.out.print("Os menores indices dos elementos do vector são: ");
		for (i = 0; i < n; i++) {
			System.out.print(vec[i] + " ");
		}
		ler.close();
	}

	public static int menor(int[] array) {
		int lower = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < lower) {
				lower = array[i];
			}
		}
		return lower;
	}

	public static int indexMenor(int[] vec, int[] array, int lower) {
		int n = 0;
		for (int i = 0; i < vec.length; i++) {
			if (vec[i] == lower) {
				array[n] = i;
				n++;
			}
		}
		return n;
	}
}
