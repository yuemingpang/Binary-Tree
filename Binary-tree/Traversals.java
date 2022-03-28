import java.util.List;
import java.util.LinkedList;

/**
 * Implementation of the pre-order, in-order, and post-order
 * traversals of a tree.
 */
public class Traversals<T extends Comparable<? super T>> {

   
  public List<T> preorder(TreeNode<T> root) {
    LinkedList<T> list = new LinkedList<>();
    recursePre(root, list);
    return list;
  }
    
  private void recursePre(TreeNode<T> root,LinkedList<T> list) {
    if (root != null) {
        list.addLast(root.getData());
        recursePre(root.getLeft(), list);
        recursePre(root.getRight(), list);
    }
  }


  public List<T> inorder(TreeNode<T> root) {
    LinkedList<T> list = new LinkedList<>();
    recurseIn(root, list);
    return list;
  }
    
  private void recurseIn(TreeNode<T> root,LinkedList<T> list) {
    if (root != null) {
        recurseIn(root.getLeft(), list);
        list.addLast(root.getData());
        recurseIn(root.getRight(), list);
    }
  }


  public List<T> postorder(TreeNode<T> root) {
    LinkedList<T> list = new LinkedList<>();
    recursePost(root, list);
    return list;
  }
    
  private void recursePost(TreeNode<T> root,LinkedList<T> list) {
    if (root != null) {
      recursePost(root.getLeft(), list);
      recursePost(root.getRight(), list);
      list.addLast(root.getData());
    }
  }
    
}