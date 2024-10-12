import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[3];
       for(int i=0;i<3;i++) {
    	   num[i] =scan.nextInt();
       }
        Arrays.sort(num);
        String abc = scan.next();
        char[] ch=abc.toCharArray();
        for(char c:ch) {
        	if(c=='A') {
        		System.out.printf("%d ",num[0]);
        	}else if(c=='B') {
        		System.out.printf("%d ",num[1]);
        	}else {
        		System.out.printf("%d ",num[2]);
        	}
        }
        scan.close();
    }
}