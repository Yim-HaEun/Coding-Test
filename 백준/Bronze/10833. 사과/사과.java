import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	 Scanner scan = new Scanner(System.in);
         int remain =0;
         int n =scan.nextInt();
         for(int i=0;i<n;i++) {
        	 int a = scan.nextInt();
        	 int b=scan.nextInt();
        	 remain+=b%a;
        	 
         }
         System.out.println(remain);
         scan.close();
     }
 }