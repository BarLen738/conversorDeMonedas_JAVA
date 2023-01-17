package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

//	LÓGICA PARA CONVERTIR PESOS ARGENTINOS A DISTINTAS MONEDAS
	
	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor / 182.18;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, + valor + " pesos argentinos equivalen a  " +monedaDolar+ " Dolares");
	}
	
	public void ConvertirPesosAEuros(double valor) {
		double monedaEuro = valor / 197.02;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, + valor + " pesos argentinos equivalen a  " +monedaEuro+ " Euros");
	}
	
	public void ConvertirPesosALibras(double valor) {
		double monedaLibra = valor / 222.09;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, + valor + " pesos argentinos equivalen a  " +monedaLibra+ " Libras Esterlinas");
	}
	
	public void ConvertirPesosAYen(double valor) {
		double monedaYen = valor / 1.42;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, + valor + " pesos argentinos equivalen a  " +monedaYen+ " Yuanes");
	}
	
	public void ConvertirPesosAWon(double valor) {
		double monedaWon = valor / 0.15;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, + valor + " pesos argentinos equivalen a  " +monedaWon+ " Wons");
	}
}
