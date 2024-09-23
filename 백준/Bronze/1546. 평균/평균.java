import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double n = scan.nextInt();//과목의 개수
		double m = 0;//최댓값
		double sum=0;
		
		for(int i=0;i<n;i++) {
			double score = scan.nextInt();
			sum+=score;
			if(score>m) {
				m=score;
			}
		}
		double result = (sum/m)*100/n;
		System.out.println(result);
		
		scan.close();

	}
}