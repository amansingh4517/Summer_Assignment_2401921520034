public class BST<T extends Comparable<T>> {
    TreeNode<T> root;

    private TreeNode<T> insert(TreeNode<T> node, T value) {
        if (node == null)
            return new TreeNode<T>(value);

        int comparison = value.compareTo(node.val);

        if (comparison < 0)
            node.left = insert(node.left, value);
        else
            node.right = insert(node.right, value);
        return node;
    }

    public TreeNode<T> createBST(T[] arr) {
        this.root = null;
        for (T val : arr) {
             this.root = insert(this.root, val);
        }
        return this.root;
    }

    public void insert(T value) {
        this.root = insert(this.root, value);
    }


    public void inorderPrint(TreeNode<T> root){
        if(root == null) return ;
        if(root.left == null && root.right == null) {
            System.out.print(root.val +" ");
            return;
        }
        inorderPrint(root.left);
        System.out.print(root.val + " ");
        inorderPrint(root.right);
    }
}
