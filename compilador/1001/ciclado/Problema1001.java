import java.util.*;

//==================================================================
//	Este ejemplo se cicla, NO utilizar para casos de uso ideales
//===================================================================
public class Problema1001{

	private static void calcula(int n){
		int k = 0;
		for (int a=100; a<=n; a++){
			int b1 = a/10;
			int b2 = (a/100)*10+a%10;
			int b3 = a%100;
			if (a+b1 == n){
				System.out.println(""+a+" + "+(b1/10)+(b1%10)+" = "+n);
				k++;
			}	
			if (a+b2 == n){
				System.out.println(""+a+" + "+(b2/10)+(b2%10)+" = "+n);
				k++;
			}	
			if (a+b3 == n){
				System.out.println(""+a+" + "+(b3/10)+(b3%10)+" = "+n);
				k++;
			}
		}
		System.out.println("Total de Sumas = "+k);
	}
	
	public static void main(String [] args){
		
		int n = 0;
		while(true){
			System.out.println("Ejemplo cicladon");
			try{
				Thread.sleep(10000);
			}
			catch(InterruptedException ie){
				
			}
		}	
	}
}
