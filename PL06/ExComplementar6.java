package xxsd.aprog.pl06;

import javax.swing.JOptionPane;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar6 {

        public static void main(String[] args) {

                int numero, alg;
                int j = 0, i = 0;
                String resp = JOptionPane.showInputDialog("Qual o número?");
                numero = Integer.parseInt(resp);

                do {
                        j = j + 1;
                        alg = numero % 10;
                        if (alg % 2 == 0) {
                                i = i + 1;
                        }
                        numero = numero / 10;
                } while (numero > 0);

                float perc = (float) i / j;
                JOptionPane.showMessageDialog(null, "Valor = " + ((float) perc * 100) + "%");
        }
}
