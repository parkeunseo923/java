//�ΰ��� ������ �Է¹޾� �� ū���� ����ϴ� �Լ�

import java.util.Scanner;


public class Lec2Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number1 ;
		int number2 ;
		
		System.out.print ("ù ��° ������ �Է��Ͻÿ� : ");
		number1 = input.nextInt();
		
		System.out.print ("�� ��° ������ �Է��Ͻÿ� : ");
		number2 = input.nextInt();
		
		
		if(number1 > number2)
		{
			System.out.println("ū ����  " + number1 +  "�Դϴ�.");
		}
		else if(number2 > number1)
		{
			System.out.println("ū ����  " + number2 +  "�Դϴ�.");
		}
		else
		{
			System.out.println("�� ������ �����ϴ�.");
		}
		
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		input.close();

	}

}