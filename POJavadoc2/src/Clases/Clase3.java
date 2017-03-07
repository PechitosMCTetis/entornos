package Clases;

/**
 * Clase que crea objetos usuario {@code Clase3} para usarlos en {@code Clase2}
 * @author Ines
 * @version 0.1 
 * @since JDK 1.8 
 * @see Clase1
 */

public class Clase3 
{
	/**
	 * La clase contiene 3 campos,  DNI,nombre,apellidos.
	 */
	private int param1;
	private String param2;
	private String param3;
	
	/**
	 * Este constructor permite introducir los valores de los parametros(DNI,nombre,apellidos)
	 */
	public Clase3(int param1, String param2, String param3)
	{
		this.param1 = param1;
		this.param2=param2;
		this.param3 = param3;
	}
	
	/**
	 * Este constructor esta vacio, se añadiran posteriormente los parametros mediante setters y getters
	 */
	public Clase3()
	{
	}

	/**
	 * este metodo devuelve el DNI del usuario
	 * @return param1
	 */
	public int metodo1() {
		return param1;
	}

	/**
	 * este metodo modifica el DNI del usuario
	 * @return param1
	 */
	public void metodo2(int param1) {
		param1 = param1;
	}

	/**
	 * este metodo devuelve el nombre del usuario
	 * @return param2
	 */
	public String metodo3() {
		return param2;
	}

	/**
	 * este metodo modifica el nombre del usuario
	 * @return param2
	 */
	public void metodo4(String param2) {
		this.param2 = param2;
	}

	/**
	 * este metodo devuelve los apellidos del usuario
	 * @return param3
	 */
	public String metodo5() {
		return param3;
	}

	/**
	 * este metodo devuelve los apellidos del usuario
	 * @return param3
	 */
	public void metodo6(String param3) {
		this.param3 = param3;
	}
	
	
	
	
}