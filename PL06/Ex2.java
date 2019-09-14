package xxsd.aprog.pl06;

import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex2 {

        public static void main(String args[]) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Introduza o número de alunos na turma: ");

                int alunos = scanner.nextInt();

                System.out.println("Introduza quantas disciplinas pretende registar: ");

                int disciplinas = scanner.nextInt();

                String nomeDisciplinas[] = new String[disciplinas];

                int alunosAprovados[] = new int[disciplinas];

                for (int i = 0; i < disciplinas; i++) {
                        System.out.println("Introduza o nome para a " + (i + 1) + "ª disciplina: ");

                        scanner.nextLine();

                        nomeDisciplinas[i] = scanner.nextLine();

                        System.out.println("Introduza o número de alunos aprovados a " + nomeDisciplinas[i] + ": ");

                        alunosAprovados[i] = scanner.nextInt();
                }

                for (int i = 0; i < disciplinas; i++) {
                        System.out.println(outputDisciplina(nomeDisciplinas[i], alunos, alunosAprovados[i]));
                }

                scanner.close();
        }

        public static String outputDisciplina(String disciplina, int nAlunos, int alunosAprovados) {

                String positivas = "";
                String negativas = "";
                String output;

                for (int i = 1; i <= alunosAprovados; i++) {
                        positivas = positivas + "*";
                }
                int alunosReprovados = nAlunos - alunosAprovados;
                for (int i = 1; i <= alunosReprovados; i++) {
                        negativas = negativas + "*";
                }
                output = "Disciplina: " + disciplina + "\n- Positivas: " + positivas + "\n- Negativas: " + negativas;
                return output;
        }
}
