package Argumentos;

public class ContarLetras {

	public static void main(String[] args) {
		String palabraLarga="";
		int contador=0;
		for(String palabra: args)
		{
			if(palabra.length()>palabraLarga.length())
			{
				palabraLarga=palabra;
			}
			contador++;
		}
		System.out.println("El argumento mayor es "+palabraLarga +" de "+contador+" argumentos");
	}
}
