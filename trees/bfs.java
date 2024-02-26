/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class bfs {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> answer = new LinkedList<>();

        if (root == null) {
            return answer;
        }

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelsize = queue.size();
            List<Integer> subans = new LinkedList<>();
            for (int i = 0; i < levelsize; i++) {
                if (queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }
                subans.add(queue.remove().val);
            }

            answer.add(subans);
        }

        return answer;

    }
}