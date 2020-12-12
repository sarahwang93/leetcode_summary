import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inorderTra {


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


    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode node = root;
        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        while(node!=null){
            stack.push(node);
            node = node.left;
        }

        while(!stack.isEmpty()){
            node = stack.pop();
            list.add(node.val);

            TreeNode tmp = node.right;
            while(tmp!=null){
                stack.push(tmp);
                tmp = tmp.left;
            }
        }

        return list;
    }
}
