package registroFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Registro_Acceso {

	public static void main(String[] args) {
		
		int opcion=-1;
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		
		System.out.println("Bienvenido");
		
		while (opcion!=0){
					
			System.out.print("Elige una opción:\n 1. SIGN UP \n 2. SIGN IN\n Press 0 to EXIT\n");
		
			try{
				opcion = scanner.nextInt();
				}
				catch (java.util.InputMismatchException e) //error con otros caracteres
				{
				opcion = 0;
				System.out.println("Error: valor no válido");
				}
			
			switch (opcion) {
			case 1: 
				Registrarse();
				
			case 2:
				Acceder();
			}

		}
	}
	
	public static void Registrarse(){
		String user=null;
		String psw=null;
		Scanner scan = null;
		File file_user = new File("C:\\Users\\Alumno\\git\\16DIC\\src\\registroFicheros\\UsersData\\USERS"); 
		File file_passw = new File("C:\\Users\\Alumno\\git\\16DIC\\src\\registroFicheros\\UsersData\\PASSWORDS"); 
		scan = new Scanner(System.in);
		System.out.println("Introduce USUARIO: ");
		user = scan.next();
		if(!Existe(user,file_user)){
			if(CreaUsuario (user, file_user)){
				System.out.println("Introduce CONTRASEÑA: ");
				psw = scan.next();
				psw=Codifica(psw);
					if(CreaUsuario(psw, file_passw)){
						System.out.println("Usuario creado correctamente");
					}
			}
		}
		else{
			System.out.println("Usuario utilizado");
		}
		
	}
	
	public static boolean Existe(String usuario, File f){
		boolean existe=false;
		String yaEs= null;
		FileReader fr=null;
		BufferedReader br = null;
		
		try 
		{
			fr=new FileReader (f);
			br = new BufferedReader(fr);
			while (br.ready()){
				yaEs = br.readLine();
				if(yaEs.equals(usuario)){
					existe = true;
				}
			}
			
		} 
		catch (FileNotFoundException e) 
			{
			
				System.out.println("Error al crear el Usuario");
				e.printStackTrace();
			}
		catch (IOException io)
			{
				System.out.println("Error al crear el Usuario");
				io.printStackTrace();
			}
		finally 
			{
				try 
					{
						br.close();
						fr.close();
					} 
				catch (Exception e) 
				{
					System.out.println("Error liberando recursos");
					e.printStackTrace();
				}
			}
		return existe;
		}
	
	public static boolean CreaUsuario (String palabra, File file)
	{
		boolean nuevo=false;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try 
		{
		fw=new FileWriter(file, true);
		bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write(palabra);
		nuevo=true;
		} 
		catch (IOException e) {
			System.out.println("Error creando usuario/contraseña");
			e.printStackTrace();
			nuevo = false;
		}
		finally 
		{
			try {
				bw.close();
				fw.close();
			} 
			catch (Exception e) {
				System.out.println("Error cerrando usuario/contraseña");
				e.printStackTrace();
				nuevo = false;
			}
			
		}
		return nuevo;	
	}
	public static String Codifica (String passw)
	{
		char letra=0;
		String codificada="";
		int longi=passw.length();
		for(int i=0; i<longi; i++){
			letra=(char) (passw.charAt(i)-14);
			codificada+=letra;
		}
		return codificada;
	}
	public static void Acceder(){
		String user=null;
		String psw=null;
		Scanner scan = null;
		File file_user = new File("C:\\Users\\Alumno\\git\\16DIC\\src\\registroFicheros\\UsersData\\USERS"); 
		File file_passw = new File("C:\\Users\\Alumno\\git\\16DIC\\src\\registroFicheros\\UsersData\\PASSWORDS"); 
		scan = new Scanner(System.in);
		System.out.println("Introduce USUARIO: ");
		user = scan.next();
		if(Existe(user,file_user)){
			System.out.println("Introduce CONTRASEÑA: ");
			psw = scan.next();
			psw=Codifica(psw);
				if(Existe(psw, file_passw)){
					System.out.println("Bienvenido al sistema");
				}
			}
		else{
			System.out.println("El usuario no existe");
		}
		
	}
}
