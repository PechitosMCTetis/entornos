package Main;
import paquete.Clase1;
import paquete.Clase2;

public class Main {

	private Clase2 video;
	private Clase2 video2;
	private Clase1 videoClub;
	
	public static void main(String[] args) 
	{
		Clase2 video = new Clase2("p2", 24, "thriller psicologico");
		Clase2 video2 = new Clase2("abc", 36, "algo");
		video.metodo5();
		Clase1 videoClub = new Clase1();
	}
	
	public void listaPeliculas()
	{
		videoClub.metodo1();
		
	}

}
