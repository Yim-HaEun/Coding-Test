import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	 Scanner scan = new Scanner(System.in);
         int train=0;
         int max = 0;
         
         for(int i=0;i<10;i++) {
        	 int Off = scan.nextInt();
        	 int On = scan.nextInt();
        	 train = train-Off+On;
        	 
        	 if(train>max) {
        		 max =train;
        	 }
         }
         System.out.println(max);
         scan.close();
     }
 }