import javax.swing.JOptionPane;

public class Ejercicio2App {
	
	public static void main(String[] args) {
		
		int cantidadNums = 0;
		int rangoMin = 0;
		int rangoMax = 0;
		String numerosFinales = "";
		
		String strCantidad = JOptionPane.showInputDialog("Introduce cantidad nums: ");
		String strMin = JOptionPane.showInputDialog("Rango min: ");
		String strMax = JOptionPane.showInputDialog("Rango max: ");
		rangoMin = Integer.parseInt(strMin);
		rangoMax = Integer.parseInt(strMax);
		cantidadNums = Integer.parseInt(strCantidad);
		
		for (int i = 0; i < cantidadNums; i++) {
			//GenerarNumero(rangoMin, rangoMax);
			numerosFinales += "Numero n" + i + ": " + generarNumero(rangoMin, rangoMax) + "\n";
			
		} // final for
		
		JOptionPane.showMessageDialog(null, numerosFinales);
		
	} // final main
	
	static int generarNumero(int rangoMin, int rangoMax) {
		
		// Establezco el rango con -> rangoMínimo + (math.random * rangoMáximo)
		
		// Este cast es un poco feo pero parece que cumple su cometido:
		return (int) ((int)rangoMin + (Math.random() * rangoMax));
		
	}
	
	
}
