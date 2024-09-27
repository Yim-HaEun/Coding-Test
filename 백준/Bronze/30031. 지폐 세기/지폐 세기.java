import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=0;
        int n= scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++) {
        	 int l = scan.nextInt();
             int h = scan.nextInt();
             switch(l) {
             case 136 : count+=1000;break;
             case 142 : count+=5000;break;
             case 148 : count+=10000;break;
             case 154 : count+=50000;break;
             }
        }
        System.out.println(count);
        scan.close();  
    }  
}
