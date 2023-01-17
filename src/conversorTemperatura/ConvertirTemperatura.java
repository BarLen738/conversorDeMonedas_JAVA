package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
//	LÓGICA PARA CONVERTIR CADA CASO
	
	public void ConvertirCelsiusAFarenheit(double valor) {
		double farenheit = valor * (9/5) + 32;
    	farenheit = (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celsius son " +farenheit+ " Grados Farenheit ");
	}
	
	public void ConvertirCelsiusAKelvin(double valor){
		double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celsius son " +kelvin+ " Kelvin");
	}
	
	public void ConvertirFarenheitACelsius(double valor) {
		double Celsius  = (valor - 32) * 5/9;
        Celsius  = (double) Math.round(Celsius  *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +Celsius + " Celsius");
	}
	
	public void ConvertirKelvinACelsius(double valor) {
		 double kelvinCelsius  = valor - 273.15;
         kelvinCelsius  = (double) Math.round(kelvinCelsius *100d)/100;
         JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinCelsius + " Celsius");
	}
	
	public void ConvertirKelvinAFarenheit(double valor) {
		double kelvinFarenheit = (valor - 273.15)*9/5 + 32;
		kelvinFarenheit	= (double) Math.round(kelvinFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinFarenheit+ " Grados Fahrenheit");
	}

}
