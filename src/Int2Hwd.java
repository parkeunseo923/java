//���ڸ� �Է¹޾� �ѱ۷� ����ϴ� �Լ�

import java.util.Scanner;


public class Int2Hwd {

	public static void main(String[] args) {
		
		int number ;
		
		Scanner input = new Scanner(System.in);
		System.out.print ("������ �Է��Ͻÿ� : ");
		number = input.nextInt();
		

		switch(number)
		{
			case 1:
				System.out.println("�ϳ�\n");
				break;
			
			case 2:
				System.out.println("��\n");
				break;
				
			case 3:
				System.out.println("��\n");
				break;
				
			default:
				System.out.println("���� �Է��� ���ڸ� �ѱ۷� ����� �� �����ϴ�.\n");
				break;
		}
		
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		input.close();

	}

}