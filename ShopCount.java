public class ShopCount{
	public static void main(String[] args){
		System.out.println("------------------Shop-Count---------------------");
		System.out.println("Class       Size   Price   Totalcount");
		String ac = "Thinkpad";
		double as = 13.5;
		double ap = 5500.5;
		int at = 6;
		System.out.println(ac+"    "+as+"   "+ap+"      "+at);
		System.out.println("-------------------------------------------------");
		double tp = at*ap;
		System.out.println("Total Price is "+tp);
		System.out.println("Total Count is "+at);
	}
}