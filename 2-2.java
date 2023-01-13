import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		boolean same = false;
		
		num1 *= 10;
		num2 *= 10;
		
		for (int i = 0; i < 5; i++) {
			if(num1 == num2)
			{
				same = true;
				break;
			}
			
			
			if(num1 > num2)
			{
				num2 += 100;
				
				System.out.println(i + ". b 값 : " + num2);
				System.out.println("b값이 더 작습니다.");
			}
			else
			{
				num1 += 100;
				
				System.out.println(i + ". a 값 : " + num1);
				System.out.println("a값이 더 작습니다.");
			}
		}
		
		if(same)
		{
			System.out.println("a와 b의 값이 동일합니다.");
		}
		else
		{
			System.out.println("a와 b의 값은 서로 다른 값입니다.");
		}
		
	}

}
