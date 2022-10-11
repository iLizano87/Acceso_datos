package actividad1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Datos4 {

	public static void main(String[] args) {

		String path1 = ("C:\\Users\\preds\\OneDrive\\Documentos\\s21.txt");
		String path2 = ("C:\\Users\\preds\\OneDrive\\Documentos\\EVERIS\\04 - PROGRAMACION\\TIENDA ZAPATOS\\tiendazapato1.txt");
		String difPath = ("C:\\Users\\preds\\OneDrive\\Documentos\\pruebafrases.txt");

		File file1 = new File(path1);
		File file2 = new File(path2);

		BufferedReader doc1 = null;
		BufferedReader doc2 = null;
		BufferedWriter dif = null;

		try {
			doc1 = new BufferedReader(new FileReader(file1));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			doc2 = new BufferedReader(new FileReader(file2));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			dif = new BufferedWriter(new FileWriter(difPath, true));
		} catch (IOException e2) {
			e2.printStackTrace();
		}

		String line1;
		String line2;

		try {
			int lineCount = 1;

			do {
				line1 = doc1.readLine();
				line2 = doc2.readLine();
				if ((line1 == null && line2 != null) || (line1 != null && line2 == null)) {
					dif.write("" + lineCount);// Conversion a String de los int
					dif.newLine();
				} else if (line1 != null) {
					if (!line1.equals(line2)) {
						dif.write("" + lineCount);// Conversion a String de los int
						dif.newLine();
					}

				}
				lineCount++;
			} while (line1 != null & line2 != null);
		} catch (Exception e3) {
			System.err.println("ERROR DE ENTRADA/SALIDA");
			e3.printStackTrace();
		} finally {
			try {
				dif.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
