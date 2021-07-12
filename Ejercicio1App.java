import javax.swing.JOptionPane;
/* @author Sergio A */

public class Ejercicio1App {
	
	
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Introduce figura a calcular: ");
		// Pasamos el input siempre a lowercase para que coincida con el switch
		switch (input.toLowerCase()) {
		case "circulo":
			areaCirculo();
			break;
		case "cuadrado":
			areaCuadrado();
			break;
		case "triangulo":
			areaTriangulo();
			break;
		}
		
	}
	
	static void areaCirculo() {
		
		// (radio^2)*PI
		// Input -> Radio
		
		final double PI = Math.PI;
		double radio = 0;
		double area = 0;
		
		String input = JOptionPane.showInputDialog("Introduce radio: ");
		radio = Double.parseDouble(input);
		area = Math.pow(radio, 2) * PI;
		JOptionPane.showMessageDialog(null, "El area es: " + area);
		
		
	}
	
	static void areaCuadrado() {
		
		// (lado * lado)
		// Input -> Lado
		
		int area = 0;
		int lado = 0;
		
		String input = JOptionPane.showInputDialog("Introduce tamaño del lado: ");
		lado = Integer.parseInt(input);
		
		// Es lado*lado así que no usaré Math.pow
		JOptionPane.showMessageDialog(null, "El area es: " + (lado*lado));
		
	}
	
	static void areaTriangulo() {
		
		// (base * altura) / 2
		// Input -> Base, Altura
		
		double base = 0;
		double altura = 0;
		double area = 0;
		
		String strBase = JOptionPane.showInputDialog("Introduce base: ");
		base = Double.parseDouble(strBase);
		String strAltura = JOptionPane.showInputDialog("Introduce altura: ");
		altura = Double.parseDouble(strAltura);
		area = (base * altura) / 2;
		JOptionPane.showMessageDialog(null, "El area es: " + area);
		
	}

}
