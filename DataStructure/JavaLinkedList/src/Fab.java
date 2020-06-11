import java.math.*;


public class Fab {
    public static void main(String[] args) {
    	int n1=0,n2=1,n3=0;
    	
    	for (int i = 0; i < 10000; i++) {
			n3 = n1 +n2;
			n1=n2;
			n2=n3;
		System.err.print(n3+"-");
    	
    	}
    	
    }
}