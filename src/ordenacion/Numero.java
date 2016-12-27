package ordenacion;

import java.util.Scanner;

public class Numero {

	public static int nRandom()
	{
		int x=(int)(100*Math.random()+1);
		return x;
	}
	
	public static int pedirNumeroUsuario ()
	{
		int numero_usuario = 0;
		Scanner scanner = null;
			
			scanner = new Scanner(System.in);
			numero_usuario = scanner.nextInt();
		
		return numero_usuario;
	}
	
	public static int[] posicion(int [] array, int num)
	{
		int longi=array.length;
		for (int i=0;i<longi;i++){
			if(num<array[i]){
				array[i+1]=array[i];
				array[i]=num;
			}
		}
		return array;
	}
	
	public static void ordenoArray(int [] array)
	{
        int i, j, aux;
        for(i=0;i<array.length-1;i++)
             for(j=0;j<array.length-i-1;j++)
                  if(array[j+1]<array[j]){
                     aux=array[j+1];
                     array[j+1]=array[j];
                     array[j]=aux;
                  }
}
}

