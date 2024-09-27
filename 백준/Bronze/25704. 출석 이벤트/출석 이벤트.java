import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		int n = scan.nextInt();
		int p = scan.nextInt();
		double pay = 0;
		//5개 이상,10미만-> 1. 500원
		if(n>=5&&n<10) {
			pay = p-500;
		}
		//10개 이상 15개 미만->1. 500원, 2. 10%
		else if(n<15&&n>=10) {
			double a =p-500;
			double b =p*0.9;
			if(a<=b) {
				pay=a;
			}else {
				pay=b;
			}
		}
		//15개이상 20개 미만 -> 2. 10% 3. 2000원 쿠폰
		else if(n<20&&n>=15) {
			double a = p-2000;
			double b = p*0.9;
			if(a<=b) {
				pay=a;
			}else {
				pay=b;
			}
		}
		//20개 이상 ->3. 2000원 쿠폰 4.25할인 쿠
		else if(n>=20) {
			double a = p-2000;
			double b = p*0.75;
			if(a<=b) {
				pay=a;
			}else {
				pay=b;
			}
		}
		else if(n<5) {
			pay=p;
		}
		
		if(pay<0) {
			System.out.println(0);
		}else {
			System.out.println((int)pay);
		}
	}
}