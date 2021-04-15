
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = (int)(Math.random()*10)+1;
		int num2 = (int)(Math.random()*10)+1;
		int num3 = (int)(Math.random()*10)+1;
		System.out.println("numero 1 ="+num1+", --- numero 2 ="+num2+",  --- numero 3 ="+num3);
		
		if (num1 > num2) 
		{
			if(num1 > num3) 
			{
				System.out.println("El Numero 1 es el Mayor ");
			}
				
		}
		
		if (num2 > num1) 
		{
			if(num2 > num3) 
			{
				System.out.println("El Numero 2 es el Mayor ");
			}
				
		}
		
		if (num3 > num1) 
		{
			if(num3 > num2) 
			{
				System.out.println("El Numero 3 es el Mayor ");
			}
				
		}
		
		if (num1 == num2) {
			
			if (num2 == num3) {
				System.out.println("Los tres son iguales ");
				
			}else if (num2 > num3) {
				System.out.println("los numeros 1 y 2 son iguales y son los Mayores ");
				
			}


	}
		
		if (num2 == num3) {
			
			if (num1 == num3) {
				System.out.println("Los tres son iguales ");
				
			}else if (num2 > num1) {
				System.out.println("los numeros 2 y 3 son iguales y son los Mayores ");
				
			}
	}
		if (num1 == num3) {
			
			if (num1 == num2) {
				System.out.println("Los tres son iguales ");
				
			}else if (num3 > num2) {
				System.out.println("los numeros 1 y 3 son iguales y son los Mayores ");
				
			}


	}		
		
		
		
}
}
