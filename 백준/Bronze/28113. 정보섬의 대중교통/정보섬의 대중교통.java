import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();//지하철까지 걸어가느 시간
		int a = scan.nextInt();//버스
		int b = scan.nextInt();//몇분 뒤 전철?
		int sub = n+(b-n);
		if(sub==a) {
			System.out.println("Anything");
		}else if(sub<a) {
			System.out.println("Subway");
		}else if(sub>a) {
			System.out.println("Bus");
		}
		scan.close();
	}
}