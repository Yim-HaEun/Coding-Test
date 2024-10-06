import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++) {
        	int min = 100;
        	int sum=0;
        	for(int j=0;j<7;j++) {
        		int a =scan.nextInt();
        		if(a%2==0) {
        			sum+=a;
        			if(a<min) {
        				min=a;
        			}
        		}
        	}
        	System.out.printf("%d %d\n",sum,min);
        }
 
        scan.close();
    }
}