import java.util.LinkedList;
import java.util.Queue;

public class widthBinarytree {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }

        //previous level
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int maxLength = 0;

        //BFS & DFS
        //use level to solve
        while(!queue.isEmpty()){
            //same level operation
            Queue<TreeNode> nextlevel = new LinkedList<>();
            int firstElement = queue.peek().val;
            int lastElement = firstElement;
            while(!queue.isEmpty()){
                TreeNode tmp = queue.remove();
                //construct a new tree with the id of node
                if(tmp.left!=null){
                    tmp.left.val = tmp.val * 2;
                    nextlevel.add(tmp.left);
                }
                if(tmp.right!=null){
                    tmp.right.val = tmp.val * 2 + 1;
                    nextlevel.add(tmp.right);
                }

                //same level
                if(queue.isEmpty())
                {
                    lastElement = tmp.val;
                }
            }

            if(lastElement - firstElement + 1 > maxLength){
                maxLength = lastElement - firstElement + 1;
            }
            //before this line is make sure in same level;
            queue = nextlevel;
        }


        return maxLength;
    }
}
