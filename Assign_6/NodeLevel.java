package assignments;
public class NodeLevel {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    public static int getNodeLevel(TreeNode root, int val, int level) {
        if (root == null) return 0;
        if (root.val == val) return level;
        
        if (val < root.val) {
            return getNodeLevel(root.left, val, level + 1);
        }
        return getNodeLevel(root.right, val, level + 1);
    }

    // Helper method just to build tree for testing
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insert(root.left, val);
        else if (val > root.val) root.right = insert(root.right, val);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = null;
        int[] values = {50, 30, 20, 40, 70, 60, 80};
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Level of 60 is: " + getNodeLevel(root, 60, 1));
        System.out.println("Level of 20 is: " + getNodeLevel(root, 20, 1));
        System.out.println("Level of 100 (not present): " + getNodeLevel(root, 100, 1));
    }
}