import java.util.Scanner;


public class QuadraticEq {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);  
		
		float b ;
		float c ;
		
		System.out.print ("2�� �������� 1������ ����� �Է��Ͻÿ� : ");
		b = input.nextFloat();
		
		System.out.print ("2�� �������� ������� �Է��Ͻÿ� : ");
		c = input.nextFloat();
		
		double dRoots1 = (-b + Math.sqrt(b * b - 4.0 * c) )/2.0 ;
		double dRoots2 = (-b - Math.sqrt(b * b - 4.0 * c) )/2.0 ;
		
		System.out.println("�� = " + dRoots1+ " , "+ dRoots2);
		
		input.close();


	}

}
