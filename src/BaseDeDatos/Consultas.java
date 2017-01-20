package BaseDeDatos;

public class Consultas {
	
	public static String CONSULTA_EMPLEADOS_SALARIO_DESC="SELECT * from EMPLOYEES E, DEPARTMENTS D WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID ORDER BY E.SALARY DESC";

}
