import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		for(int j =0; j<5;j++) {
			int n = scan.nextInt();
			if(n<40) {
				n=40;
			}
			sum+=n;
		}
		System.out.println(sum/5);
		
		scan.close();
	}
}