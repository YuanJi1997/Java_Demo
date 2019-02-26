public class CompanyGroupSalesTotal{
	public static void main(String[] args){
	int[][] arr = { {11,12},{21,22,23},{31,32,33,34} };
	int sum = 0;
	int groupsum = 0;
	for(int i = 0;i<arr.length;i++){
		for(int j = 0;j<arr[i].length;j++){
			groupsum += arr[i][j];
		}
	sum += groupsum;
	System.out.println("Group "+(i+1)+" Sales is :"+groupsum);
	groupsum = 0;
	}
	System.out.println("Company Sales is :"+sum);
	}
}