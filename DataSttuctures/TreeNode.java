public class TreeNode<T> {
     T val;
     TreeNode<T> left;
     TreeNode<T> right;

     //constuctor chaining (avoid duplicate like [this.val =val;] used in both with 1 , 3 parameter constructor if not used constructor chaining)
     TreeNode(){
          this(null);
     }
     TreeNode(T val ){
          this(val,null,null);
     }
     TreeNode(T val , TreeNode<T> left , TreeNode<T> right ){
          this.val =val;
          this.left = left;
          this.right = right;
     }

}
