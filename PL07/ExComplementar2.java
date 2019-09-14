package xxsd.aprog.pl07;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar2 {

        public static Scanner scanner = new Scanner(System.in);
        public static Formatter formatter = new Formatter(System.out);

        public static void main(String args[]) {
                int[] sequencia = new int[Integer.MAX_VALUE];
                int nElementos = preencherSequencia(sequencia);
                showResultado(sequencia, nElementos);
        }

        public static int novoNumero(int number) {
                if (number % 2 == 0) {
                        return number / 2;
                } else {
                        return number + 11;
                }
        }

        public static boolean elementoRepetido(int elemento, int[] sequencia, int nElementos) {
                for (int i = 0; i < nElementos; i++) {
                        if (sequencia[i] == elemento) {
                                return true;
                        }
                }
                return false;
        }

        public static int preencherSequencia(int[] sequencia) {
                formatter.format("Introduza um número: ");
                int nElementos = 0;
                int numero = scanner.nextInt();

                while (numero != sequencia[0] && !elementoRepetido(numero, sequencia, nElementos)) {
                        sequencia[nElementos++] = numero;

                        numero = novoNumero(numero);
                }

                sequencia[nElementos++] = numero;

                return nElementos;
        }

        public static void showResultado(int[] sequencia, int nElementos) {
                if (sequencia[0] == sequencia[nElementos - 1]) {
                        formatter.format("A sequencia volta ao inicio ao fim de '%d' elementos.", nElementos);
                } else if (elementoRepetido(sequencia[nElementos - 1], sequencia, nElementos - 1)) {
                        formatter.format("A sequencia repete o número '%d' após '%d' elementos.", sequencia[nElementos - 1],
                                nElementos);
                } else {
                        formatter.format("A sequencia atingiu o limite sem encontrar elementos repetidos.");
                }
        }

}
