import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class cloneGraph {
    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    //DFS
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }

        Map<Node, Node> visited = new HashMap<>();
        return dfs(node, visited);
    }

    public Node dfs(Node node, Map<Node, Node> visited){
        if(visited.containsKey(node)){
            return visited.get(node);
        }

        //copy the node itself first
        //then add the neighbor of this node with creating new node data structure.
        Node copy = new Node(node.val, new ArrayList<>());
        visited.put(node,copy);

        for(Node neighbor: node.neighbors){
            copy.neighbors.add(dfs(neighbor, visited));
        }

        return copy;
    }
}
