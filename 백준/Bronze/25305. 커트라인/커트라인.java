import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int k = scan.nextInt();
        Integer[] num = new Integer[n];
        for(int i=0;i<n;i++) {
        	num[i]=scan.nextInt();
        }
        Arrays.sort(num,Collections.reverseOrder());
       System.out.println(num[k-1]);
       
        scan.close();
    }
}