import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	 Scanner scan = new Scanner(System.in);
         int sum =0;
         int n =scan.nextInt();
         for(int i=0;i<n;i++) {
        	 int a=scan.nextInt();
        	 for(int j=0;j<a;j++) {
        		 int b=scan.nextInt();
        		 sum+=b;
        	 }
        	 System.out.println(sum);
        	 sum=0;
         }
        
         scan.close();
     }
 }