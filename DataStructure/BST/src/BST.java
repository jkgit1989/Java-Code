import java.awt.print.Printable;
import java.security.cert.TrustAnchor;
import java.util.prefs.BackingStoreException;

class Node {

	int data;
	Node left;
	Node right;

	public Node(int d) {
		this.data = d;
		this.left = null;
		this.right = null;
	}
}

public class BST {

	boolean found = false;
	Node root = null;
	Node temp = null;
	Node parent = null;

	public void insert(int key) {

		Node boggy = new Node(key);

		if (root == null) {
			root = boggy;

		} else {

			// future traversal
			temp = root;

			while (true) {

				/*
				 * copy of temp so we can traverse with once pointer and can
				 * update other one
				 */
				parent = temp;

				if (key < temp.data) {

					temp = temp.left;

					if (temp == null) {

						parent.left = boggy;
						return;
					}
				}

				else {
					temp = temp.right;

					if (temp == null) {
						parent.right = boggy;
						return;
					}
				}

			}
		}

	}

	public void INprint(Node root) {

		if (root != null) {

			// Traverse the left node

			INprint(root.left);

			// Visit the currently focused on node

			System.out.print("" + root.data + "-");

			// Traverse the right node

			INprint(root.right);
		}
	}

	public void Postprint(Node root) {

		if (root != null) {

			// Traverse the left node
			Postprint(root.left);

			// Traverse the right node
			Postprint(root.right);

			// Visit the currently focused on node
			System.out.print(root.data + "-");
		}
	}

	public void Preprint(Node root) {

		if (root != null) {

			// Visit the currently focused on node
			System.out.print(root.data + "-");

			// Traverse the left node
			Preprint(root.left);

			// Traverse the right node
			Preprint(root.right);
		}

	}

	public boolean find(Node root, int key) {

		if (root != null) {
			if (root.data == key) {
				found = true;
				return found;
			}
			find(root.left, key);
			find(root.right, key);
		}

		return false;
	}

	public static void main(String[] args) throws InterruptedException {

		BST bst = new BST();

		bst.insert(142);
		bst.insert(45);
		bst.insert(43);
		bst.insert(654);
		bst.insert(78);
		bst.insert(89);
		bst.insert(233);

		bst.INprint(bst.root);
		System.err.println();
		bst.Preprint(bst.root);
		System.err.println();
		bst.Postprint(bst.root);

		System.err.println("Is data present in tree: " + bst.find(bst.root, 43));

	}

}
