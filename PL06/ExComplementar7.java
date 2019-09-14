package xxsd.aprog.pl06;

import java.util.Formatter;
import java.util.Scanner;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar7 {

        public static void main(String args[]) {

                Scanner scanner = new Scanner(System.in);
                Formatter formatter = new Formatter(System.out);

                System.out.printf("Introduza o número...%n");

                int num = scanner.nextInt();
                int persistencia = 0;
                int numInicial = num;
                
                while (num > 9) {
                        int produto = 1;
                        while (num != 0) {
                                int unidades = num % 10;
                                produto *= unidades;
                                num = (num - unidades) / 10;
                        }
                        num = produto;
                        persistencia++;
                }
                formatter.format("A persistencia do número %d é: %d%n", numInicial, persistencia);
		
		formatter.close();
                scanner.close();
        }
}
