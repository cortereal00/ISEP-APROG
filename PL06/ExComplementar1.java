package xxsd.aprog.pl06;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar1 {
        
        public static void main(String args[]) {
		System.out.println(isArmstrongP(407));
	}
	
	public static boolean isArmstrongP(int numero) {
                
		int numeroIntroduzido = numero, checkNumero = 0;
		
		while (numero != 0) {
			checkNumero += (int) Math.pow(numero % 10, 3);
			numero /= 10;
		}
		
		return numeroIntroduzido == checkNumero;
	}
}
