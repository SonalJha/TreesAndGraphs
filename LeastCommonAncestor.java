
public class LeastCommonAncestor {
	
	
	public static Node LeastCommonAncestor(Node root, Node p, Node q) {
		if(root==null)
			return null;
		if(root==p || root==q)
			return root;
		boolean is_p_on_the_left = covers(root.left,p);
		boolean is_q_on_the_left = covers(root.left,q);
		
		if(is_p_on_the_left != is_q_on_the_left) {
			// both nodes are on the opposite side and we are at the right place
			return root;
		}
		
		if(is_p_on_the_left == true) {
			return LeastCommonAncestor(root.left, p, q);
		}
		
		return LeastCommonAncestor(root.right,p,q);
		
	}

	/**
	 * Does this root covers the node p (is root the parent of p, not immediate parent, some kind of parent, maybe grand parent? 
	 * great great grandparent? some ancestor?
	 * @param node
	 * @param p
	 * @return
	 */
	private static boolean covers(Node node, Node p) {
		if(node == null)
			return false;
		if(node ==p )
			return true;
		return (covers(node.left,p)|| covers(node.right,p));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=null,p=null,q=null;
		if(!(covers(root,p) && covers(root,q))) {
			System.out.println("The is some error");
		}
		else {
			LeastCommonAncestor(root,p,q);
		}

	}

}
