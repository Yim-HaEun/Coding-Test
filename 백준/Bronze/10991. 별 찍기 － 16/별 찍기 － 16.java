import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	for(int i=1;i<=n;i++) {//123
    		for(int j=i;j<n;j++) {
    			System.out.print(" ");
    		}for(int k=0;k<i;k++) {
    			System.out.print("* ");
    		}
    		System.out.println("");
    	}
    	scan.close();
    }
}