package Clases;
import java.util.Arrays;

/**
 * Clase que usara los objetos libro {@code Clase1} y usuario {@code Clase3} para mostrarlos por pantalla 
 * @author Ines
 * @version 0.1 
 * @since JDK 1.8 
 * @see Clase1
 */
public class Clase2 
{
	
    /**
     * Esta clase tiene un array para almacenar los libros y otro para los usuarios y una variable de contador para los arrays.
     */
	private Clase1[] param1;
	private Clase3[] param2;
	private int n;
	
	/**
     * Este constructor introduce el numero de libros y usuarios que tiene
     */
	public Clase2(int n,int x)
	{
		param1 = new Clase1 [n];
		param2 = new Clase3 [x];
	}
	
	/**
	 * Este metodo almacena en el primer array los libros y en el segundo array los usuarios
	 * @param coso
	 * @param hito
	 * @param n
	 */
	public void metodo1(Clase1 coso,Clase3 hito)
	{
		param1[n]=coso;
		param2[n]=hito;
		n++;
	}
	
	/**
	 * este metodo muestra por pantalla la lista de libros
	 */
	public void metodo2()
	{
		System.out.println("Lista de libros");
		for(int i=0;i<param1.length;i++)
		{
			System.out.println(param1[i]);
		}
	}
	
	/**
	 * este metodo muestra por pantalla la lista de usuarios
	 */
	public void metodo3()
	{
		System.out.println("Lista de usuarios");
		for(int i=0;i<param2.length;i++)
		{
			System.out.println(param2[i]);
		}
	}
}
