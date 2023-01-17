package conversorMonedas;

import javax.swing.JOptionPane;

public class function {

//	EQUIVALENCIA DE DISTINTAS MONEDAS EN PESOS ARGENTINOS
	ConvertirMonedas monedas = new ConvertirMonedas();
//	EQUIVALENCIA DE PESOS ARGENTINOS EN DISTINTAS MONEDAS
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
    public void ConvertirMonedas(double Minput) {
//    	CUADRO DE DIÁLOGO PARA SELECCIONAR LA MONEDA A LA QUE SE QUIERE CONVERTIR EL VALOR INGRESADO COMO DOUBLE Y YA PARSEADO A STRING. PARSEAR A STRING.
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
//    	SEGÚN LA OPCIÓN ELEGIDA, HACER LA CONVERSIÓN
        switch(opcion) {
        case "De Pesos a Dólar":
        	monedas.ConvertirPesosADolares(Minput);
        	break;
        case "De Pesos a Euro":
        	monedas.ConvertirPesosAEuros(Minput);
        	break;
        case "De Pesos a Libras":
        	monedas.ConvertirPesosALibras(Minput);
        	break;
        case "De Pesos a Yen":
        	monedas.ConvertirPesosAYen(Minput);
        	break;
        case "De Pesos a Won Coreano":
        	monedas.ConvertirPesosAWon(Minput);
        	break;    	    	                          
        case "De Dólar a Pesos":
        	pesos.ConvertirDolaresAPesos(Minput);
        	break;
        case "De Euro a Pesos":
        	pesos.ConvertirEurosAPesos(Minput);
        	break;
        case "De Libras a Pesos":
        	pesos.ConvertirLibrasAPesos(Minput);
        	break;
        case "De Yen a Pesos":
        	pesos.ConvertirYenAPesos(Minput);
        	break;
        case "De Won Coreano a Pesos":
            pesos.ConvertirWonAPesos(Minput);
            break;
        }      
    }
        
}
