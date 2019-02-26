import java.util.Scanner;
import java.util.Random;
public class GuestNumber{
	public static void main(String[] args){
		System.out.println("please guest a number that range of 0 to 100");
		Random ran = new Random();
	    int i = ran.nextInt(100)+1;
		while(true){
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if(a<i){
				System.out.println("Too Small");
			}
			else if(a>i){
				System.out.println("Too Big");
			}
			else{
				System.out.println("Congratulation!");
				break;
			}
		}
	}
}