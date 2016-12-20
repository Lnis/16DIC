package palabra;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String word=null;
		Scanner scanner1 = null;
		Scanner scanner2 = null;
		int num=0;
		char letra='a';
		
		System.out.println("Dime palabra");
		scanner1 = new Scanner(System.in);
		word = scanner1.nextLine();
		
		System.out.println("Dime posicion");
		scanner2 = new Scanner(System.in);
		num = scanner2.nextInt();
		
		LetrasPalabra.Imprimir(word);
		CadenaFor.ImprimirFor(word);
		NPrimerasLetras.RecorrerPrimeras(word, num);
		NUltimasLetras.RecorrerUltimas(word, num);
		VecesLetra.Contenida(word,letra);
		
		System.out.println("FIN");
	}

}
