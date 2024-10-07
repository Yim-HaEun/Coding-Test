import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        	int a =scan.nextInt();//x 1L당 요금
        	int b =scan.nextInt();//y 기본요금
        	int c = scan.nextInt();// y 상한 L
        	int d = scan.nextInt();//y 1L당추가요금 
        	int p = scan.nextInt();//한달간 수도 L
        	int A = a*p;
        	int B =0;
        	if(c>p) {
        		B=b;
        	}else {
        		B=(p-c)*d+b;
        	}
        	
        	if(A>B) {
        		System.out.println(B);
        	}else{
        		System.out.println(A);
        	}
        
        scan.close();
    }
}