import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String kda = scan.nextLine();
        String[] dari =kda.split("/");
        int[] k = new int[dari.length];
        for(int i=0;i<dari.length;i++) {
        	k[i]=Integer.parseInt(dari[i]);
        }
        if((k[0]+k[2])<k[1]||k[1]==0) {
        	System.out.println("hasu");
        }else if((k[0]+k[2])>=k[1]){
        	System.out.println("gosu");
        }
       	System.out.println();
        	
    }
}