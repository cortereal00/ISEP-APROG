package xxsd.aprog.pl07;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar5 {

        public static Scanner scanner = new Scanner(System.in);
        public static Formatter formatter = new Formatter(System.out);

        public static void main(String args[]) {
                int[] vetor = lerVetor();
                printResultado(getPontoSeparacao(vetor), vetor);
        }

        public static int[] lerVetor() {
                formatter.format("Introduza o número de elementos do vetor: ");
                int elementos = scanner.nextInt();
                int[] vetor = new int[elementos];
                formatter.format("Preenche o vetor...%n");
                for (int i = 0; i < elementos; i++) {
                        formatter.format("%d: ", i + 1);
                        vetor[i] = scanner.nextInt();
                }
                return vetor;
        }

        public static int getPontoSeparacao(int[] vetor) {
                int diferenca = 0, minDiferenca = Integer.MAX_VALUE, pontoSeparacao = -1;
                for (int i = 1; i < vetor.length - 1; i++) {
                        int somaEsquerda = 0, somaDireita = 0;
                        for (int j = 0; j < vetor.length; j++) {
                                if (j < i) {
                                        somaEsquerda += vetor[j];
                                } else {
                                        somaDireita += vetor[j];
                                }
                        }
                        diferenca = Math.abs(somaEsquerda - somaDireita);
                        if (diferenca < minDiferenca) {
                                minDiferenca = diferenca;
                                pontoSeparacao = i;
                        }
                }
                return pontoSeparacao;
        }

        public static void printResultado(int pontoSeparacao, int[] vetor) {
                String ladoEsquerdo = "", ladoDireito = "";
                int somaEsquerda = 0, somaDireita = 0;
                for (int i = 0; i < vetor.length; i++) {
                        if (i < pontoSeparacao) {
                                ladoEsquerdo += vetor[i] + (i < pontoSeparacao - 1 ? "," : "");
                                somaEsquerda += vetor[i];
                        } else {
                                ladoDireito += vetor[i] + (i < vetor.length - 1 ? "," : "");
                                somaDireita += vetor[i];
                        }
                }
                formatter.format("[%s]: %d%n", ladoEsquerdo, somaEsquerda);
                formatter.format("[%s]: %d%n", ladoDireito, somaDireita);
        }
}
