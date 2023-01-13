import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		float score_f = 0;
		float sum = 0;
		float attend = 0;
		
		boolean over = false;
		
		for (int i = 0; i < 4; i++) {
			score_f = sc.nextFloat();
			sum+=score_f;
			
			if(score_f > 100) over = true;
		}
		sum /= 4;
		sum = sum / 5 * 4;
		
		attend = sc.nextFloat();
		attend = attend / 5 * 1;
		
		
		if (over) {
			System.out.println("100점이 넘는 점수가 있습니다.\n등급 산출이 불가합니다.");
		}
		else if (sum + attend > 89) {
			System.out.println("A");
		}
		else if (sum + attend > 59) {
			System.out.println("B");
		}
		else if (sum + attend > 32) {
			System.out.println("C");
		}
		else
		{
			System.out.println("D");
		}
	}

}
