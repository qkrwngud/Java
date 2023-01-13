import java.util.Scanner;

public class Main {
	
	static String information(String n, String r)
	{
		System.out.println(n + "의 거주지는 " + r + "이다.");
		return "?";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		String r = sc.next();
		
		information(n, r);
		
	}

}
