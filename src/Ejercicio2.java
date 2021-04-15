
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ale = (int)(Math.random()*100000)+1;	
		System.out.println(ale); 
		
		if (ale <= 9999 && ale >=1000 ) {
			System.out.println("El numero tiene cuatro cifras");
		}else if (ale <= 1000) {
			System.out.println("El numero tiene Menos de cuatro cifras");	
		}else if (ale >= 9999) {
			System.out.println("El numero tiene Mas de cuatro cifras");	
				
		}

	}

}
