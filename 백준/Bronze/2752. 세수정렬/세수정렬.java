import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		for(int i=0;i<3;i++) {
			num[i] =scan.nextInt();
		}
		Arrays.sort(num);
		//결과 출력
		for(int n : num) {
			System.out.printf(n + " ");
		}
		scan.close();
	}
}