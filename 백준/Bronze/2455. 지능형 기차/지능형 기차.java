import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int a1 = scan.nextInt();
        int b = scan.nextInt();
        int b1 = scan.nextInt();
        int c = scan.nextInt();
        int c1 = scan.nextInt();
        int d = scan.nextInt();
        int last = scan.nextInt();
        int train =a1;
        int max = a1;
        
        train = train-b+b1;
        
        if(max<train) {
        	max=train;
        }
        train=train-c+c1;
        
        if(max<train) {
        	max=train;
        }
        System.out.println(max);
        
        
        scan.close();
    }
}