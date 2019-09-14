package xxsd.aprog.pl07;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar3 {

        public static Scanner scanner = new Scanner(System.in);
        public static Formatter formatter = new Formatter(System.out);

        public static void main(String args[]) {
                int[] primeiroConjunto, segundoConjunto;

                primeiroConjunto = lerConjunto(1);
                segundoConjunto = lerConjunto(2);

                int[] intercecao = new int[primeiroConjunto.length];
                int[] uniao = new int[primeiroConjunto.length + segundoConjunto.length];

                int nIntercecao = intercecao(primeiroConjunto, segundoConjunto, intercecao);

                int nUniao = uniao(primeiroConjunto, segundoConjunto, uniao);

                formatter.format("Interceção: {%s}%n", printConjunto(intercecao, nIntercecao));
                formatter.format("União: {%s}", printConjunto(uniao, nUniao));
        }

        public static int[] lerConjunto(int nConjunto) {
                formatter.format("Introduza o número de elementos para o %s conjunto: ",
                        nConjunto == 1 ? "primeiro" : "segundo");

                int[] conjunto = new int[scanner.nextInt()];

                formatter.format("%nPreencha o conjunto...%n");

                for (int i = 0; i < conjunto.length; i++) {
                        formatter.format("%d: ", i + 1);
                        int numero = scanner.nextInt();
                        if (!ExComplementar3.possuiElemento(numero, conjunto, i)) {
                                conjunto[i] = numero;
                        } else {
                                formatter.format("Elemento repetido. Introduza um número diferente%n");
                                i--;
                        }
                }
                formatter.format("%n");
                return conjunto;
        }

        public static int intercecao(int[] primeiroConjunto, int[] segundoConjunto, int[] intercecao) {
                int cont = 0;
                for (int i = 0; i < primeiroConjunto.length; i++) {
                        if (possuiElemento(primeiroConjunto[i], segundoConjunto)) {
                                intercecao[cont++] = primeiroConjunto[i];
                        }
                }
                organizarConjunto(intercecao, cont);
                return cont;
        }

        public static int uniao(int[] primeiroConjunto, int[] segundoConjunto, int[] uniao) {
                int cont = 0;
                for (int i = 0; i < (primeiroConjunto.length + segundoConjunto.length); i++) {
                        if (i < primeiroConjunto.length) {
                                uniao[cont++] = primeiroConjunto[i];
                        } else if (!possuiElemento(segundoConjunto[i - primeiroConjunto.length], uniao)) {
                                uniao[cont++] = segundoConjunto[i - primeiroConjunto.length];
                        }
                }
                organizarConjunto(uniao, cont);
                return cont;
        }

        public static boolean possuiElemento(int elemento, int[] conjunto, int nElementos) {
                boolean possuiElemento = false;
                for (int i = 0; i < nElementos; i++) {
                        if (conjunto[i] == elemento) {
                                possuiElemento = true;
                                break;
                        }
                }
                return possuiElemento;
        }

        public static boolean possuiElemento(int elemento, int[] conjunto) {
                boolean possuiElemento = false;
                for (int i = 0; i < conjunto.length; i++) {
                        if (conjunto[i] == elemento) {
                                possuiElemento = true;
                                break;
                        }
                }
                return possuiElemento;
        }

        public static String printConjunto(int[] array, int numberOfElements) {
                String text = "";
                for (int i = 0; i < numberOfElements; i++) {
                        text += array[i] + (i < numberOfElements - 1 ? ", " : "");
                }
                return text;
        }

        public static void organizarConjunto(int[] conjunto, int nElementos) {
                for (int i = 0; i < nElementos - 1; i++) {
                        for (int j = i + 1; j < nElementos; j++) {
                                if (conjunto[i] > conjunto[j]) {
                                        int x = conjunto[i];
                                        conjunto[i] = conjunto[j];
                                        conjunto[j] = x;
                                }
                        }
                }
        }
}
