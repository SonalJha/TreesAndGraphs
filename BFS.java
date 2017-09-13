import java.util.ArrayList;
import java.util.LinkedList;

public class BFS {
	
	public enum State {
		unvisited,
		visiting,
		visited;
	}
	
	public boolean doesRouteExist(Graph g, GraphNode source, GraphNode dest) {
		
		// There is no implementation of Queue so we will do it using linkedlist
		// linked list has functions like removefirst and addlast
		LinkedList<GraphNode> Q = new LinkedList<GraphNode>();
		
		// mark all the nodes at state unvisited in the beginning
		ArrayList<GraphNode> l = g.getAllNodes();
		for(int i =0;i<l.size();i++) {
			l.get(i).state = State.unvisited;
		}
		
		source.state = State.visiting;
		Q.addLast(source);
		
		while(!Q.isEmpty()) {
			GraphNode n = Q.removeFirst();
			
			ArrayList<GraphNode> list = n.getAdjacent();
			for(int i =0; i<list.size();i++) {
				GraphNode abc = list.get(i);
				if(abc== dest) {
					return true;
				}
				// if the state is not unvisited, we have already visited it so no need to add to the queue
				if(abc.state ==State.unvisited) {
					// add to queue
					abc.state = State.visiting;
					Q.addLast(abc);
				}
			}
			n.state = State.visited;
		}
		// if after doing all that still we haven't found the dest we can say there is no path from source to dest
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
