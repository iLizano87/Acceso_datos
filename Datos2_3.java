package actividad1;

import java.io.File;
import java.util.Scanner;

public class Datos2_3 {

	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		System.out.println("Introduce ruta: ");
		String ruta = intro.nextLine();
		System.out.println("Introduce la extension: ");
		String extension = intro.nextLine();
		extension = extension.toLowerCase();
		if (!extension.contains(".")) {
			if(extension.equalsIgnoreCase(extension)) {
				verFichero(ruta, extension);
			}	
		} else {
			String extension1 = "." + extension;			
				verFichero(ruta, extension);
			}
		}

	public static void verFichero(String ruta) {// DATOS 2 - SEGUNDO EJERCICIO
		File archivo = new File(ruta);
		if (archivo.exists()) {
			File[] ficheros = archivo.listFiles();
			for (int i = 0; i < ficheros.length; i++) {
				System.out.println(ficheros[i]);
			}
		} else {
			System.out.println("No existe ruta");
		}
	}

	public static void verFichero(String ruta, String extension) {// DATOS 3
		File archivo = new File(ruta);		
		if (archivo.exists()) {
			File[] ficheros = archivo.listFiles();
			for (int i = 0; i < ficheros.length; i++) {
				if (ficheros[i].getName().contains(extension)) {
					System.out.println(ficheros[i].getName());
				}
			}
		} else {
			System.out.println("No existe ruta");
		}
	}
}
