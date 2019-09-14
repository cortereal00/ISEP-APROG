package xxsd.aprog.pl05;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex3 {
        
        public static void main(String args[]) {
                
		StringBuilder mensagem = new StringBuilder().append("Nomes:\n");

		int contPessoas = 0, contMaiorIdade = 0;

		boolean end = false;

		while (!end) {
			String name = JOptionPane.showInputDialog("Introduza um nome");

			if (name.equalsIgnoreCase("zzz")) {
				end = true;
				break;
			} else {
				contPessoas++;

				mensagem.append("\n").append(name);

				int idade = Integer.parseInt(JOptionPane.showInputDialog("Introduza a idade dessa pessoa"));
				if (idade >= 18)
					contMaiorIdade++;
			}
		}

		float percentagem = contMaiorIdade * 100F / contPessoas;
		mensagem.append("\nPercentagem de pessoas com idade maior ou igual a 18 anos: ").append(new DecimalFormat("#.##").
                        format(percentagem)).append("%");

		JOptionPane.showMessageDialog(null, mensagem);

	}

}
