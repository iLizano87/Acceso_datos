package actividad1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Datos1 {

	public static void main(String args[]) {

		File ruta = new File("src" + File.separator + "actividad1");
		Scanner input = new Scanner(System.in);
		String nombre = input.nextLine();
		File archivo = new File(ruta + File.separator + nombre + ".txt");

		if (ruta.exists()) {
			System.out.println("Dentro del directorio ACTIVIDAD1");
			System.out.println("Introduzca su nombre de usuario.");

			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			ruta.mkdir();
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}