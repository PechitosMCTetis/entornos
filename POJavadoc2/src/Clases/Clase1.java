package Clases;

/**
 * Clase de creacion de objetos libro para usar en la {@code Clase2}
 * @author Ines
 * @version 0.1 
 * @since JDK 1.8 
 * @see Clase1
 */

public class Clase1 
{
	/**
	 * La clase contiene 4 campos(genero,titulo,autor,numero de paginas).
	 */
	private String param1="";
	private String param2="";
	private String param3="";
	private int param4=0;
	
	/**
	 * Este constructor permite introducir los valores de los parametros(titulo,autor,genero,numero de paginas)
	 */
	public Clase1 (String param2,String param3, String param1, int param4)
	{
		this.param2 = param2;
		this.param3 = param3;
		this.param1 = param1;
		this.param4 = param4;
	}
	
	/**
	 * Este constructor esta vacio, se añadiran posteriormente los parametros mediante setters y getters
	 */
	public Clase1()
	{	
	}

	/**
	 * este metodo devuelve el genero del libro
	 * @return param1
	 */
	public String metodo1() {
		return param1;
	}

	/**
	 * este metodo modifica el genero del libro
	 * @return param1
	 */
	public void metodo2(String param1) {
		this.param1 = param1;
	}

	/**
	 * este metodo devuelve el titulo del libro
	 * @return param2
	 */
	public String metodo3() {
		return param2;
	}

	/**
	 * este metodo modifica el titulo del libro
	 * @return param2
	 */
	public void metodo4(String param2) {
		this.param2 = param2;
	}

	/**
	 * este metodo devuelve el autor del libro
	 * @return param3
	 */
	public String metodo5() {
		return param3;
	}

	/**
	 * este metodo modifica el autor del libro
	 * @return param3
	 */
	public void metodo6(String param3) {
		this.param3 = param3;
	}

	/**
	 * este metodo devuelve el numero de paginas del libro
	 * @return param4
	 */
	public int metodo7() {
		return param4;
	}

	/**
	 * este metodo modifica el numero de paginas del libro
	 * @return param4
	 */
	public void metodo8(int numPaginas) {
		this.param4 = param4;
	}
	
	
	
}
