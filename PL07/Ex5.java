package xxsd.aprog.pl07;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex5 {

        static Scanner scanner = new Scanner(System.in);
        static Formatter formatter = new Formatter(System.out);

        public static void main(String agrs[]) {
                
                String[] nomes = new String[100];

                int num = lerNomes(nomes);

                formatter.format("%nNomes introduzidos:%n");

                Ex5.show(nomes, num);

                int[] listaApelidos = new int[num];

                formatter.format("%nNomes de pessoas com apelidos começados por 'S':%n");

                int nApelidos = getApelidos(nomes, listaApelidos, num);

                showApelidos(nomes, listaApelidos, nApelidos);

                formatter.format("%nPercentagem de apelidos que começam por 'S': %.2f%%%n", (nApelidos * 100F / num));
        }

        public static int lerNomes(String[] nomes) {
                formatter.format("Introduza o nome completo de uma pessoa: ");

                String nome = scanner.nextLine();

                int num = 0;

                while (!nome.equalsIgnoreCase("fim") && num < nomes.length) {
                        nomes[num++] = nome;

                        formatter.format("Introduza o nome completo de uma pessoa: ");

                        nome = scanner.nextLine();
                }

                return num;
        }

        public static String getApelido(String nome) {
                int i = nome.length() - 1;

                while (nome.charAt(i) != ' ' && i > 0) {
                        i--;
                }

                return nome.substring(i + 1);
        }

        public static int getApelidos(String[] nomes, int[] listaApelidos, int num) {
                int n = 0;

                for (int i = 0; i < num; i++) {
                        String surname = getApelido(nomes[i]);
                        if (surname.charAt(0) == 'S') {
                                listaApelidos[n++] = i;
                        }
                }

                return n;
        }

        public static void showApelidos(String[] nomes, int[] listaApelidos, int num) {
                for (int i = 0; i < num; i++) {
                        formatter.format("%s%n", nomes[listaApelidos[i]]);
                }
        }

        public static void show(String[] vec, int n) {
                for (int i = 0; i < n; i++) {
                        formatter.format("%s%n", vec[i]);
                }
        }

        public static void show(int[] vec, int n) {
                for (int i = 0; i < n; i++) {
                        formatter.format("%s%n", vec[i]);
                }
        }
}
