
public class ROtation {
public static void main(String[] args) {
	
	
	int a[]= {1,2,3,4,5,6,7,8,9};

	int numberOfRotataions = 3;
	
	int temp;
	int len=a.length;
	
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	
	while(numberOfRotataions-- > 0)
	{
		temp=a[0];
		
		for (int i = 0; i <len-1 ; i++) {			
			
			a[i]=a[i+1];
		
	}
		a[len-1]=temp;
	
	}
	
	System.out.println("\n");
	
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	
}
}
