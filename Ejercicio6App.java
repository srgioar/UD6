import javax.swing.JOptionPane;

public class Ejercicio6App {
	
	// n entero positivo entrado por teclado
	// crear método q devuelve numero de cifras...

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("Introduce numero: ");
		
		// Controlar que sea positivo (mayor a 1)
		// Si no lo es, forzar la entrada una y otra vez hasta que lo sea (con un while)
		int num = Integer.parseInt(input);
		while (num < 0) {
			input = JOptionPane.showInputDialog("Introduce numero: ");
			num = Integer.parseInt(input);
		}
		int valor = Integer.parseInt(input);
		escanearCifras(valor);

	}
	
	static int escanearCifras(int num) {
		
		int cifras = 1;
		
		while ((num / 10) > 0) {
			num = num / 10;
			cifras++;
		}
		
		JOptionPane.showMessageDialog(null, "Cifras: " + cifras);
		return cifras;
		
	}

}
