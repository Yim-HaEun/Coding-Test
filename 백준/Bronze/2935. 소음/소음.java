import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            // 첫 번째 정수 입력
            String num1 = scan.next();
            BigInteger a = new BigInteger(num1);

            // 개행 문자 제거
            scan.nextLine(); 

            // 연산자 입력
            String s = scan.nextLine();

            // 두 번째 정수 입력
            String num2 = scan.next();
            BigInteger b = new BigInteger(num2);

            // 연산자에 따라 연산 수행
            if (s.equals("*")) {
                System.out.println(a.multiply(b));  // 곱셈
            } else if (s.equals("+")) {
                System.out.println(a.add(b));  // 덧셈
            } else {
                System.out.println("Invalid operator");  // 잘못된 연산자 입력 시 처리
            
        }
        scan.close();
    }
}