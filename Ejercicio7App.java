import javax.swing.JOptionPane;

public class Ejercicio7App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = JOptionPane.showInputDialog("Cantidad en Euros: ");
		String input2 = JOptionPane.showInputDialog("Introduce divisa: (minús. sin tildes)");
		ConversorDivisas(Integer.parseInt(input), input2);

	}
	
	static void ConversorDivisas(int cantidad, String divisa) {
		
		double conversion = 0;
		
		switch (divisa) {
			case "libras":
				conversion = cantidad * 0.86;
				break;
			case "dolares":
				conversion = cantidad * 1.28611;
				break;
			case "yenes":
				conversion = cantidad * 129.852;
				break;
		}
				
		JOptionPane.showMessageDialog(null, "Al cambio son: " + conversion + " " + divisa);
				
	}

}
