public class sumLeaf {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        calSum(root, "");
        return sum;
    }

    public void calSum(TreeNode node, String path) {
        if (node == null)
            return;
        if (node.left == null && node.right == null)
            sum += Integer.parseInt(path + node.val, 2);

        calSum(node.left, path + node.val);
        calSum(node.right, path + node.val);
    }
}