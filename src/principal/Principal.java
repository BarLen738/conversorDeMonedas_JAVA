package principal;

import javax.swing.JOptionPane;

import conversorMonedas.function;
import conversorTemperatura.functionTemperatura;

public class Principal {
	public static void main(String[] args) {

		function monedas = new function();
		functionTemperatura temperatura = new functionTemperatura();

		while (true) {

//			CONSTRUCCIÓN DEL CUADRO DE DIÁLOGO, SELECCIONAR OPCIONES PARA CONVERTIR MONEDAS O TEMPERATURA
			String opciones = (String) (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Conversor de Moneda", "Conversor de Temperatura" }, "Seleccion"));

//			ABRO CAMINOS
			
			switch (opciones) {
			
//			CAMINO UNO, MONEDAS
			case "Conversor de Moneda":
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
//				CORRESPONDE A UN NÚMERO Y YA SE LO TRANSFORMÓ A UN STRING
				if (ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
//					LLAMADA A LA FUNCIÓN QUE DESENCADENA EL PROCESO DE ELEGIR QUÉ TIPO DE CONVERSIÓN QUEREMOS HACER Y, SEGÚN LA OPCIÓN ELEGIDA, REALIZA LA CONVERSIÓN
					monedas.ConvertirMonedas(Minput);

//					PREGUNTA SI DESEA REALIZAR OTRA CONVERSIÓN 
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
//					LÓGICA PARA SÍ
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción Afirmativa");
//						LÓGICA PARA NO
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
//					LÓGICA PARA CANCELAR
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;

//				CAMINO 2: TEMPERATURA
			case "Conversor de Temperatura":
				input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
				if (ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					temperatura.ConvertirTemperatura(Minput);

					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
//					LÓGICA PARA SÍ
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción Afirmativa");
//						LÓGICA PARA NO
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			}
		}

	}
	

//	FUNCIÓN PARA VALIDAR QUE SE INGRESA UN NÚMERO (DOUBLE .) Y TRANSFORMARLO A STRING. PARA AMBOS CAMINOS (MONEDAS Y TEMPERATURA)
//	TRY, SI ES MENOR O MAYOR, VALIDAR
//	CATCH ERROR, ATRAPAR EXCEPCIÓN Y NO VALIDAR 
	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
