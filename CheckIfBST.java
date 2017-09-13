import java.util.ArrayList;

public class CheckIfBST {
	
	public static boolean checkBST(Node root, int min, int max) {
		if(root==null)
			return true;
		
		if(root.getData()<=min || root.getData()>max)
			return false;
		
		// for the left node, max value is root's data, it shouldn't be greater than that
		boolean flag1 = checkBST(root.left, min, root.getData());
		// for the right node, min value is root's data, anything on right should be greater than that
		boolean flag2 = checkBST(root.right, root.getData(), max);
		
		if(flag1==false ||flag2==false) {
			return false;
		}
			
		return true;
		}
	
	public static boolean checkBST(Node root) {
		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		input.add(9);
		input.add(10);
		input.add(11);
		input.add(12);
		
		Node root = BSTUsingSortedArray.createBST(input,0,11);
		BSTUsingSortedArray.inOrder(root);
		System.out.println();
		System.out.println("The height is the BT is "+BSTUsingSortedArray.get_height(root));
		
		System.out.println("Is this BST? "+checkBST(root));
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		ArrayList<Integer> input2 = new ArrayList<Integer>();
		input2.add(11);
		input2.add(2);
		input2.add(3);
		input2.add(4);
		input2.add(5);
		input2.add(6);
		input2.add(7);
		input2.add(8);
		input2.add(9);
		input2.add(10);
		input2.add(11);
		input2.add(12);
		
		Node root2 = BSTUsingSortedArray.createBST(input2,0,11);
		BSTUsingSortedArray.inOrder(root2);
		System.out.println();
		System.out.println("The height is the BT is "+BSTUsingSortedArray.get_height(root2));
		
		System.out.println("Is this BST? "+checkBST(root2));
	}

}
