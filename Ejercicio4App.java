import javax.swing.JOptionPane;

public class Ejercicio4App {
	
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Introduce num: ");
		JOptionPane.showMessageDialog(null, "El factorial de " + input + " es: " + calcularFactorial(Integer.parseInt(input)));
		
	}
	
	
	static int calcularFactorial(int num) {
		
		// Acumular la multiplicación de un numero por el mismo numero -1:
		
		int factorial = 0;
		
		for (int i = 1; i <= num; i++) {
			factorial += num * num-1;
		}
		
		return factorial;
		
	}

}
