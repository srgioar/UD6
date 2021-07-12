import javax.swing.JOptionPane;

public class Ejercicio12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayMain;
		String input = JOptionPane.showInputDialog("Define tamaño array: ");

		int size = Integer.parseInt(input);

		arrayMain = new int[size];
		
		//Llenar array según tamaño
		for (int i = 0; i < size; i++) {
			int num = (int) (1+ (Math.random() * 300));
			arrayMain[i] = num;
		}
		
		JOptionPane.showMessageDialog(null, "arraymain: " + mostrarArray(arrayMain));
		
		JOptionPane.showMessageDialog(null, "Output: \n" + mostrarArray(comprobarArray(arrayMain)));
		
	}
	
	// Escanea el array y detecta las posiciones con valores con ultimo digito igual al introducido
	// Con esas posiciones, definimos y construimos el array final, que retornamos
	
	static int[] comprobarArray(int[] array){
		
		String strDigit = JOptionPane.showInputDialog("Introduce DÍGITO: ");
		int digit = Integer.parseInt(strDigit);
		
		// Usamos un contador para contar cuantos numeros coinciden
		// Con ese numero definimos el tamaño del array final
		int contador = 0;
		
		// Convierto el numero a string, detecto el último caracter
		// Lo convierto a numero de nuevo con la clase Character
		// Comparo con el dígito introducido
		
		// Iteramos para detectar los valores coincidentes:
		for (int i = 0; i < array.length; i++) {
			
			String numStr = Integer.toString(array[i]);
			char last = numStr.charAt(numStr.length() - 1);
			int lastNum = Character.getNumericValue(last);
			
			if (lastNum == digit) {
				contador++;
			}
			
		}
		
		int[] arrayNuevo = new int[contador];
		
		int cont = 0;
		
		// Vuelvo a interar pero esta vez para rellenar
		for (int i = 0; i < array.length; i++) {
			
			// Contador interno para rellenar el array final
			String numStr = Integer.toString(array[i]);
			char last = numStr.charAt(numStr.length() - 1);
			int lastNum = Character.getNumericValue(last);
			
			if (lastNum == digit) {
				System.out.println(array[i]);
				arrayNuevo[cont] = array[i];
				cont++;
			}
			
		}
		
		return arrayNuevo;
		
	}
	
	static String mostrarArray(int[] array) {
		
		String strArray = "";
		
		for (int i = 0; i < array.length; i++) {
			strArray += "[ "+ array[i] + " ]";
		}
		
		return strArray;
		
	}

}
