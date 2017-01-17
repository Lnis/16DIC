package edu.femxa.val.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Array2Fichero {
	
	public static String[] fromFichero2Array (File file) throws IOException
	{
		String[] lista_cadena = null;
		int i=0;
		FileReader filereader=new FileReader (file);
		BufferedReader br = new BufferedReader(filereader);
		while (br.readLine() != null){
			lista_cadena [i] = br.readLine();
			i++;
		}
		return lista_cadena; 
	}
	
	
	public static boolean fromArray2Fichero (String [] lista_cadena)
	{
		boolean ok = false;
		File file_dos=null;
		int longi=lista_cadena.length;
		FileWriter filewriter=new FileWriter (file_dos);
		BufferedWriter bw = new BufferedWriter(filewriter);
		for (int i=0; i<longi; i++){
			bw.write(String lista_cadena)
			bw.newLine();
		}
		
		return ok;
		
		
	}

}
