import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        int[] num = new int[n];
        for(int i=0;i<n;i++) {
        	num[i]=scan.nextInt();
        }
        Arrays.sort(num);
        for(int i=0;i<n;i++) {
        	System.out.println(num[i]);
        }
       
        scan.close();
    }
}