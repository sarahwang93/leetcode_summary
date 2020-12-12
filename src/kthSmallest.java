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
public class kthSmallest {
    public int kthSmallest(TreeNode root, int k) {
        int tmp = k;
        if(root == null){
            return 0;
        }

        if(root.left == null & root.right == null){
            return root.val;
        }

        Stack<TreeNode> liststack = new Stack<TreeNode>();
        TreeNode node = root;
        liststack.push(root);

        while(!liststack.isEmpty()){
            while(node != null && node.left != null){
                node = node.left;
                liststack.add(node);
            }

            node = liststack.pop();
            k--;
            if(k==0){
                return node.val;
            }

            node = node.right;
            if(node != null){
                liststack.push(node);
            }
        }

        return -1;
    }
}
