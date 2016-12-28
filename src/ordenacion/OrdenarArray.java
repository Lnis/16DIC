package ordenacion;

public class OrdenarArray {

	public static void main(String[] args)
	{
		int a_ent_a [] = new int[4];
	//	int a_ent_a [] = {99, 99, 99, 99};
		int aux=0;
		int num=0;
		
/*		//inicializo el array con numeros aleatorios
		for(int i=0;i<a_ent_a.length;i++)
		{
			a_ent_a[i]=Numero.nRandom();
			System.out.println(a_ent_a[i]);
		}*/
		
		System.out.println("Dame 4 numeros:");
		
		a_ent_a[0]=Numero.pedirNumeroUsuario();
		for(int i=0;i<a_ent_a.length-1;i++)
		{
			num=Numero.pedirNumeroUsuario();
			
			for(int k=1;k<a_ent_a.length-i-1;k++)
				if(num<a_ent_a[k])
				{
				aux=a_ent_a[k];
				a_ent_a[k]=num;
				num=aux;
				}
				else{
					a_ent_a[k+1]=num;
				}
			
			/*for(int k=0;k<a_ent_a.length;k++)
				a_ent_a=Numero.posicion(a_ent_a, aux,i);*/
		}
		
		
	//	Numero.ordenoArray(a_ent_a);
		for (int j=0;j<a_ent_a.length;j++)
		{
			System.out.println(a_ent_a[j]);
		}
	}

}
