import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		int[][] c = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = scan.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				b[i][j] = scan.nextInt();
			}
		}for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.printf(c[i][j] + " ");
			}
			System.out.println("");
		}
		
		scan.close();
		}
}