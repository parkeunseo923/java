//숫자를 입력받아 한글로 출력하는 함수

import java.util.Scanner;


public class Int2Hwd {

	public static void main(String[] args) {
		
		int number ;
		
		Scanner input = new Scanner(System.in);
		System.out.print ("정수를 입력하시오 : ");
		number = input.nextInt();
		

		switch(number)
		{
			case 1:
				System.out.println("하나\n");
				break;
			
			case 2:
				System.out.println("둘\n");
				break;
				
			case 3:
				System.out.println("셋\n");
				break;
				
			default:
				System.out.println("아직 입력한 숫자를 한글로 출력할 수 없습니다.\n");
				break;
		}
		
		
		System.out.println("프로그램이 종료되었습니다.");
		
		input.close();

	}

}