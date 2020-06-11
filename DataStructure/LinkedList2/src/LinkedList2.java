import javax.xml.transform.Templates;

public class LinkedList2 {

	static Boggy engine = null;

	static class Boggy {
		String BoggyNo;
		String BoggyType;
		Boggy hook = null;

		public Boggy(String BoggyNo, String BoggyType) {
			this.BoggyNo = BoggyNo;
			this.BoggyType = BoggyType;
		}

		public Boggy() {
			System.err.println("Train Connectivity As LinkedList");
		}
	}

	static void insert(String no, String type) {

		Boggy boggy = new Boggy(no, type);
		boggy.hook = engine;
		engine = boggy;

	}
	
	static Boggy reverse()
	{
		Boggy current = engine;
		
		Boggy next=null;
		Boggy prev = null;
		
		while (current!= null) {
			
			//temp = i;
			//i=j;
			//j=temp;
			
			/*next = current.hook;
			current.hook=prev;
			prev=next.hook;
			current=prev;*/
			
			
			
			current=current.hook;	
		}
		return current;
	}

	void printReverse(Boggy head) 
    { 
        if (head == null) return; 
  
        
       // System.err.println("Boggy:" + head.BoggyNo + " & Bogytype:" + head.BoggyType+ "       head = " +head.hashCode());
        //System.err.println("x");
        // print list of head node 
        printReverse(head.hook); 
        
        
  
        // After everything else is printed 
        //System.err.println("y");
        System.err.println("Boggy:" + head.BoggyNo + " & Bogytype:" + head.BoggyType+ "       head = " +head.hashCode()); 
    } 
	
	static void printBoggyDetail(Boggy engine) {
		Boggy TT = engine;

		while (TT != null) {
			System.err.println("Boggy:" + TT.BoggyNo + " & Bogytype:" + TT.BoggyType +"      head = " +TT.hashCode()); 
			TT = TT.hook;
		}
	}

	public static void main(String[] args) {

		LinkedList2 linkedList2 = new LinkedList2();
		
		insert("S3 ", "Sleeper");
		insert("S1 ", "1st AC");
		insert("S2 ", "2nd AC");
		insert("S8 ", "3rd AC");
		insert("S9 ", "Sitting");
		insert("S12", "Cheercar");
		printBoggyDetail(engine);
		System.err.println("--------------------------------------");
		//Boggy  boggy = reverse();
		//printBoggyDetail(boggy);
		linkedList2.printReverse(linkedList2.engine);

	}
}