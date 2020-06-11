class Node {

	String Brand;
	int cost;
	Node firstNode = null;
	Node next = null;

	public Node() {
		System.err.println("             Linked List Implimentation");
	}

	public Node(String brand, int cost) {
		this.Brand = brand;
		this.cost = cost;
	}

	public void insert(String brand, int cost) {

		Node newNode = new Node(brand, cost);

		newNode.next = firstNode;
		firstNode = newNode;

	}

	public boolean isEMpty() {
		if (firstNode == null) {
			return true;
		} else {
			return false;
		}
	}

	public void print() {

		Node tmp = firstNode;

		while (tmp != null) {
			System.err.println("Brand:=" + tmp.Brand + "                Ex-Showroom Price:=" + tmp.cost);
			tmp = tmp.next;
		}

	}

	public void removeRecord(String record) {
		Node forward = null;
		Node backward = null;
		Node tmp = firstNode;

		while (tmp != null) {

			if (tmp.Brand == record) {

				backward.next = forward.next;

				break;
			}
			backward = tmp;
			tmp = tmp.next;
			forward = tmp;

		}

	}

}

public class TestLink {

	public static void main(String[] args) throws InterruptedException {

		Node node = new Node();

		// System.err.println("Is LinkedList Empty : "+node.isEMpty());

		node.insert("Dell", 30000);
		node.insert("Microsoft", 43000);
		node.insert("CA Tech", 12333);
		node.insert("IBM", 67888);
		node.insert("Apple", 890000);

		node.print();

		System.err.println("\n\n\n\n\n                  After removing record");
		node.removeRecord("IBM");
		node.removeRecord("Dell");
		//node.removeRecord("Apple");
		node.print();
		// System.err.println("Is LinkedList Empty : "+node.isEMpty());

	}
}
