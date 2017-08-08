package Marjory;

import java.io.IOException;

import javax.swing.JOptionPane;

public class binarioAdecimal {

	public static void main(String arg[]) throws IOException { // tratamento de erro .
		String NumADividir;
		String Resultado = "";
		int bin[] = new int[100];
		int size = 100, sunarm = -1;
		int x = 0, tempo;

		NumADividir = JOptionPane.showInputDialog("Número inteiro a converter ? ");

		if (NumADividir.length() <= 8) {

			for (x = 0; x < size; x++)
				bin[x] = -1;

			tempo = Integer.parseInt(NumADividir);
			bin[0] = tempo % 2;

			for (x = 1; x < size; x++) {
				tempo /= 2;
				bin[x] = tempo % 2;
			}

			for (x = size - 1; x >= 0; x--)
				if (bin[x] == 1) {
					sunarm = x;
					break;
				}

			for (x = sunarm; x >= 0; x--)
				Resultado = Resultado + Integer.toString(bin[x]);

			JOptionPane.showMessageDialog(null, "Binario: " + Resultado, "Resultados", JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "somente aoito digitos porfavor ", "Error", JOptionPane.PLAIN_MESSAGE);
		}

		System.exit(0);

	}

}