import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(); //
        int n = scan.nextInt();
        int sum = 0; // 소수의 합
        int minPrime = 10001;
       

        for (int i = m; i <=n; i++) {//m부터 n까지의 숫자중에 
        	if (isPrime(i)) { // 소수인지 확인
        		sum+=i;//합한다
        		if(i<minPrime) {
        			minPrime=i;
        		}
        	}
        }
        if(sum==0) {
        	System.out.println(-1);
        }else {
        	 System.out.println(sum);
        	 System.out.println(minPrime);
        }
       
        scan.close();
    }

    // 소수인지 판별하는 함수
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 1 이하의 숫자는 소수가 아님
        }
        for (int i = 2; i * i <= n; i++) { // 2부터 n의 제곱근까지 확인
            if (n % i == 0) {
                return false; // 나누어 떨어지면 소수가 아님
            }
        }
        return true; // 소수일 경우 true 반환
    }
}