import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
			
			if(num1 % 2 == 0)
			{
				System.out.println("even");
			}
			else
			{
				System.out.println("odd");
			}
		}
		else
		{
			if(num2 % 2 == 0)
			{
				System.out.println("even");
			}
			else
			{
				System.out.println("odd");
			}
		}
	}

}
