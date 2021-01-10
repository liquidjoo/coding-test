package slipp.eighth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MinimumDistanceBetween {
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
    public TreeNode init() {
        TreeNode treeNode = new TreeNode(27);
        treeNode.left = null;
        treeNode.right = new TreeNode(34);

        TreeNode t1 = treeNode.right;
        t1.left = null;
        t1.right = new TreeNode(58);

        TreeNode t2 = t1.right;
        t2.left = new TreeNode(50);
        t2.right = null;

        TreeNode t3 = t2.left;
        t3.left = new TreeNode(44);
        t3.right = null;

        return treeNode;
    }

    private List<Integer> path = new ArrayList<>();
    private List<List<Integer>> result = new ArrayList<>();
    public int minDiffInBST(TreeNode root) {

        calculate(init());


        int min = Integer.MAX_VALUE;

        for (final List<Integer> list : result) {
            System.out.println(Arrays.toString(list.toArray()));
            for (int i = 1; i < list.size(); i++) {
                int value = Math.abs(list.get(i - 1) - list.get(i));
                if (value < min) {
                    min = value;
                }
            }
        }

        return min;
    }

    private void calculate(TreeNode node) {
        if (node != null) {
            path.add(node.val);
            if (Objects.isNull(node.left) && Objects.isNull(node.right)) {
                result.add(new ArrayList<>(path));
                return;
            }

            calculate(node.left);
            calculate(node.right);
            path.remove(path.size() - 1);
        } else {
            path.add(0);
        }
    }
}
