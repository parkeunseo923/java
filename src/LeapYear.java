import java.util.Scanner;


public class LeapYear {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int year ;
		float leapyear = 0;
		boolean result ;
		
		System.out.print ("계산할 연도을 입력하시오 : ");
		year = input.nextInt();
		
		leapyear = year % 4;
		result = (leapyear == 0);
		
		System.out.println(result);
		
		input.close();


	}

}
