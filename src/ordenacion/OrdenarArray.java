package ordenacion;

public class OrdenarArray {

	public static void main(String[] args)
	{
		int a_ent_a [] = new int[4];
		int aux=0;
		
/*		//inicializo el array con numeros aleatorios
		for(int i=0;i<a_ent_a.length;i++)
		{
			a_ent_a[i]=Numero.nRandom();
			System.out.println(a_ent_a[i]);
		}*/
		
		System.out.println("Dame 4 numeros:");
		
		for(int i=0;i<a_ent_a.length;i++)
		{
			aux=Numero.pedirNumeroUsuario();
			
			for(int k=0;k<a_ent_a.length;k++)
				a_ent_a=Numero.posicion(a_ent_a, aux);
		}
		
		
	//	Numero.ordenoArray(a_ent_a);
		for (int j=0;j<a_ent_a.length;j++)
		{
			System.out.println(a_ent_a[j]);
		}
	}

}
