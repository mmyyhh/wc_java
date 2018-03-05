
public class Calculator {
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public int fac (int n) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		if(n<=1) return 1;
		return n * fac(n-1);
	}
}
