import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();//바구니의 총 개수
		int m = scan.nextInt(); //공 바꾸기 횟수
		int[] bas = new int[n];
		for(int i=0;i<n;i++) {
			bas[i]=0;
		}
		for(int i=0;i<m;i++) { //m번 반복하겠다.
			int a = scan.nextInt()-1; //배열 인덱스 고려
			int b = scan.nextInt()-1;
			int c = scan.nextInt();
			for(int j=a;j<=b;j++) {
				bas[j]=c;
			}
		}
		for(int i=0;i<bas.length;i++) {
			System.out.print(bas[i]+" ");
		}
		scan.close();
	}
}