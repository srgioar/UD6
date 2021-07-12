import javax.swing.JOptionPane;

public class Ejercicio9App {

	static int[] arrayMain;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RellenarArray();
		MostrarArray();

	}
	
	static void RellenarArray() {
		
		String input = JOptionPane.showInputDialog("Introduce tamaño: ");
		int size = Integer.parseInt(input);
		arrayMain = new int[size];
		
		for (int i = 0; i < arrayMain.length; i++) {
			
			arrayMain[i] = (int) (Math.random() * 9);
			
		}
	
	}
	
	static void MostrarArray() {
		
		int suma = 0;
		String strValores = "";
		String strSuma;
		
		for (int i = 0; i < arrayMain.length; i++) {
			strValores += "INDEX: " + i + " VALOR: " + arrayMain[i] + "\n";
			//JOptionPane.showMessageDialog(null, "ÍNDICE: " + i + " VALOR: " + arrayMain[i]);
			//System.out.println("ÍNDICE: " + i + " VALOR: " + arrayMain[i]);
			suma += arrayMain[i];
		}
		
		strSuma = Integer.toString(suma);
		JOptionPane.showMessageDialog(null, strValores + "Suma de los valores: " + strSuma);
		
		//System
		
	}

}
