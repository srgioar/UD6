import javax.swing.JOptionPane;

public class Ejercicio5App {
	
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Introduce num: ");
		//System.out.println(convertirABinario(Integer.parseInt(input)));
		String binario = convertirABinario(Integer.parseInt(input));
		JOptionPane.showMessageDialog(null, "El numero " + input + " en binario es: " + binario);
		
	}
	
	static String convertirABinario(int num) {
		
		
		String numeroBinario = "";
		
		// El 1 indica que hemos llegado al final del algoritmo
		// Dividimos entre dos constantemente, y concatenamos el residuo al string final
		
		while (num > 0) {
			numeroBinario += Integer.toString(num%2);
			num = num / 2;
		}
		
		// Hay que invertir el string, utilizo el método reverse de Stringbuilder
		StringBuilder sb = new StringBuilder();
		sb.append(numeroBinario);
		sb.reverse();
		
		// conversión de stringbuilder a string
		return sb.toString();
	}
	


}
