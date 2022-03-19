//월을 입력받아 월의 일수를 출력하는 함수

import java.util.Scanner;


public class DaysInMonth {

	public static void main(String[] args) {
		
		int month ;
		
		Scanner input = new Scanner(System.in);
		System.out.print ("월을 입력하시오 : ");
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
				System.out.println(month + "월의 일수는 31일 입니다.\n");
				break;
			
			case 2:
				System.out.println(month + "월의 일수는 28일 입니다.\n");
				break;
				
			default:
				System.out.println(month + "월의 일수는 30일 입니다.\n");
				break;

		}
		
		
		System.out.println("프로그램이 종료되었습니다.");
		
		input.close();

	}

}