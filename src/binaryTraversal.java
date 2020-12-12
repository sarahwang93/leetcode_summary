import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class binaryTraversal {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> level = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null){
            return level;
        }
        TreeNode node = root;
        q.add(root);

        while(q.size()>0){
            List<Integer> nextlevel = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode single = q.poll();
                nextlevel.add(single.val);
                if(single.left!=null){
                    q.add(single.left);
                }

                if(single.right!=null){
                    q.add(single.right);
                }
            }
            level.add(0, nextlevel);
        }
        return level;
    }
}