
public class IsBalenced {
	
	public static boolean isBalanced(BT tree) {
		Node root = tree.getRoot();
		if(tree.get_max_height(root)- tree.get_min_height(root)<=1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		BT tree = new BT();
		tree.insert(10);
		tree.insert(30);
		tree.insert(6);
//		tree.insert(34);
//		tree.insert(10);
//		tree.insert(5);
//		tree.insert(2);
//		tree.insert(24);
//		tree.insert(1);
		
		tree.inOrder();
		
		System.out.println(isBalanced(tree));

	}

}
