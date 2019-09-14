package xxsd.aprog.pl07;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex2 {

        static Scanner scannerInteiros = new Scanner(System.in);
        static Scanner scannerStrings = new Scanner(System.in);
        static Formatter formatter = new Formatter(System.out);

        public static void main(String args[]) {
                int numFuncionarios = 0;

                int[] salarioFuncionarios = new int[20];
                String[] nomeFuncionarios = new String[20];

                numFuncionarios = registarEmpregado(nomeFuncionarios, salarioFuncionarios, numFuncionarios);
                Ex2.showFuncionariosAbaixoDaMedia(nomeFuncionarios, salarioFuncionarios, numFuncionarios);
                showFuncionariosSalarioMenorQue(salarioFuncionarios, numFuncionarios);
        }

        public static int registarEmpregado(String[] nomeFuncionarios, int[] salarioFuncionarios, int numFuncionarios) {
                formatter.format("Introduza o nome de um funcionário: ");

                String nome = scannerStrings.nextLine();

                while (!nome.equalsIgnoreCase("tt") && numFuncionarios < 20) {
                        nomeFuncionarios[numFuncionarios] = nome;

                        formatter.format("Introduza o vencimento de %s: ", nome);
                        salarioFuncionarios[numFuncionarios] = scannerInteiros.nextInt();

                        numFuncionarios++;

                        formatter.format("Introduza o nome de outro funcionário: ");
                        nome = scannerStrings.nextLine();
                }

                return numFuncionarios;
        }

        public static void showFuncionariosAbaixoDaMedia(String[] nomeFuncionarios, int[] salarioFuncionarios,
                int numFuncionarios) {

                boolean check = true;

                int media = calcularSalarioMedio(salarioFuncionarios, numFuncionarios);

                formatter.format("%nFuncionários com vencimentos inferiores à média: ");

                for (int i = 0; i < numFuncionarios; i++) {
                        if (salarioFuncionarios[i] < media) {
                                check = false;
                                formatter.format("%n%s", nomeFuncionarios[i]);
                        }
                }

                if (check) {
                        formatter.format("%nNenhum funcionário com vencimento inferior à média");
                }
        }

        public static void showFuncionariosSalarioMenorQue(int[] salarioFuncionarios, int numFuncionarios) {
                formatter.format("%n%nIntroduza um salário base para apresentar a percentagem de funcionários com um salário inferior: ");

                int valor = scannerInteiros.nextInt();

                int cont = 0;

                for (int i = 0; numFuncionarios < numFuncionarios; i++) {
                        if (salarioFuncionarios[i] < valor) {
                                cont++;
                        }
                }

                float perc = cont * 100 / numFuncionarios;

                if (perc == 0) {
                        formatter.format("Sem dados.");
                } else {
                        formatter.format("%.2f", perc);
                }
        }

        public static int calcularSalarioMedio(int[] salarioFuncionarios, int numFuncionarios) {
                int total = 0;

                for (int i = 0; i < numFuncionarios; i++) {
                        total += salarioFuncionarios[i];
                }

                return total / numFuncionarios;
        }

}
