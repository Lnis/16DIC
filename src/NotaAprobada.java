

import java.util.Scanner;

/**
 * progrma que pide una nota entera
 * hasta que sea mayor que 5 (aprobada)
 * @author Administrador
 *
 */
public class NotaAprobada {
	
	private static  boolean aprobado (int n)
	{
		return (n>=5);
	}

	
	public static int pedirNota ()
	{
		int num_leido = 0;
		Scanner scanner = null;
			
			System.out.println("Pedir nota");
			scanner = new Scanner(System.in); //preparo para leer de la entrada est�ndar (teclado)
			num_leido = scanner.nextInt(); //leo y asigno
			
		
		return num_leido;
	}
	
	public static void imprimeNotaAlfabetica(int nota_numerica)
	{
		switch (nota_numerica) {
		case 10:
			System.out.println("MATRICULA DE HONOR");
			break;
		case 9:
			System.out.println("SOBRE");
			break;
		case 8:
		case 7:
			System.out.println("NOTABLE");
			break;
		case 6:
			System.out.println("BIEN");
			break;
		case 5:
			System.out.println("SUFICIENTE");
			break;
			
			default:
				System.out.println("INSUFICIENTE");
			break;
		}
		
	}
	
	public static void main(String[] args) {
		
		int nota = 0;
		
		
		do
		{
			nota = pedirNota();
		} while (!aprobado(nota));
		
		System.out.println("APROBASTE");
		
	}
}