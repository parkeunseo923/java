//���� �Է¹޾� ���� �ϼ��� ����ϴ� �Լ�

import java.util.Scanner;


public class DaysInMonth {

	public static void main(String[] args) {
		
		int month ;
		
		Scanner input = new Scanner(System.in);
		System.out.print ("���� �Է��Ͻÿ� : ");
		month = input.nextInt();
		

		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month + "���� �ϼ��� 31�� �Դϴ�.\n");
				break;
			
			case 2:
				System.out.println(month + "���� �ϼ��� 28�� �Դϴ�.\n");
				break;
				
			default:
				System.out.println(month + "���� �ϼ��� 30�� �Դϴ�.\n");
				break;

		}
		
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		input.close();

	}

}