import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int cho=0;
		int min = 0;
		for(int i=0;i<4;i++) {
			int a = scan.nextInt(); // 집>학교
			cho+=a;
		}
		if(cho>=60) {
			min+=cho/60;
			cho%=60;
			System.out.printf(min + "\n" +cho);
		}else {
			System.out.printf(0 + " \n" +cho);
		}
		
	}
		
}