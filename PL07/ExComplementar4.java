package xxsd.aprog.pl07;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar4 {

        public static Scanner scanner = new Scanner(System.in);
        public static Formatter formatter = new Formatter(System.out);

        public static void main(String args[]) {
                int[] segmento = lerSegmento();
                int[] segmentoSomaMaxima = new int[segmento.length];

                int nSegmentoSomaMaxima = getSegmentoSomaMaxima(segmento, segmentoSomaMaxima);

                printResultado(segmentoSomaMaxima, nSegmentoSomaMaxima);
        }

        public static int[] lerSegmento() {
                formatter.format("Introduza o número de elementos do segmento: ");
                int[] segmento = new int[scanner.nextInt()];

                formatter.format("Preencha o segmento...%n");
                for (int i = 0; i < segmento.length; i++) {
                        formatter.format("%d: ", i + 1);
                        segmento[i] = scanner.nextInt();
                }
                return segmento;
        }

        public static int getSegmentoSomaMaxima(int[] segmento, int[] segmentoSomaMaxima) {
                int cont = 0, somaMax = 0;
                for (int i = 0; i < segmento.length; i++) {
                        int soma = 0;
                        for (int j = i; j < segmento.length; j++) {
                                if (soma > somaMax) {
                                        cont = 0;
                                        somaMax = soma;
                                        for (int a = i; a < j; a++) {
                                                segmentoSomaMaxima[cont++] = segmento[a];
                                        }
                                }
                                soma += segmento[j];
                        }
                }
                return cont;
        }

        public static void printResultado(int[] segmento, int nElementos) {
                String resultado = "";
                for (int i = 0; i < nElementos; i++) {
                        resultado += (i < nElementos - 1) ? segmento[i] + "," : segmento[i];
                }
                formatter.format("Segmento de soma máxima: [%s]", resultado);
        }
}
