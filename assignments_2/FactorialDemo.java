package assignments_2;

public class FactorialDemo {
//	public static void main(String[] args) {
//		FactorialDemo fd=new FactorialDemo();
//		int result =fd.calcfactorial(5);
//		System.out.println(result);
//	}
	public   int calcfactorial(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		int fact_nm1=calcfactorial(n-1);
		int fact_n=n*fact_nm1;
		
		return fact_n;
	}
}
