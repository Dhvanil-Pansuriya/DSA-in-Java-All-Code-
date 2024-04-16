import java.util.LinkedList;
import java.util.Queue;

public class Introduction {

  public static class Node {

    int data;
    Node right;
    Node left;

    Node(int data) {
      this.data = data;
      left = null;
      right = null;
    }
  }

  public static class BinaryTree {

    static int index = -1;

    public Node buildBinaryTree(int node[]) {
      index++;
      if (node[index] == -1) {
        return null;
      }

      Node newNode = new Node(node[index]);
      newNode.left = buildBinaryTree(node);
      newNode.right = buildBinaryTree(node);

      return newNode;
    }

    public void preOrdered(Node root) {
      if (root == null) {
        return;
      }
      System.out.print(root.data + " ");
      preOrdered(root.left);
      preOrdered(root.right);
    }

    public void inOrdered(Node root) {
      if (root == null) {
        return;
      }
      preOrdered(root.left);
      System.out.print(root.data + " ");
      preOrdered(root.right);
    }

    public void postOrdered(Node root) {
      if (root == null) {
        return;
      }
      preOrdered(root.left);
      preOrdered(root.right);
      System.out.print(root.data + " ");
    }

    public void levelOrdered(Node root) {
      if (root == null) {
        return;
      }

      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);
      while (!q.isEmpty()) {
        Node curr = q.remove();
        if (curr == null) {
          System.out.println();
          if (q.isEmpty()) {
            break;
          } else {
            q.add(null);
          }
        } else {
          System.out.print(curr.data + " ");
          if (curr.left != null) {
            q.add(curr.left);
          }
          if (curr.right != null) {
            q.add(curr.right);
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildBinaryTree(node);
    // System.out.println(root.right.data);
    // tree.preOrdered(root);
    // tree.inOrdered(root);
    // tree.postOrdered(root);
    tree.levelOrdered(root);
  }
}
