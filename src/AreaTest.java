import java.util.Scanner;


public class AreaTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double PI = 3.141592;
		double radius ;
		
		System.out.print ("���� �������� �Է��Ͻÿ� : ");
		radius = input.nextDouble();

		double area = radius * radius * PI;
		
		System.out.println("�������� "+radius +" �� ���� ������ "+area+" �Դϴ�.");
		
		input.close();

	}

}
