import java.util.*;

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

    public int heightOfTree(Node root) {
      if (root == null) {
        return 0;
      }

      int left = heightOfTree(root.left);
      int right = heightOfTree(root.right);

      int height = Math.max(left, right) + 1;

      return height;
    }

    public int totalNode(Node root) {
      if (root == null) {
        return 0;
      }

      int l = totalNode(root.left);
      int r = totalNode(root.right);

      return l + r + 1;
    }

    public int sumOfNode(Node root) {
      if (root == null) {
        return 0;
      }

      int left = sumOfNode(root.left);
      int right = sumOfNode(root.right);

      int sum = left + right + root.data;

      return sum;
    }

    public int DiameterOfTreeApproach1(Node root) {
      if (root == null) {
        return 0;
      }

      int leftD = DiameterOfTreeApproach1(root.left);
      int lh = heightOfTree(root.left);
      
      int rightD = DiameterOfTreeApproach1(root.right);
      int rh = heightOfTree(root.right);

      return Math.max(Math.max(leftD, rightD), (lh + rh + 1));
    }

    class Diameter {

      int diameter;
      int height;

      Diameter(int diameter, int height) {
        this.diameter = diameter;
        this.height = height;
      }
    }

    public Diameter diameterOfTree(Node root) {
      if (root == null) {
        return new Diameter(0, 0);
      }

      Diameter leftD = diameterOfTree(root.left);
      Diameter rightD = diameterOfTree(root.right);

      int max = Math.max(
        Math.max(leftD.diameter, rightD.diameter),
        leftD.height + rightD.height + 1
      );

      int h = Math.max(rightD.height, leftD.height) + 1;

      return new Diameter(max, h);
    }

    public boolean isSubTree(Node root, Node subRoot) {
      if (root == null) {
        return false;
      }

      if (root.data == subRoot.data) {
        if (isIdentical(root, subRoot)) {
          return true;
        }
      }

      boolean leftAns = isSubTree(root.left, subRoot);
      boolean rightAns = isSubTree(root.right, subRoot);

      return leftAns || rightAns;
    }

    public boolean isIdentical(Node root, Node subRoot) {
      if (root == null && subRoot == null) {
        return true;
      } else if (root == null || subRoot == null || root.data != subRoot.data) {
        return false;
      }

      if (!isIdentical(root.left, subRoot.left)) return false;
      if (!isIdentical(root.right, subRoot.right)) return false;

      return true;
    }

    class Info {

      Node node;
      int hd;

      Info(Node node, int hd) {
        this.node = node;
        this.hd = hd;
      }
    }

    public void topView(Node root) {
      Queue<Info> q = new LinkedList<>();
      HashMap<Integer, Node> map = new HashMap<>();

      int max = 0, min = 0;

      q.add(new Info(root, 0));
      q.add(null);

      while (!q.isEmpty()) {
        Info curr = q.remove();
        if (curr == null) {
          if (q.isEmpty()) {
            break;
          } else {
            q.add(null);
          }
        } else {
          if (!map.containsKey(curr.hd)) {
            map.put(curr.hd, curr.node);
          }

          if (curr.node.left != null) {
            q.add(new Info(curr.node.left, curr.hd - 1));
            min = Math.min(min, curr.hd - 1);
          }

          if (curr.node.right != null) {
            q.add(new Info(curr.node.right, curr.hd + 1));
            max = Math.max(max, curr.hd + 1);
          }
        }
      }

      for (int i = min; i <= max; i++) {
        System.out.print(map.get(i).data + " ");
      }
    }

    public void kthLevelOfTree(Node root, int k) {
      if (root == null) {
        return;
      }

      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);
      int i = 0;
      while (!q.isEmpty()) {
        Node curr = q.remove();
        if (curr == null) {
          i++;
          if (q.isEmpty()) {
            break;
          } else {
            q.add(null);
          }
        } else {
          if (i == k - 1) {
            System.out.print(curr.data + " ");
          }
          if (curr.left != null) {
            q.add(curr.left);
          }
          if (curr.right != null) {
            q.add(curr.right);
          }
        }
      }
    }

    public void kthLevelOfTreeRecursive(Node root, int level, int k) {
      if (root == null) {
        return;
      }
      if (level == k) {
        System.out.print(root.data + " ");
        return;
      }
      kthLevelOfTreeRecursive(root.left, level + 1, k);
      kthLevelOfTreeRecursive(root.right, level + 1, k);
    }

    public Node lca(Node root, int n1, int n2) {
      ArrayList<Node> list1 = new ArrayList<>();
      ArrayList<Node> list2 = new ArrayList<>();

      getPath(root, n1, list1);
      getPath(root, n2, list2);
      int i = 0;
      for (; i < list1.size() && i < list2.size(); i++) {
        if (list1.get(i) != list2.get(i)) {
          break;
        }
      }
      Node lca = list1.get(i - 1);

      return lca;
    }

    public boolean getPath(Node root, int n, ArrayList<Node> list) {
      if (root == null) {
        return false;
      }

      list.add(root);

      if (root.data == n) {
        return true;
      }

      boolean l = getPath(root.left, n, list);
      boolean r = getPath(root.right, n, list);

      if (l || r) {
        return true;
      }

      list.remove(list.size() - 1);

      return false;
    }

    public Node lca2(Node root, int n1, int n2) {
      if (root == null) {
        return null;
      }

      if (root.data == n1 || root.data == n2) {
        return root;
      }

      Node leftLca = lca2(root.left, n1, n2);
      Node rightLca = lca2(root.right, n1, n2);

      if (leftLca == null) {
        return rightLca;
      }

      if (rightLca == null) {
        return leftLca;
      }

      return root;
    }
  }

  public static void main(String[] args) {
    int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildBinaryTree(node);
    // int subNode[] = { 2, 4, -1, -1, 5, -1, -1 };
    // Node subRoot = tree.buildBinaryTree(subNode);
    // tree.index = -1;
    // System.out.println(root.right.data);
    // tree.preOrdered(root);
    // tree.inOrdered(root);
    // tree.postOrdered(root);
    // tree.levelOrdered(root);
    // System.out.println(tree.heightOfTree(root));
    // System.out.println(tree.totalNode(root));
    // System.out.println(tree.sumOfNode(root));
    // System.out.println(tree.diameterThrewRoot(root));
    // System.out.println(tree.diameterOfTree(root).diameter);
    // System.out.println(tree.diameterOfTree(root).height);
    // System.out.println(tree.isSubTree(root, subRoot));
    // tree.topView(root);
    // tree.kthLevelOfTree(root, 1);
    // tree.kthLevelOfTree(root, 1);
    // tree.kthLevelOfTreeRecursive(root, 1, 3);
    // System.out.println(tree.lca(root, 4, 6).data);
    System.out.println(tree.lca2(root, 4, 6).data);
  }
}
