
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nivel = (int)(Math.random()*100)+1;
		System.out.println("El Evaluado tiene un nivil de :"+nivel+"%");
		if (nivel>=90 ) {
		    System.out.println("A obtenido el nivel Maximo");	
		}else if ((nivel >=75 )&&(nivel <=89)) {
			System.out.println("A obtenido el nivel Medio");	
		}else if ((nivel >=50 )&&(nivel <=74)) {
			System.out.println("A obtenido el nivel Regular");	
		}else if (nivel <=49) {
			System.out.println("Se encuentra fuera de Nivel");	
		}
		
		

	}

}
