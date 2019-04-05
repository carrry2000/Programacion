
import java.util.Date;

public  abstract  class Personaje {

	int vida;
	Date fecha;
	
	Personaje(){ 
		
		vida=100;
		
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public int getVida() {
		return vida;
	}
	
	public abstract int movimientoLucha();
	
}
