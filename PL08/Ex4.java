package xxsd.aprog.pl08;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex4 {

        private static Scanner scanner = new Scanner(System.in);
        private static Formatter formatter = new Formatter(System.out);

        public static void main(String args[]) {
                int[] sequencia = criarSequencia();
                preencherSequencia(sequencia);
                printMaioresNumeros(sequencia);
        }

        public static int[] criarSequencia() {
                formatter.format("Introduza o número de elementos da sequencia: ");
                int nElementos = scanner.nextInt();
                while (nElementos <= 0) {
                        formatter.format("Valor inválido, introduza outro: ");
                        nElementos = scanner.nextInt();
                }
                return new int[nElementos];
        }

        public static void preencherSequencia(int[] sequencia) {
                formatter.format("%nPreencha a sequencia...%n");
                for (int i = 0; i < sequencia.length; i++) {
                        formatter.format("%d: ", i + 1);
                        int numero = scanner.nextInt();
                        if (possuiElemento(sequencia, numero) == -1) {
                                sequencia[i] = numero;
                        } else {
                                formatter.format("Esse número já existe na sequencia, introduza outro...%n");
                                i--;
                        }
                }
                ordenarSequencia(sequencia);
        }

        public static void ordenarSequencia(int[] array) {
                for (int i = 0; i < array.length - 1; i++) {
                        for (int j = i + 1; j < array.length; j++) {
                                if (array[i] > array[j]) {
                                        int x = array[i];
                                        array[i] = array[j];
                                        array[j] = x;
                                }
                        }
                }
        }

        public static void printMaioresNumeros(int[] sequencia) {
                formatter.format("Quantos números pretende mostrar? ");
                int numero = scanner.nextInt();
                int[] maioresNumeros = getGreatest(sequencia, numero);
                while (maioresNumeros == null) {
                        formatter.format("Número inválido, introduza outro... ");
                        numero = scanner.nextInt();
                }
                formatter.format("%nOs maiores %d números são%n", numero);
                for (int i = 0; i < maioresNumeros.length; i++) {
                        formatter.format("%3s", maioresNumeros[i]);
                }
        }

        public static int[] getGreatest(int[] sequencia, int numMaior) {
                int[] numeros = new int[numMaior];
                if (numMaior <= 0 || numMaior > sequencia.length) {
                        return null;
                } else {
                        for (int i = sequencia.length - 1; i > sequencia.length - numMaior - 1; i--) {
                                numeros[sequencia.length - i - 1] = sequencia[i];
                        }
                        return numeros;
                }
        }

        public static int possuiElemento(int[] sequencia, int elemento) {
                int index = -1;
                for (int i = 0; i < sequencia.length; i++) {
                        if (sequencia[i] == elemento) {
                                index = i;
                                break;
                        }
                }
                return index;
        }
}
