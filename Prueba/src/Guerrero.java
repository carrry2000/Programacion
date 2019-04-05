
import java.util.GregorianCalendar;

public class Guerrero extends Personaje{
GregorianCalendar calendario= new GregorianCalendar();
	int ataque;
	
	public Guerrero(){ 
		
		ataque=10;
		fecha=calendario.getTime();
		System.out.println("Construyendo guerrero a las : " + fecha);
	}
	public int movimientoLucha(){
		System.out.println("*******Espadazo******");
		int ataque2;
		 ataque2=(int)(Math.random()*ataque);
		  
		  return ataque2;
	}
	
}
