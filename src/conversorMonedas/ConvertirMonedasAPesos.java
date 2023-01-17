package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	
//	LÓGICA PARA CONVERTIR DISTINTAS MONEDAS A PESOS ARGENTINOS
	
	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 182.15;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, + valor + " dólares equivalen a  " +monedaDolar+ " pesos argentinos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 197.13;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, + valor + " euros equivalen a  " +monedaEuro+ " pesos argentinos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 222.19;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, + valor + " libras equivalen a  " +monedaLibra+ " pesos argentinos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 1.42;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, + valor + " yen equivalen a  " +monedaYen+ " pesos argentinos");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 0.15;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, + valor + " won equivalen a  " +monedaWon+ " pesos argentinos");
	}
}
