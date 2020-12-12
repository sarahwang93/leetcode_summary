import com.sun.source.tree.Tree;

public class deepestLeaves {
    int maxDepth = -1;
    TreeNode res = null;

    public TreeNode lcaDeepestLeaves(TreeNode root){
        dfs(root, 0);
        return res;
    }

    public int dfs(TreeNode root, int depth){
        if(root == null){
            maxDepth = 0;
        }else if(root.left!=null && root.right!=null){
            if(depth>maxDepth) {
                maxDepth = depth;
                res = root;
            }
            return depth;
        }

        int depthl = dfs(root.left, depth+1);
        int depthr = dfs(root.right, depth+1);

        //find the same level node with the depest number
        if(depthl == depthr && maxDepth == depthl){
            res = root;
        }

        return Math.max(depthl, depthr);
    }
}
