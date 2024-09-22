import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine(); //개행문자 제거
		for(int i=0;i<n;i++) {
			String c = scan.nextLine();
			switch (c) {
			case "Algorithm" : 
				System.out.println("204"); 
				break;
			case "DataAnalysis": System.out.println("207");break;
			case "ArtificialIntelligence": System.out.println("302");break;
			case "CyberSecurity": System.out.println("B101");break;
			case "Startup": System.out.println("501");break;
			case "TestStrategy": System.out.println("105");break;
			case "Network": System.out.println("303");break;
			default : break;
			}
			
			
		}
		scan.close();
	}
}