import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	 Scanner scan = new Scanner(System.in);
         int n =scan.nextInt();
         int cy = 100;
         int sd = 100;
         for(int i=0;i<n;i++) {//라운드
	         int a =scan.nextInt();
	         int b =scan.nextInt();
	         if(a>b) {
	        	 sd-=a;
	         }else if(a<b) {
	        	 cy-=b;
	         }
         }
         System.out.println(cy);
         System.out.println(sd);
         scan.close();
     }
 }