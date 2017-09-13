import java.util.ArrayList;
import java.util.LinkedList;

public class DLinkedLists {
	
	public static ArrayList<LinkedList<Node>> getDLinkedLists(Node root) {
		
		ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
		LinkedList<Node> current = new LinkedList<Node>();
		if(root!=null) {
			current.add(root);
		}

		while(current.size()!=0) {
			lists.add(current);
			LinkedList<Node> parent = current;
			current = new LinkedList<Node>();
			
			for(int i=0;i<parent.size();i++) {
				Node abc = parent.get(i);
				
				if(abc.left!=null) {
					current.add(abc.left);
				}
				
				if(abc.right!=null) {
					current.add(abc.right);
				}
			}
		}
		return lists;
		
	}

	public static void main(String[] args) {
		// Create a manual tree
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
		System.out.println("The height is the BST is "+BSTUsingSortedArray.get_height(root));
		
		ArrayList<LinkedList<Node>> result = getDLinkedLists(root);
		for(int i=0;i<result.size();i++) {
			for(int j=0;j<result.get(i).size();j++) {
				System.out.print(result.get(i).get(j).getData()+" ");
			}
			System.out.println();
		}

	}

}
