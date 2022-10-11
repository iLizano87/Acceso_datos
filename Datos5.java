package actividad1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Datos5 {

	public static void main(String[] args) {

		String path = ("C:\\Users\\preds\\OneDrive\\Documentos\\contactos.txt");
		System.out.println("Cuantos contactos quieres insertar?: ");
		BufferedWriter escribir = null;

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		if (num > 0) {
			int contador = 0;
			try {
				escribir = new BufferedWriter(new FileWriter(path, true));
			} catch (IOException e) {
				e.printStackTrace();
			}
			while (contador < num) {
				try {
					System.out.println("Introduce nombre");
					String nombre = sc.next();
					System.out.println("Introduce apellido");
					String apellido = sc.next();
					System.out.println("Introduce telefono");
					String telefono = sc.next();
					escribir.write("" + nombre + "#" + apellido + "#" + telefono);
					escribir.newLine();
					contador++;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				if (escribir != null) {
					escribir.close();
				} else {
					System.out.println("No hay un archivo de contactos válido");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.exit(0);
		}
	}

}
//Crea un programa que pida al usuario el número de contactos a insertar
//en un fichero de texto contactos.txt, una vez hecho esto, se irá pidiendo
//al usuario el nombre, apellidos y teléfono de cada contacto y se
//almacenará en el fichero línea a línea con el siguiente formato:
//nombre#apellidos#telefono