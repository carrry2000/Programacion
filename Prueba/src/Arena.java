

import java.util.Scanner;

public final class Arena {
	
	
	public static void lucha (Guerrero g1,Mago m1, int g, Integer fg){
		int dañoG, dañoM, vidaG, vidaM;

		dañoG=g1.movimientoLucha();
		System.out.println("Daño realizado: "+dañoG);
		vidaG=m1.getVida()-dañoG;
		 m1.setVida(vidaG);
		 dañoM=m1.movimientoLucha();
		 System.out.println("Daño realizado: "+dañoM);
		 vidaM=g1.getVida()-dañoM;
		 g1.setVida(vidaM);
		 System.out.println("Vida actual del Guerrero: "+ g1.getVida());
		 System.out.println("Vida actual del Mago: " +m1.getVida());
		 g=dañoM+dañoG;
		 fg=dañoM+dañoG;
	 }
	public static void lucha (GuerreroFuerte gf1,Mago m1,int g, Integer fg){
		int dañoG, dañoM, vidaG, vidaM;
		
		dañoG=gf1.movimientoLucha();
		System.out.println("Daño realizado: "+dañoG);
		vidaG=m1.getVida()-dañoG;
		 m1.setVida(vidaG);
		 dañoM=m1.movimientoLucha();
		 System.out.println("Daño realizado: "+dañoM);
		 vidaM=gf1.getVida()-dañoM;
		 gf1.setVida(vidaM);
		 System.out.println("Vida actual del Guerrero fuerte: "+ gf1.getVida());
		 System.out.println("Vida actual del Mago: " +m1.getVida());
		 g=dañoM+dañoG;
		 fg=dañoM+dañoG;
	 }
	

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		final Guerrero g1 = new Guerrero();
		 Guerrero g2 = new Guerrero();
		final Mago m1 = new Mago();
		GuerreroFuerte gf1= new GuerreroFuerte();
		int dañoValor=0;
		Integer dañoReferencia=0;
		boolean volver = true;
		while(volver){
			System.out.println("Nivel de ps del guerrero fuerte: " + g1.getVida());
			
			System.out.println("<------------------------------->");
			System.out.println("Nivel de ps del mago: " + m1.getVida());
			System.out.println("El daño acumulado por valor es : "+dañoValor);
			System.out.println("El daño acumulado por referencia es : "+dañoValor);
		
			lucha(gf1, m1, dañoValor, dañoReferencia);
			
			 g2 = (Guerrero) gf1;
			
			System.out.println("Nivel de ps del guerrero: " + gf1.getVida());
			
			System.out.println("<------------------------------->");
			System.out.println("Nivel de ps del mago: " + m1.getVida());
			System.out.println("El daño acumulado por valor es : "+dañoValor);
			System.out.println("El daño acumulado por referencia es : "+dañoValor);
			
			lucha(g1, m1, dañoValor, dañoReferencia);
			System.out.println("Buenasss");
			System.out.println("Adiossss");

			
			if((g1.getVida()<=0 | m1.getVida()<=0) | (gf1.getVida()<=0 | m1.getVida()<=0)){
				System.out.println("Game over");
			}
			System.out.println(">---------------------------<");
			System.out.println( "¿Desea hacer otra batalla?, en ese caso pulse 9");
			int p=y.nextInt();
			if(p != 9){
				volver=false;
			}
		
		}
	}

}


