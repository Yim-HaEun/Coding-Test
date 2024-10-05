import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	 Scanner scan = new Scanner(System.in);
         int n =scan.nextInt();
         for(int i=0;i<n;i++) {
        	 int car = scan.nextInt();//자동차 가격
        	 int op = scan.nextInt();//옵션
        	 int option =0;
        	 for(int j=0;j<op;j++) {
        		 int q = scan.nextInt(); //옵션갯수
        		 int p =scan.nextInt(); //옵션가격
        		 option+=(q*p);
        	 }
        	 System.out.println(car+option);
        	 option=0;
         }
         
        
         scan.close();
     }
 }