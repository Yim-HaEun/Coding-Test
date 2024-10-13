import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        int count=0;
        int[] num=new int[n];
        for(int i=0;i<n;i++) {
        	num[i] = scan.nextInt();
        }
        for(int i=0;i<n;i++) {
        	 if(isPrime(num[i])) {
        		 count++;
        	 }
        	 
        }
        System.out.println(count);
        scan.close();

    }
    public static boolean isPrime(int n) {//소수인지 판별하는 함수
    	if(n<=1) {
    		return false;//소수X
    	}for(int i=2;i*i<=n;i++) {//2부터 n의 제곱근까지 확인(약수의 대칭성때문에 더 효율적인 방법이다.)
    		if(n%i==0) {
    			return false; // 나누어떨어지면 소수가 아님
    		}
    	}return true;
    }
}