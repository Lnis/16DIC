package palabra;

public class VecesLetra {
	
	public static void Contenida (String palabra,char letra)
	{
		int longitud=palabra.length();
		int indi=0;
		int cantidad=0;
		
		while(indi<longitud)
		{
			if(letra==palabra.charAt(indi))
			{
				cantidad++;
			}
			indi++;
		}
		System.out.println("La letra "+letra+" está "+cantidad+" veces en la palabra "+palabra);
	}

}
