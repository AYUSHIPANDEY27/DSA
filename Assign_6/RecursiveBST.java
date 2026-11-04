package assignments;

public class RecursiveBST {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int val) { this.val = val; }
    }

    
    public static TreeNode insertRecursive(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertRecursive(root.left, val);
        } else if (val > root.val) {
            root.right = insertRecursive(root.right, val);
        }
        return root;
    }

    
    public static TreeNode searchRecursive(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (val < root.val) {
            return searchRecursive(root.left, val);
        }
        return searchRecursive(root.right, val);
    }

    
    public static void printInorder(TreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.val + " ");
            printInorder(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = null;
        int[] values = {50, 30, 20, 40, 70, 60, 80};
        
        System.out.println("Adding nodes recursively...");
        for (int val : values) {
            root = insertRecursive(root, val);
        }
        
        System.out.print("Tree Contents (Inorder): ");
        printInorder(root);
        System.out.println();

        System.out.println("\nSearching recursively...");
        TreeNode found = searchRecursive(root, 40);
        System.out.println("Search 40: " + (found != null ? "Found node with value " + found.val : "Not Found"));

        TreeNode notFound = searchRecursive(root, 100);
        System.out.println("Search 100: " + (notFound != null ? "Found node with value " + notFound.val : "Not Found"));
    }
}
