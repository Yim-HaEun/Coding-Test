import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] sc = new Integer[4];
        int max = 0;
        int sum = 0;
        for(int i=0;i<4;i++) {
        	sc[i] = scan.nextInt();
        }
        int e = scan.nextInt();
        int f = scan.nextInt();
        if(e>=f) {
        	max = e;
        }else {
        	max = f;
        }
        	
        Arrays.sort(sc,Collections.reverseOrder());    
        
        for(int i=0;i<3; i++) {
        	sum+=sc[i];
        }
        System.out.println(sum+max);
    }
}