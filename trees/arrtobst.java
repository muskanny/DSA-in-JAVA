
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

class arrtobst {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int n = nums.length;
        TreeNode ans;
        ans = bst(nums, 0, n - 1);
        return ans;
    }

    TreeNode bst(int[] nums, int i, int j) {
        if (i > j) {
            return null;
        }
        int mid = i + (j - i) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = bst(nums, i, mid - 1);
        node.right = bst(nums, mid + 1, j);
        return node;
    }
}