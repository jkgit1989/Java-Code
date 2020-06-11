import java.util.Scanner;

public class CodeBaseInspect {
	
	private static int[] array = {1,3,4,5,7,8,9,1,3,4,5,7,8,9,1,3,4,5,7,8,9,1,3,4,5,7,8,9,7,9};
	
	static int count;
	
public static void main(String[] args) {
	System.err.println("Enter how many digits combination you want to create:");
	Scanner scanner =  new Scanner(System.in);
	int combinations = scanner.nextInt();
	
	
	for (int i = 0; i < array.length && count < combinations; i++) {
		
		if (count++ < combinations) {
			System.err.print(array[i] +" ");
		}
		if(count == combinations){
			count=0;
			System.err.println();
		}
		
	}
}
}
