import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int n =scan.nextInt();
    	for(int i=0;i<n;i++) {
    		for(int j=n-i-1;j>0;j--) {
    			System.out.print(" ");
    		}
    		System.out.print("*");
    		for(int k=0;k<i;k++) {
    			System.out.print(" ");
    		}
    		for(int z =1;z<i;z++) {
    			System.out.print(" ");
    		}
    		if(i!=0) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	
    	
    	scan.close();
    }
}