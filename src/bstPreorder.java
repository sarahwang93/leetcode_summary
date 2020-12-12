public class bstPreorder {
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


    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        Stack<TreeNode> nodestack = new Stack<TreeNode>();
        nodestack.push(root);

        if(preorder.length == 1){
            return root;
        }

        if(preorder.length == 0){
            return null;
        }

        for(int i=1; i<preorder.length;i++){
            TreeNode curr = new TreeNode(preorder[i]);
            TreeNode top = nodestack.peek();

            while(!nodestack.isEmpty() && nodestack.peek().val < preorder[i]){
                top = nodestack.pop();
            }


            if(top.val > preorder[i]){
                top.left = curr;
            }else{
                top.right = curr;
            }

            nodestack.push(curr);

        }

        return root;
    }

}