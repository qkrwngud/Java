import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		if(num1 > num2)
		{
			for (int i = num2; i < num1 + 1; i++) {
				sum+=i;
			}
		}
		else
		{
			for (int i = num1; i < num2 + 1; i++) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}

}
