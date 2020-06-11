public class Test {
int result=0;
	
	public int fact(int i)
	{
		if(i==1) return 1;
		else {
			result = i * fact(i-1);
			System.err.println(": "+i);
		}
		return result;
	}
	
	public static void main(String[] args) {
	
		
		Test test = new Test();
		
		int f = test.fact(5);
		System.err.println("::"+f);
		
		
}
}
