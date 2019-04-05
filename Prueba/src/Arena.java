

import java.util.Scanner;

public final class Arena {
	
	
	public static void lucha (Guerrero g1,Mago m1, int g, Integer fg){
		int da�oG, da�oM, vidaG, vidaM;

		da�oG=g1.movimientoLucha();
		System.out.println("Da�o realizado: "+da�oG);
		vidaG=m1.getVida()-da�oG;
		 m1.setVida(vidaG);
		 da�oM=m1.movimientoLucha();
		 System.out.println("Da�o realizado: "+da�oM);
		 vidaM=g1.getVida()-da�oM;
		 g1.setVida(vidaM);
		 System.out.println("Vida actual del Guerrero: "+ g1.getVida());
		 System.out.println("Vida actual del Mago: " +m1.getVida());
		 g=da�oM+da�oG;
		 fg=da�oM+da�oG;
	 }
	public static void lucha (GuerreroFuerte gf1,Mago m1,int g, Integer fg){
		int da�oG, da�oM, vidaG, vidaM;
		
		da�oG=gf1.movimientoLucha();
		System.out.println("Da�o realizado: "+da�oG);
		vidaG=m1.getVida()-da�oG;
		 m1.setVida(vidaG);
		 da�oM=m1.movimientoLucha();
		 System.out.println("Da�o realizado: "+da�oM);
		 vidaM=gf1.getVida()-da�oM;
		 gf1.setVida(vidaM);
		 System.out.println("Vida actual del Guerrero fuerte: "+ gf1.getVida());
		 System.out.println("Vida actual del Mago: " +m1.getVida());
		 g=da�oM+da�oG;
		 fg=da�oM+da�oG;
	 }
	

	public static void main(String[] args) {
		Scanner y = new Scanner(System.in);
		final Guerrero g1 = new Guerrero();
		 Guerrero g2 = new Guerrero();
		final Mago m1 = new Mago();
		GuerreroFuerte gf1= new GuerreroFuerte();
		int da�oValor=0;
		Integer da�oReferencia=0;
		boolean volver = true;
		while(volver){
			System.out.println("Nivel de ps del guerrero fuerte: " + g1.getVida());
			
			System.out.println("<------------------------------->");
			System.out.println("Nivel de ps del mago: " + m1.getVida());
			System.out.println("El da�o acumulado por valor es : "+da�oValor);
			System.out.println("El da�o acumulado por referencia es : "+da�oValor);
		
			lucha(gf1, m1, da�oValor, da�oReferencia);
			
			 g2 = (Guerrero) gf1;
			
			System.out.println("Nivel de ps del guerrero: " + gf1.getVida());
			
			System.out.println("<------------------------------->");
			System.out.println("Nivel de ps del mago: " + m1.getVida());
			System.out.println("El da�o acumulado por valor es : "+da�oValor);
			System.out.println("El da�o acumulado por referencia es : "+da�oValor);
			
			lucha(g1, m1, da�oValor, da�oReferencia);
			System.out.println("Buenasss");

			
			if((g1.getVida()<=0 | m1.getVida()<=0) | (gf1.getVida()<=0 | m1.getVida()<=0)){
				System.out.println("Game over");
			}
			System.out.println(">---------------------------<");
			System.out.println( "�Desea hacer otra batalla?, en ese caso pulse 9");
			int p=y.nextInt();
			if(p != 9){
				volver=false;
			}
		
		}
	}

}


