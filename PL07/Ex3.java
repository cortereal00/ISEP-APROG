package xxsd.aprog.pl07;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex3 {
        
        static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = 0;
		String nomes[] = new String[100];
		
		String m = "1-Ler Nomes\n"
                        + "2-Enigma Nome\n"
                        + "3-Terminar\n"
                        + "\nEscolha uma opção:";
		char op;
		do {
			System.out.println(m);
			op = ler.next().charAt(0);
			switch (op) {
			case '1':
				n = lerNomes(nomes);
				break;
			case '2':
				ler.nextLine();
				System.out.println("Nome:");
				String nome = ler.nextLine();
				n = enigma(nomes, nome, n);
				listar(nomes, n);
				break;
			case '3':
				break;
			default:
				System.out.println("Opção inválida!!");
			}
		} while (op != '3');
	}

	private static int lerNomes(String[] vec) { 
		int i = 0;
		
		System.out.println("Introduza um nome: ");
		
		String nome = ler.next();
		
		while (!nome.equalsIgnoreCase("fim") && i < vec.length) {
			vec[i] = nome;
			
			i++;
			
			System.out.println("Introduza um nome: ");
			
			nome = ler.next();
		}
		return i;
	}
	

	private static void listar(String[] vec, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(vec[i]);
		}
	}

	private static int enigma(String[] nomes, String nome, int n) {
		int i = 0;
		while (i < n && !nomes[i].equalsIgnoreCase(nome)) {
			i++;
		}
		if (i == n)
			return n;
		else {
			for (int j = i; j < n - 1; j++)
				nomes[j] = nomes[j + 1];
			return --n;
		}
	}
}
