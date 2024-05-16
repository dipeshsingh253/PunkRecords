package Trees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode createTreeFromArray(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < values.length) {
            TreeNode current = queue.poll();

            if (i < values.length) {
                current.left = new TreeNode(values[i++]);
                queue.add(current.left);
            }

            if (i < values.length) {
                current.right = new TreeNode(values[i++]);
                queue.add(current.right);
            }
        }

        return root;
    }

    public static void printTree(TreeNode node) {
        if (node != null) {
            System.out.println(node.val);
            printTree(node.left);
            printTree(node.right);
        }
    }
}

public class BasicsOfTree {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root = TreeNode.createTreeFromArray(values);
        TreeNode.printTree(root);
    }
}
