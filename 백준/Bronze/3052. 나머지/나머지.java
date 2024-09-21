import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		int count =0;
		for(int i=0;i<10;i++) {
			int n = scan.nextInt();
			int num = n%42;
			if(set.contains(num)) {
				continue;
			}else {
				set.add(num);
				count++;
			}
		}
		System.out.println(count);
	
	}
}