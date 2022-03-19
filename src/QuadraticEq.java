import java.util.Scanner;


public class QuadraticEq {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);  
		
		float b ;
		float c ;
		
		System.out.print ("2차 방정식의 1차항의 계수를 입력하시오 : ");
		b = input.nextFloat();
		
		System.out.print ("2차 방정식의 상수항을 입력하시오 : ");
		c = input.nextFloat();
		
		double dRoots1 = (-b + Math.sqrt(b * b - 4.0 * c) )/2.0 ;
		double dRoots2 = (-b - Math.sqrt(b * b - 4.0 * c) )/2.0 ;
		
		System.out.println("근 = " + dRoots1+ " , "+ dRoots2);
		
		input.close();


	}

}
