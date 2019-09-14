package xxsd.aprog.pl08;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex5 {

        private static Scanner scanner = new Scanner(System.in);
        private static Formatter formatter = new Formatter(System.out);

        public static void main(String args[]) {
                int[][] matriz = criarMatriz();
                lerMatriz(matriz);
                int[][] indexE = new int[2][matriz.length * matriz[0].length];
                int nElementos = getIndexE(matriz, indexE);
                printIndexE(indexE, nElementos);
        }

        public static int[][] criarMatriz() {
                formatter.format("Introduza as dimensões da matriz...%n");
                int rows = validarNumero("Número de linhas: ", "Número inválido, introduza outro...");
                int columns = validarNumero("Número de colunas: ", "Número inválido, introduza outro...");
                return new int[rows][columns];
        }

        public static void lerMatriz(int[][] array) {
                formatter.format("%nPreencha a matriz...%n");
                for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                                formatter.format("%dº elemento da %dº linha: ", j + 1, i + 1);
                                array[i][j] = scanner.nextInt();
                        }
                }
        }

        public static int getIndexE(int[][] matriz, int[][] indexE) {
                int cont = 0;
                int soma = 0, maxSoma = 0;
                for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                                soma = soma(matriz, i, j);
                                if (soma > maxSoma) {
                                        cont = 0;
                                        maxSoma = soma;
                                        indexE[0][cont] = i;
                                        indexE[1][cont++] = j;
                                } else if (soma == maxSoma) {
                                        indexE[0][cont] = i;
                                        indexE[1][cont++] = j;
                                }
                        }
                }

                return cont;
        }

        public static void printIndexE(int[][] indexE, int nElementos) {
                formatter.format("%nIndex dos elementos 'E'...%n");
                for (int i = 0; i < nElementos; i++) {
                        formatter.format("Index: %d, %d%n", indexE[0][i], indexE[1][i]);
                }
        }

        public static int soma(int[][] matriz, int primeiroIndex, int segundoIndex) {
                int soma = 0;
                for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                                if (primeiroIndex != i && segundoIndex != j) {
                                        soma += matriz[i][j];
                                }
                        }
                }
                return soma;
        }

        public static boolean valido(int numero) {
                return numero > 0;
        }

        public static int validarNumero(String texto, String mensagemErro) {
                formatter.format("%s", texto);
                int numero = scanner.nextInt();
                while (numero <= 0) {
                        formatter.format("%s%n%s", mensagemErro, texto);
                        numero = scanner.nextInt();
                }
                return numero;
        }
}
