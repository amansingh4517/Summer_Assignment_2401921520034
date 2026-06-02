import java.util.ArrayList;
import java.util.List;

public class BinarySearchTreetoGreaterSumTree {

    private static  void inorder(TreeNode<Integer> root, List<TreeNode<Integer>> list) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            list.add(root);
            return;
        }
        inorder(root.left, list);
        list.add(root);
        inorder(root.right, list);
    }

    private static TreeNode<Integer> bstToGst(TreeNode<Integer> root) {
        if (root == null)
            return root;

        List<TreeNode<Integer>> list = new ArrayList<>();
        inorder(root, list);

        for (int i = list.size() - 2; i >= 0; i--) {
            list.get(i).val += list.get(i + 1).val;
        }

        return root;
    }

    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        Integer[] arr = { 5, 2, 3, 4, 6, 1, 7, 8 };
        TreeNode<Integer> root = tree.createBST(arr);
        System.out.println("before : ");
        tree.inorderPrint(root);
        System.out.println();
        bstToGst(root);
        System.out.println("after : ");
        tree.inorderPrint(root);
    }
}