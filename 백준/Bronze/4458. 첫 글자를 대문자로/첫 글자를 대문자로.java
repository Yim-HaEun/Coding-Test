import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++) {
        	String input = scan.nextLine();
        	String upper = input.substring(0,1).toUpperCase()+input.substring(1);
        	System.out.println(upper);
        }
        scan.close();
    }
}