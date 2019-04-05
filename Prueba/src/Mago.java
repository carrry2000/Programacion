import java.util.GregorianCalendar;


public class Mago extends Personaje {
	GregorianCalendar calendario= new GregorianCalendar();
	int magia;
	
	public Mago(){ 
		
	magia=10;
	super.setVida(super.getVida()+10*100/100);
	fecha=calendario.getTime();
	System.out.println("Construyendo mago a las : " + fecha);
	}
	
	 public int movimientoLucha(){
		System.out.println("*******Hechizo******");
		int magia2;
		magia2=(int)(Math.random()*magia);
		
		return magia2;
	}
}
