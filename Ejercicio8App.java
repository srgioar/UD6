import javax.swing.JOptionPane;

public class Ejercicio8App {
	
	static int[] arrayMain = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RellenarArray();
		MostrarArray();

	}
	
	static void RellenarArray() {
		
		for (int i = 0; i < 10; i++) {
			String input = JOptionPane.showInputDialog("Introduce la pos " + i);
			arrayMain[i] = Integer.parseInt(input);
			
		}
	
	}
	
	static void MostrarArray() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("ÍNDICE: " + i + " VALOR: " + arrayMain[i]);
		}
		
	}

}
