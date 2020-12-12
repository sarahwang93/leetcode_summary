public class countTreenode {
    public int countNodes(TreeNode root) {
        TreeNode node = root;

        if(node == null){
            return 0;
        }

        if(node.left == null && node.right == null){
            return 1;
        }


        int left = leftDepth(root);
        int right = rightDepth(root);

        if(left == right){
            //if it is a complete binary tree
            return (2 << (left-1))-1;
        }else{
            //if it is not a complete binary tree
            return 1 + countNodes(root.left) + countNodes(root.right);
        }

    }

    private int leftDepth(TreeNode root){
        int height = 1;
        while(root.left!=null){
            height ++;
            root = root.left;
        }
        System.out.println("left height" + height);
        return height;
    }

    private int rightDepth(TreeNode root){
        int height = 1;
        while(root.right!=null){
            height ++;
            root = root.right;
        }

        System.out.println("right height" + height);
        return height;
    }
}
