package xxsd.aprog.pl07;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar1 {

        public static Scanner scanner = new Scanner(System.in);
        public static Formatter formatter = new Formatter(System.out);
        public static int[] sequencia;
        public static int total = 0, media;

        public static void main(String args[]) {
                lerTamanhoSequencia();
                lerElementos();
                showElementosSuperiorMedia();
        }

        public static void lerTamanhoSequencia() {
                formatter.format("Introduza o número de elementos da sequencia: ");
                sequencia = new int[scanner.nextInt()];
        }

        public static void lerElementos() {
                formatter.format("%n");
                for (int i = 0; i < sequencia.length; i++) {
                        formatter.format("%d: ", i + 1);
                        int numero = scanner.nextInt();
                        sequencia[i] = numero;
                        total += numero;
                }
                media = total / sequencia.length;
        }

        public static void showElementosSuperiorMedia() {
                boolean check = false;
                formatter.format("%nNúmeros superiores à média e a sua ordem de leitura%n%n");
                for (int i = 0; i < sequencia.length; i++) {
                        if (sequencia[i] > media) {
                                formatter.format("%dº:  %d%n", i + 1, sequencia[i]);
                                check = true;
                        }
                }
                if (!check) {
                        formatter.format("Os números inseridos são todos iguais.");
                }
        }

}
