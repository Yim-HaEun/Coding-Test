import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        String a = scan.nextLine();
        if(a.trim().isEmpty()) {
        	return;
        }
        String[] num = a.split(" ");
        for(String n:num) {
        	int StoI =Integer.parseInt(n);//String to Int
        	sum+=StoI; //더하기		
        }
        System.out.println(sum);
        scan.close();
    }
}