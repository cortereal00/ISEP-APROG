package xxsd.aprog.pl05;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar3 {
        
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduza um número: ");
		
		int numero = scanner.nextInt();
		
		System.out.println("A persistência do número " + numero + " é " + calcularPersistencia(numero));
		
		scanner.close();
	}
	
	public static int calcularPersistencia(int numero) {
		
		int persistencia = 0;
		
		while (numero / 10 >= 1) {
			numero = multiplicarDigitos(numero);
			persistencia++;
		}
		
		return persistencia;
	}
	
	public static int multiplicarDigitos(int numero) {
		int produto = 1;
		
		while (numero > 0) {
			int ultimoDigito = numero % 10;
			
			produto *= ultimoDigito;
			
			numero /= 10;
		}
		
		return produto;
	}
}
