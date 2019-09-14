package xxsd.aprog.pl06;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex4 {
        
        public static void main(String args[]) {
                
		System.out.println("7P3 is: " + permutacao(7, 3));
		System.out.println("7C3 is: " + combinacoes(7, 3));
                
	}
        
        /**
         * Calcular o factorial de um número
         *
         * @param num número inteiro não negativo
         * @return o valor do factorial do num
         */
        private static long factorial(long num) {
                long fact = 1;
                for (long i = num; i > 1; i = i - 1) {
                        fact = fact * i;
                }
                return fact;
        }

        /**
         * Calcula o combinações de n p a p
         *
         * @param n número inteiro não negativo
         * @param p número inteiro não negativo
         * @return o valor combinações de n p a p ou -1 caso n<p
         */
        public static long combinacoes(long n, long p) {
                if (n < p) {
                        return -1;
                }
                return factorial(n)/(factorial(p)*factorial(n-p));
        }
        
        public static long permutacao(int n, int p) {
		if (n < p)
			return -1;
		return factorial(n) / factorial(n - p);
	}
        
}
