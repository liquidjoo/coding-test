package slipp.week12;

import java.util.*;
import java.util.stream.Collectors;

public class PathSum2 {
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

    private Set<List<Integer>> result;
    private List<Integer> path;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        if (Objects.isNull(root)) {
            return new ArrayList<>();
        }

        result = new HashSet<>();
        path = new ArrayList<>();
        dfs(root, sum);
        return new ArrayList<>(result);
    }

    private void dfs(TreeNode node, int sum) {
        if (Objects.isNull(node)) {
            final int value = path.stream().mapToInt(Integer::intValue)
                    .sum();
            if (value == sum) {
                result.add(new ArrayList<>(path));
                return;
            }
            return;
        }
        path.add(node.val);
        dfs(node.left, sum);

        dfs(node.right, sum);
        path.remove(path.size() - 1);
    }

    public void test() {
//        TreeNode treeNode = new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, new TreeNode(5), new TreeNode(1))));
//        pathSum(treeNode, 22);

        TreeNode treeNode = new TreeNode();
        final List<List<Integer>> pathSum = pathSum(null, 0);
        System.out.println(pathSum);
    }


}
