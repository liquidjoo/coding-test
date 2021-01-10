package slipp.etc1;

import java.util.Objects;

public class SymmetricTree {

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

    public void test() {
        TreeNode root =  new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = null;
        root.left.right = new TreeNode(3);

        root.right.right = new TreeNode(3);
        root.right.left = null;


        System.out.println(isSymmetric(root));
    }

    public boolean isSymmetric(TreeNode root) {
        return recursive(root, root);
    }

    private boolean recursive(TreeNode left, TreeNode right) {

        if (Objects.isNull(left) && Objects.isNull(right)) {
            return true;
        }

        if (Objects.isNull(left) || Objects.isNull(right)) {
            return false;
        }

        if (left.val == right.val) {
            return recursive(left.right, right.left) && recursive(left.left, right.right);
        }
        return false;
    }
}
