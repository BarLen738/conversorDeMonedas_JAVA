package conversorTemperatura;

import javax.swing.JOptionPane;

public class functionTemperatura {
	
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	
	public void ConvertirTemperatura(double Minput) {
		
//		CONSTRUIR CUADRO DE DIÁLOGO
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celsius a Grados Farenheit", "Grados Celsius a Kelvin", "Grados Farenheit a Grados Celsius","Kelvin a Grados Celsius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
    	
//    	ABRO CAMINOS SEGÚN LA OPCIÓN ELEGIDA
        switch(opcion) {
        
        case "Grados Celsius a Grados Farenheit":
        	temperatura.ConvertirCelsiusAFarenheit(Minput);
        	break;
        case "Grados Celsius a Kelvin":
            temperatura.ConvertirCelsiusAKelvin(Minput);
            break;
        case "Grados Farenheit a Grados Celsius":
           temperatura.ConvertirFarenheitACelsius(Minput);
           break;
        case "Kelvin a Grados Celsius ":
           temperatura.ConvertirKelvinACelsius (Minput);
           break;
        case "Kelvin a Grados Farenheit":
        	temperatura.ConvertirKelvinAFarenheit(Minput);
        	break;
        }
	}
}
    	
     


