import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       for(int i=0;i<n;i++) {
    	   for (int k = n-i-1; k>0; k--) {
               System.out.print(" ");
           }
    	   for(int j=0;j<=i;j++) {
    		   System.out.printf("*");
    	   }
    	   for (int y=0; y<i; y++) {
               System.out.print("*");
           }
    	   System.out.println();  
       }
       
       
        scan.close();  
    }  
}