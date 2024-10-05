import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	 Scanner scan = new Scanner(System.in);
         int n =scan.nextInt();
         int answer = 0;
         for(int i=0;i<n;i++) {//라운드
        	 int a =scan.nextInt();
        	 int b =scan.nextInt();
        	 answer=2-a+b;
        	 System.out.println(answer);
         }
         
         scan.close();
     }
 }