//if���� ����Ͽ� Ȧ���� ¦���� �����ϴ� �Լ�

import java.util.Scanner;


public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number ;
		
		System.out.print ("������ �Է��Ͻÿ� : ");
		number = input.nextInt();
		
		if(number % 2 == 0)
		{
			System.out.println("�Էµ� ������ ¦���Դϴ�.");
		}
		else
		{
			System.out.println("�Էµ� ������ Ȧ���Դϴ�.");
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		input.close();

	}

}