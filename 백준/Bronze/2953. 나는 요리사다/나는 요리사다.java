import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[5][4];  // 5행 4열 배열 선언

        // 2차원 배열 입력받기 (5행 4열)
        for (int i = 0; i < 5; i++) {   // 행: 5개
            for (int j = 0; j < 4; j++) {   // 열: 4개
                arr[i][j] = scan.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;  // 최댓값을 저장할 변수
        int cook = 0;  // 최댓값을 가진 행의 인덱스

        // 각 행의 합을 구하고 최댓값을 가진 행을 찾기
        for (int i = 0; i < 5; i++) {   // 행: 5개
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {   // 열: 4개
                rowSum += arr[i][j];  // 행의 합 계산
            }

            // 현재 행의 합이 이전 최댓값보다 크면 갱신
            if (rowSum > max) {
                max = rowSum;  // 최댓값 갱신
                cook = i;      // 최댓값을 가진 행의 인덱스 갱신
            }
        }

        System.out.printf("%d %d", cook + 1, max);  // 1-based index로 출력
        scan.close();
    }
}