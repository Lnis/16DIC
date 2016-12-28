package arrayDeObjetos;

public class Persona {
	
	private int edad;				//Definimos los atributos de la clase
	private String nombre;

	
	public Persona()
	{
		//constructor por defecto
	}
	
	
	
	/*
	 * Constructor usando parametros
	 */
	
	public Persona (String nombre, int edad)
	{
		this.nombre=nombre;
		this.edad=edad;
	}



	public String getNombre() {
		
		return nombre;
	}



	public int getEdad() {
		
		return edad;
	}


}
