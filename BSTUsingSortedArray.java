import java.util.ArrayList;

public class BSTUsingSortedArray {
	
	public static Node createBST(ArrayList<Integer> abc, int start, int end) {
		
		if(start>end)
			return null;
		int mid = (start+end)/2;
		Node newNode = new Node(abc.get(mid));
		// keep in mind the end here becomes mid-1
		newNode.left = createBST(abc,start,mid-1);
		// keep in mind the start becomes here mid+1
		newNode.right = createBST(abc,mid+1,end);
		return newNode;
	}

	/** 
	 * Not needed function
	 * @param root
	 */
	public static void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.getData()+" ");
			inOrder(root.right);
		}
	}
	
	/**
	 * Not needed function
	 * @param root
	 * @return
	 */
	public static int get_height(Node root) {
		if(root==null)
			return 0;
		return 1+ Math.max(get_height(root.left), get_height(root.right));
	}
	
	
	public static void main(String[] args) {
		// remember input is sorted
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
		
		// keep in mind what are you passing as end here, it should be size-1
		Node root = createBST(input,0,11);
		inOrder(root);
		System.out.println();
		System.out.println("The height is the BST is "+get_height(root));
	}

}
