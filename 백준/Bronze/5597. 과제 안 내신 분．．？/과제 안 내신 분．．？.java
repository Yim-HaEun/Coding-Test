import java.util.HashSet;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=1;i<=30;i++) {
			set.add(i);
			}

		for(int j=1;j<=28;j++) {
			int n = scan.nextInt();
			set.remove(n); //입력된 숫자들 제거
		}
		
		for(int m : set) { // 삭제되지않은 숫자만 뽑아서 제출
			System.out.println(m);
		}
		
		scan.close();
		}
}