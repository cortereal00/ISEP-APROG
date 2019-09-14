package xxsd.aprog.pl08;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex2 {

        private static Scanner scanner = new Scanner(System.in);
        private static Formatter formatter = new Formatter(System.out);

        public static void main(String args[]) {
                int[][] matriz = criarMatriz();
                lerElementosMatriz(matriz);
                
                if (quadradoMagico(matriz)) {
                        formatter.format("%nA matriz inserida é um quadrado mágico%n");
                } else {
                        formatter.format("%nA matriz inserida não é um quadrado mágico%n");
                }
        }

        public static int[][] criarMatriz() {
                formatter.format("Introduza a dimensão da matriz: ");
                int dimensao = scanner.nextInt();
                return new int[dimensao][dimensao];
        }

        public static void lerElementosMatriz(int[][] matriz) {
                formatter.format("%nPreencha a matriz...%n");
                for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                                formatter.format("%dº elemento da %d linha: ", j + 1, i + 1);
                                matriz[i][j] = scanner.nextInt();
                        }
                }
        }

        public static boolean quadradoMagico(int[][] matriz) {
                int somaLinhas = 0, somaColunas = 0, numeroMagico = 0;
                for (int i = 0; i < matriz.length; i++) {
                        numeroMagico += matriz[i][i];
                }
                for (int i = 0; i < matriz.length; i++) {
                        somaLinhas = 0;
                        somaColunas = 0;
                        for (int j = 0; j < matriz[i].length; j++) {
                                somaLinhas += matriz[i][j];
                                somaColunas += matriz[j][i];
                        }

                        if (somaLinhas != numeroMagico || somaColunas != numeroMagico) {
                                return false;
                        }
                }
                return true;
        }
}
