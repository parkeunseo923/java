//두개의 정수를 입력받아 더 큰수를 출력하는 함수

import java.util.Scanner;


public class Lec2Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number1 ;
		int number2 ;
		
		System.out.print ("첫 번째 정수를 입력하시오 : ");
		number1 = input.nextInt();
		
		System.out.print ("두 번째 정수를 입력하시오 : ");
		number2 = input.nextInt();
		
		
		if(number1 > number2)
		{
			System.out.println("큰 수는  " + number1 +  "입니다.");
		}
		else if(number2 > number1)
		{
			System.out.println("큰 수는  " + number2 +  "입니다.");
		}
		else
		{
			System.out.println("두 정수가 같습니다.");
		}
		
		
		System.out.println("프로그램이 종료되었습니다.");
		
		input.close();

	}

}