
public class BT {
	
	private Node root;
	
	public void insert(int val) {
		root = insert(root,val);
	}
	
	public Node insert(Node node, int value) {
		if(node == null) {
			Node abc = new Node(value);
			node = abc;
		}
		else if( node.left==null) {
			node.left = insert(node.left,value);
		}
		else {
			node.right = insert(node.right, value);
		}
		return node;
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	public void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.println(root.getData());
			inOrder(root.right);
		}
			
	}
	
	public Node getRoot() {
		return root;
	}
	
	public int get_min_height(Node root) {
		if(root==null)
			return 0;
		return 1+ Math.min(get_min_height(root.left), get_min_height(root.right));
	}
	
	public int get_max_height(Node root) {
		if(root==null)
			return 0;
		return 1+ Math.max(get_max_height(root.left), get_max_height(root.right));
	}

}
