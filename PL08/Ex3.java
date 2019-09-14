package xxsd.aprog.pl08;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex3 {

        private static Scanner scanner = new Scanner(System.in);
        private static Formatter formatter = new Formatter(System.out);

        public static void main(String args[]) {
                int[][] matriz = criarMatriz();
                lerElementosMatriz(matriz);

                int[][] matrizFrequencias = new int[2][100];

                int numColunas = preencherMatrizFrequencia(matriz, matrizFrequencias);

                ordenarMatrizFrequencias(matrizFrequencias, numColunas);
                formatter.format("%nMatriz:%n");
                printResultado(matriz, 0);
                formatter.format("%nMatriz de Frequencias:%n");
                printResultado(matrizFrequencias, numColunas);

        }

        public static int[][] criarMatriz() {
                formatter.format("Introduza as dimensões da matriz...%nNumero de linhas: ");
                int linhas = scanner.nextInt();
                formatter.format("Numero de colunas: ");
                int colunas = scanner.nextInt();
                return new int[linhas][colunas];
        }

        public static void lerElementosMatriz(int[][] matriz) {
                formatter.format("%nPreencha a matriz...%n");
                for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                                formatter.format("%dº elemento da %dº linha: ", j + 1, i + 1);
                                matriz[i][j] = scanner.nextInt();
                        }
                }
        }

        public static int preencherMatrizFrequencia(int[][] matriz, int[][] matrizFrequencias) {
                int cont = 0;
                for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                                if (possuiElemento(matrizFrequencias[0], matriz[i][j]) != -1) {
                                        matrizFrequencias[1][possuiElemento(matrizFrequencias[0], matriz[i][j])]++;
                                } else {
                                        matrizFrequencias[0][cont] = matriz[i][j];
                                        matrizFrequencias[1][cont++] = 1;
                                }
                        }
                }
                return cont;
        }

        /**
         * This method sorts the frequency array.
         *
         * @param matriz - any bi-dimensional integer array.
         * @param nColunas - the number of columns of frequency array.
         */
        public static void ordenarMatrizFrequencias(int[][] matriz, int nColunas) {
                for (int i = 0; i < nColunas; i++) {
                        for (int j = i; j < nColunas; j++) {
                                if (matriz[1][i] < matriz[1][j]) {
                                        int valorTemp = matriz[0][i];
                                        int freqTemp = matriz[1][i];
                                        matriz[0][i] = matriz[0][j];
                                        matriz[1][i] = matriz[1][j];
                                        matriz[0][j] = valorTemp;
                                        matriz[1][j] = freqTemp;
                                }
                        }
                }
        }

        public static int possuiElemento(int[] vetor, int elemento) {
                int index = -1;
                for (int i = 0; i < vetor.length; i++) {
                        if (vetor[i] == elemento) {
                                index = i;
                                break;
                        }
                }
                return index;
        }

        public static void printResultado(int[][] matriz, int nColunas) {
                if (nColunas == 0) {
                        nColunas = matriz[0].length;
                }
                for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < nColunas; j++) {
                                formatter.format("%4s", matriz[i][j]);
                        }
                        formatter.format("%n");
                }
        }
}
