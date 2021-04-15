public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = (int)(Math.random()*100 );//genera datos enteros aleatorios de 0 a 100
		
		if (edad >=0 && edad <=5) {
			System.out.println("tiene "+edad+" años es INFANTE");
		}else if (edad >=6 && edad <=10) {
			System.out.println("tiene "+edad+" años es NIÑO");
			
		}else if (edad >=11 && edad <=15) {
			System.out.println("tiene "+edad+" años es PRE ADOLOCENTE");
			
		}else if (edad >=16 && edad <=18) {
			System.out.println("tiene "+edad+" años es ADOLUCENTE");
			
		}else if (edad >=19 && edad <=25) {
			System.out.println("tiene "+edad+" años es PRE ADULTO");
			
		}else if (edad >=26 && edad <=40) {
			System.out.println("tiene "+edad+" años es ADULTO");
			
		}else if (edad >=41 && edad <=55) {
			System.out.println("tiene "+edad+" años es PRE ANCIANO");
			
		}else if (edad >=56) {
			System.out.println("tiene "+edad+" años es ANCIANO");
			
		}
       
	}

}
