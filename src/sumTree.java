public class sumTree {
    //sum up all possibility
    public int sumNumbers(TreeNode root) {
        int total = 0;
        total = helper(root, total);
        return total;

    }

    public int helper(TreeNode root, int sum){
        if(root == null){
            return 0;
        }

        if(root.left== null && root.right == null){
            return sum += root.val;
        }

        //once level plus one, the all above level besides current level need multiple 10
        //for an example, 5 is root, 3 is left, when add one more 1; 53 becomes 530
        //root.left is current node
        return helper(root.left, (root.val+sum)*10) + helper(root.right,(root.val+sum)*10);
    }
}
