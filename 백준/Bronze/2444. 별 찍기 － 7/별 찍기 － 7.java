import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // 위쪽 삼각형 (상단 피라미드)
        for (int i = 0; i < n; i++) {
            // 공백 출력
            for (int k = n - i - 1; k > 0; k--) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽 삼각형 (하단 피라미드)
        for (int i = n - 2; i >= 0; i--) {
            // 공백 출력
            for (int k = n - i - 1; k > 0; k--) {
                System.out.print(" ");
            }
            // 별 출력
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scan.close();
    }
}