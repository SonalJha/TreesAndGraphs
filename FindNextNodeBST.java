
public class FindNextNodeBST {
	
	public NodeWithParent findNextSuccessor(NodeWithParent n) {
		if(n==null)
			return null;
		if(n.right!=null) {
			// find the left most subtree of the right child
			return leftMostSubTree(n.right);
		}
		// move up till you are your parent's left child
		NodeWithParent parent = n.parent;
		NodeWithParent temp = n;
		while(parent!=null && parent.left!=temp) {
			temp = parent;
			parent= parent.parent;
		}
		return temp;
	}

	private NodeWithParent leftMostSubTree(NodeWithParent node) {
		// TODO Auto-generated method stub
		if(node==null)
			return null;
		while(node.left!=null){
			node = node.left;
		}
		return node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// need to create a tree with links to parents to check it

	}

}
