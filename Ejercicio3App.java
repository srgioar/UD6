import javax.swing.JOptionPane;

public class Ejercicio3App {
	
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Introduce num: ");
		boolean esPrimo = calcularPrimos(Integer.parseInt(input));
		JOptionPane.showMessageDialog(null, "¿Es " + Integer.parseInt(input) + " numero primo? " + esPrimo);
		calcularPrimos(Integer.parseInt(input));
		
	}
	
	static boolean calcularPrimos(int num) {
		
		// Variable de control inicializada a true
		boolean esPrimo = true;
	
		/* Como los n primos son divisibles entre sí y entre 1, el for
		 * se salta la posición inicial y la final 
		 */
		
		for (int i = num-1; i > 1; i--) {	
			int a = num % i;
			
			if (num % i == 0) {
				// Si es divisible dentro del rango que controlamos, establecemos a false
				esPrimo = false;
			}
	
		} // Fin del for
		
		return esPrimo;
		
	}

}
