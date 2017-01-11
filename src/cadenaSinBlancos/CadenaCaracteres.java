package cadenaSinBlancos;

public class CadenaCaracteres {
	
	String cadenaCaracteres;
	
	public CadenaCaracteres(String cadena){
		cadenaCaracteres=cadena;
	}
	
	public String quitaBlancos() 
	{
	String cadenaSinBlancos = "";
	int y=cadenaCaracteres.length();
	String cadena=cadenaCaracteres;
		for (int x=0; x< cadenaCaracteres.length(); x++)
		{
			if (cadenaCaracteres.charAt(x) != ' ')
			{
				cadenaSinBlancos += cadenaCaracteres.charAt(x); 
			}
		}
		return cadenaSinBlancos;
	} 
}
