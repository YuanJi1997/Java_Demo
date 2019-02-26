import java.util.Random;
public class CallName{
	public static void main(String[] args){
		System.out.println("This is a lottery:");
		String[] names = {"Mr.Jhonson","Mr.Fux","Mr.Tom","Mr.Comey","Mr.Hunt","Mr.Jerry","Ms.Alice","Ms.Andy","Ms.Marry","Ms.Soufe","Ms.Anna","Ms.Angerla","You're very luckly!"};
		Random r = new Random();
		int Index = r.nextInt(13);
		System.out.println(names[Index]);
	}
}