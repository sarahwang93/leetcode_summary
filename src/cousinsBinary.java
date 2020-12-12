import java.util.HashMap;
import java.util.Map;

public class cousinsBinary {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    public boolean isCousins(TreeNode root, int x, int y) {
        Map<Integer, int[]> map = new HashMap<>();
        dfs(root, 0, 0, x, y, map);
        return map.get(x)[0] == map.get(y)[0] && map.get(x)[1] != map.get(y)[1]; // same level and different parents.
    }
    private void dfs(TreeNode n, int level, int parent, int x, int y, Map<Integer, int[]> map) {
        if (n == null) { // base case.
            return;
        }
        if (n.val == x || n.val == y) {
            map.put(n.val, new int[]{ level, parent }); // put corresponding level and parent into map.
        }
        dfs(n.left, level + 1, n.val, x, y, map); // recurs to left branch.
        dfs(n.right, level + 1, n.val, x, y, map); // recurs to right branch.
    }

}
