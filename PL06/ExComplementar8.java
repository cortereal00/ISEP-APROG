package xxsd.aprog.pl06;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar8 {
        
        public static void main(String args[]) {
                
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Introduza o centro e o raio do circulo...%n");
		System.out.printf("X: ");
		
		double x = scanner.nextDouble();
		
		System.out.printf("Y: ");
		
		double y = scanner.nextDouble();
		
		System.out.printf("Raio: ");
		
		double raio = scanner.nextDouble();
		
		System.out.printf("Introduza o ponto a ser testado...%n");
		System.out.printf("X: ");
		
		double pontoX = scanner.nextDouble();
		
		System.out.printf("Y: ");
		
		double pontoY = scanner.nextDouble();
		
		while (x != pontoX || y != pontoY) {
			if (isInside(x, y, raio, pontoX, pontoY)) {
				System.out.printf("Esse ponto está dentro do circulo.%n");
			} else {
				System.out.printf("Esse ponto não está dentro do circulo.%n");
			}
			
			System.out.printf("Introduza outro ponto a ser testado...%n");
			System.out.printf("X: ");
			
			pontoX = scanner.nextDouble();
			
			System.out.printf("Y: ");
			
			pontoY = scanner.nextDouble();
		}
		
		scanner.close();
	}

	public static boolean isInside(double centroX, double centroY, double raio, double pontoX, double pontoY) {
		return Math.sqrt(Math.pow((centroX - pontoX), 2) + Math.pow((centroY - pontoY), 2)) <= raio;
	}
}
