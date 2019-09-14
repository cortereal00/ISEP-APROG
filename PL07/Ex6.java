package xxsd.aprog.pl07;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex6 {

        public static Scanner scanner = new Scanner(System.in);
        public static Formatter formatter = new Formatter(System.out);
        public static int numVisitantes = 0;
        public static String[] visitantes = new String[100];

        public static void main(String[] args) {
                menu();
        }

        public static void menu() {
                final String menu = "\nEscolha uma das seguintes opções:\n\n "
                        + "1 - Inserir um visitante.\n "
                        + "2 - Listar todos os visitantes.\n "
                        + "3 - Atualizar um nome dado.\n "
                        + "4 - Eliminar um visitante dado.\n "
                        + "5 - Listar os nomes começados por uma dada letra.\n "
                        + "6 - Listar nomes repetidos.\n "
                        + "7 - Terminar programa.\n\n"
                        + "Opção: ";

                char resposta;
                do {
                        formatter.format("%s", menu);
                        resposta = scanner.nextLine().charAt(0);

                        switch (resposta) {
                                case '1':
                                        inserirVisitante();
                                        break;
                                case '2':
                                        listarVisitantes();
                                        break;
                                case '3':
                                        atualizarVisitante();
                                        break;
                                case '4':
                                        eliminarVisitante(numVisitantes);
                                        break;
                                case '5':
                                        listarVisitantesPor();
                                        break;
                                case '6':
                                        listarNomesRepetidos();
                                        break;
                                case '7':
                                        break;
                                default:
                                        formatter.format("Opção inválida!");
                                        scanner.nextLine();
                        }
                        formatter.format("%n");
                } while (resposta != '7');

        }

        public static void inserirVisitante() {
                if (numVisitantes == visitantes.length) {
                        formatter.format("%nImpossível adicionar visitante. Limite atingido.%n%n");
                } else {
                        formatter.format("%nIntroduza o nome do visitante: ");
                        visitantes[numVisitantes++] = scanner.nextLine();
                        formatter.format("%nVisitante inserido com sucesso.");
                }
                scanner.nextLine();
        }

        public static void listarVisitantes() {
                if (numVisitantes == 0) {
                        formatter.format("%nNão foram inseridos visitantes...%n");
                } else {
                        formatter.format("%nList of visitors:%n");
                        for (int i = 0; i < numVisitantes; i++) {
                                formatter.format("%d - %s%n", i + 1, visitantes[i]);
                        }
                }
                scanner.nextLine();
        }

        public static void atualizarVisitante() {
                formatter.format("%nIntroduza o nome do visitante que pretende atualizar: ");
                String nome = scanner.nextLine();
                int index = getIndexVisitante(nome);

                if (index != -1) {
                        formatter.format("%nEnter the new name: ");

                        String novoNome = scanner.nextLine();

                        visitantes[index] = novoNome;

                        formatter.format("%nO nome do visitante '%s' foi atualizado para '%s'.%n", nome, novoNome);
                } else {
                        formatter.format("%nNão foram encontrados visitantes com esse nome.%n");
                }
                scanner.nextLine();
        }

        public static void eliminarVisitante(int num) {
                formatter.format("%nIntroduza o nome do visitante que pretende remover: ");
                String nome = scanner.nextLine();
                int index = getIndexVisitante(nome);

                if (index != -1) {
                        for (int i = index; i < numVisitantes; i++) {
                                visitantes[i] = visitantes[i + 1];
                        }
                        numVisitantes--;

                        formatter.format("%nO visitante '%s' foi removido.%n", nome);
                } else {
                        formatter.format("%nNão existem visitantes com esse nome.%n");
                }
                scanner.nextLine();
        }

        public static void listarVisitantesPor() {
                formatter.format("%nIntroduza uma letra: ");

                String letra = scanner.nextLine().substring(0, 1);

                String nome = "";

                for (int i = 0; i < numVisitantes; i++) {
                        if (visitantes[i].substring(0, 1).equalsIgnoreCase(letra)) {
                                nome += "- " + visitantes[i] + "\n";
                        }
                }

                formatter.format(!"".equalsIgnoreCase(nome) ? "%nNomes começados pela letra'%s':%n%s" : "%nNão existem visitantes com o nome iniciado pela letra '%s'.%n", letra.toUpperCase(), nome, letra.toUpperCase());
                scanner.nextLine();
        }

        private static void listarNomesRepetidos() {
                formatter.format("%nNomes Repetidos:%n");

                for (int i = 0; i < numVisitantes; i++) {
                        for (int j = i + 1; j < numVisitantes; j++) {
                                if (visitantes[i].equalsIgnoreCase(visitantes[j])) {
                                        formatter.format("- %s%n", visitantes[i]);
                                }
                        }
                }
                scanner.nextLine();
        }

        public static int getIndexVisitante(String nome) {
                int index = -1;
                for (int i = 0; i < numVisitantes; i++) {
                        if (visitantes[i].equalsIgnoreCase(nome)) {
                                index = i;
                                break;
                        }
                }
                return index;
        }
}
