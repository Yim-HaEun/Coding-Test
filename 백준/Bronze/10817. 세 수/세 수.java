import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[3];
        num[0] = scan.nextInt();
        num[1] = scan.nextInt();
        num[2] = scan.nextInt();
        
        Arrays.sort(num);
        System.out.println(num[1]);
        scan.close();  
    }  
}
