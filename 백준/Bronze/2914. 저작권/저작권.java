import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int a =scan.nextInt(); //곡
    	int b = scan.nextInt(); //평균
    	System.out.println(a*b-(a-1));
    }
}