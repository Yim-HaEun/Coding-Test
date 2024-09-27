import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=0;
        String jinho = scan.nextLine();
        int n= scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++) {
        	String mbti = scan.nextLine();
        	if(mbti.equals(jinho)) {
        		count++;
        	}
        }
        System.out.println(count);
        scan.close();  
    }  
}