package xxsd.aprog.pl08;

import java.util.Formatter;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex1 {

        public static Formatter formatter = new Formatter(System.out);

        public static void main(String[] args) {
                int m[][] = {{1, 4, 2, 1}, {9, 7, 2, 2}, {1, 7, 3, 5}, {2, 5, 0, 3}, {4, 7, 2, 5}};
                formatter.format("%n%nMatriz:%n");
                printMatriz(m);
                enigma(m);
                calcularMediaColuna(m);
                int[][] tmatrix = getMatrizTransposta(m);
                formatter.format("%n%nMatriz Transposta:%n");
                printMatriz(tmatrix);
        }

        /*
         * Este método mostra o maior valor de cada linha da matriz.
         */
        public static void enigma(int[][] m) {
                int x;
                for (int i = 0; i < m.length; i++) {
                        x = m[i][0];
                        for (int j = 1; j < m[i].length; j++) {
                                if (m[i][j] > x) {
                                        x = m[i][j];
                                }
                        }
                        formatter.format("%d%n", x);
                }
        }

        public static void printMatriz(int[][] m) {
                for (int i = 0; i < m.length; i++) {
                        String line = "";
                        for (int j = 0; j < m[i].length; j++) {
                                line += m[i][j] + ((j < m[i].length - 1) ? " " : "");
                        }
                        formatter.format("%s%n", line);
                }
        }

        public static void calcularMediaColuna(int[][] m) {
                for (int i = 0; i < m.length; i++) {
                        int soma = 0;
                        for (int j = 0; j < m[i].length; j++) {
                                soma += m[i][j];
                        }
                        double media = (double) soma / m[i].length;
                        formatter.format("%nMédia da %dª coluna: %.2f", i + 1, media);
                }
        }

        public static int[][] getMatrizTransposta(int[][] m) {
                int[][] matrizTransposta = new int[m[0].length][m.length];
                for (int i = 0; i < m[i].length; i++) {
                        for (int j = 0; j < m.length; j++) {
                                matrizTransposta[i][j] = m[j][i];
                        }
                }
                return matrizTransposta;
        }
}
