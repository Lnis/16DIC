package palabra;

public class AlReves {
	
	public static void Invertir(String palabra)
	{
		int	contador=0;
		contador=palabra.length()-1;
		while(contador<palabra.length()&&contador>=0)
		{
			System.out.println(palabra.charAt(contador));
			contador--;
		}
	
	}

}
