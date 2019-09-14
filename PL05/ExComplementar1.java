package xxsd.aprog.pl05;

import javax.swing.JOptionPane;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class ExComplementar1 {
        
        public static void main(String args[]) {
                
		int numero, alg, i = 0, j = 0;
                
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
                
		float perc = (float) i / j + 0.5f;
		JOptionPane.showMessageDialog(null, "Valor = " + (int) perc);
	}
}
