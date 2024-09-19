import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int Ah = A+(C/60);
		int Am = B+(C%60);
		if (Ah >= 24) {
			Ah-=24;
		}if(Am >=60) {
			Ah+=1;
			Am-=60;
		}
		if(Ah==24) {
			Ah=0;
		}
		System.out.printf("%d %d",Ah,Am);
		}
}