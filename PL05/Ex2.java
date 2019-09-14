package xxsd.aprog.pl05;

import javax.swing.JOptionPane;

/**
 * @author Gonçalo Corte Real <1180793@isep.ipp.pt>
 */
public class Ex2 {

	public static void main(String args[]) {
                
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Introduza o número de dias"));

		int temperatura[] = new int[dias];

		StringBuilder mensagem = new StringBuilder();

		for (int i = 0; i < dias; i++) {
			temperatura[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduza a temperatura do dia " + (i + 1)));
			mensagem.append("Dia ").append(i).append(1).append(": ").append(getTemperatureType(temperatura[i])).append(i == dias ? null : "\n");
		}
		
		JOptionPane.showMessageDialog(null, mensagem.toString(), "Temperaturas", 1);

	}

	public static String getTemperatureType(int temperatura) {
                
		String temperatureType;
		
		if (temperatura >= -30 && temperatura < 9) {
			temperatureType = "Muito Frio (" + temperatura + "ºC)";
		} else if (temperatura < 15) {
			temperatureType = "Frio (" + temperatura + "ºC)";
		} else if (temperatura < 20) {
			temperatureType = "Ameno (" + temperatura + "ºC)";
		} else if (temperatura < 30) {
			temperatureType = "Quente (" + temperatura + "ºC)";
		} else if (temperatura < 50) {
			temperatureType = "Muito Quente (" + temperatura + "ºC)";
		} else {
			temperatureType = "Temperatura Extrema (" + temperatura + "ºC)";
		}
		
		return temperatureType;
	}

}