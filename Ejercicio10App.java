import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio10App {

	static int[] arrayMain;
	static int contador = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rellenarArray();
		mostrarArray();

	}
	
	static void rellenarArray() {
		
		String input = JOptionPane.showInputDialog("Tamaño Array: ");
		int size = Integer.parseInt(input);
		arrayMain = new int[size];
		String inputMin = JOptionPane.showInputDialog("Introduce min: ");
		String inputMax = JOptionPane.showInputDialog("Introduce max: ");
		int min = Integer.parseInt(inputMin);
		int max = Integer.parseInt(inputMax);
		
		for (int i = 0; i < arrayMain.length; i++) {
			
			Random rand = new Random();
			int numeroRandom = rand.nextInt((max-min)+1) + min;
			
			while (!calcularPrimos(numeroRandom)) {
				numeroRandom = rand.nextInt((max-min)+1) + min;
			}
			
			if (calcularPrimos(numeroRandom)) {
				arrayMain[i] = numeroRandom;
				
				if (numeroRandom > contador) {
					contador = numeroRandom;
				}
				
			}
		
		} // FIN DEL FOR
	
	} // FIN DEL MÉTODO
	
	// Copypaste del Ejercicio 3, aquí descubrí q mi ejercicio 3 estaba mal
	// Todo controlado, ahora calcula numeros primos a la perfección :-)
	
	static boolean calcularPrimos(int num) {
		
		// Variable de control inicializada a true
		boolean esPrimo = true;
	
		/* Como los n primos son divisibles entre sí y entre 1, el for
		 * se salta la posición inicial y la final */
		
		for (int i = num-1; i > 1; i--) {
			
			int a = num % i;
			
			if (num % i == 0) {
				// Si es divisible dentro del rango que controlamos, establecemos a false
				esPrimo = false;
			}
	
		} // Fin del for
		
		return esPrimo;
		
	}

	
	static void mostrarArray() {
		
		int suma = 0;
		String strValores = "";
		
		for (int i = 0; i < arrayMain.length; i++) {
			
			strValores += "INDEX: " + i + " VALOR: " + arrayMain[i] + "\n";
			suma += arrayMain[i];
			
		}
		
		JOptionPane.showMessageDialog(null, strValores + "\n MAYOR VALOR: " + contador);
		
	}

}
