import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio11App {
	
	public static void main(String[] args) {
		
		int[] arrayMain;
		int[] arraySecondary;
		int[] arrayFinal;
		
		String input = JOptionPane.showInputDialog("Introduce tamaño: ");
		int size = Integer.parseInt(input);
		arrayMain = new int[size];
		randomizarContenidoArray(arrayMain);
		arraySecondary = new int[arrayMain.length];
		// Si equiparo los arrays, es por referencia y son idénticos
		// arraySecondary = arrayMain;
		randomizarContenidoArray(arraySecondary);
		arrayFinal = multiplicarArrays(arrayMain, arraySecondary);
		
		//JOptionPane.showMessageDialog(null, mostrarArray(arrayMain));
		//JOptionPane.showMessageDialog(null, mostrarArray(arraySecondary));
		JOptionPane.showMessageDialog(null, "Array primero: \n" + mostrarArray(arrayMain));
		JOptionPane.showMessageDialog(null, "Array segundo: \n" + mostrarArray(arraySecondary));
		JOptionPane.showMessageDialog(null, "Array final: \n" + mostrarArray(arrayFinal));
		
	}
	
	static void randomizarContenidoArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			Random rand = new Random();
			int numeroRandom = rand.nextInt(10);
			array[i] = numeroRandom;
		}
		
	}
	
	static int[] multiplicarArrays(int[] array1, int[] array2) {
		
		// Los dos arrays de parámetro son de la misma longitud, así que cojo solo el primero
		int[] arraySalida = new int[array1.length];
		
		for (int i = 0; i < arraySalida.length; i++) {
			arraySalida[i] = array1[i] * array2[i];
		}
		
		return arraySalida;
		
	}
	
	static String mostrarArray(int[] array) {
		
		String strArray = "";
		
		for (int i = 0; i < array.length; i++) {
			strArray += "[ "+ array[i] + " ]";
		}
		
		return strArray;
		
	}
	


}
