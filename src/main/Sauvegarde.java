package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import modele.Modele;

public class Sauvegarde {

	private static BufferedWriter file;


	public static void sauvegarder(String e) {
		try {
			if(file==null) {
				File file=new File("test.txt");
				if(file.exists()) {
					file.delete();
					Sauvegarde.file = new BufferedWriter(new FileWriter(file,true));
				}
			}

			if(e.equals("a")){
				file.write("avancer");

				file.newLine();
			}
			if(e.equals("r")){
				file.write("reculer");
				file.newLine();

			}
			if(e.equals("d")){
				file.write("droite");
				file.newLine();
			}
			if(e.equals("g")){
				file.write("gauche");
				file.newLine();
			}
			Sauvegarde.file.flush();

		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}
}
