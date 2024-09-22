import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	int[] a = {1, 1, 2, 2, 2, 8};
	int[] b = new int[6];
	for(int i=0;i<6;i++) {
		b[i] = scan.nextInt();
	}
	for(int i=0;i<6;i++) {
		System.out.printf(a[i]-b[i] + " ");
	}
	scan.close();		
	}
}