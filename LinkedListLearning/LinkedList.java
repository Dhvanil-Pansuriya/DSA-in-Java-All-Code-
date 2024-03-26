package LinkedListLearning;

public class LinkedList {

  public static Node head;
  public static Node tail;
  public static int size;

  /*
   * Node
   */
  public static class Node {

    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void addFirst(int data) {
    Node newNode = new Node(data);
    size++;
    // If List is empty
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    // If List is empty
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void removeFirst() {
    if (size == 0) {
      System.out.println("null");
    } else if (size == 1) {
      System.out.println("Removed Value : " + head.data);
      head = tail = null;
      size--;
      return;
    } else {
      System.out.println("Removed Value : " + head.data);
      head = head.next;
      size--;
    }
  }

  public void removeLast() {
    if (size == 0) {
      System.out.println("null");
    } else if (size == 1) {
      System.out.println("Removed Value : " + head.data);
      head = tail = null;
      size--;
      return;
    } else {
      Node prev = head;
      System.out.println("Removed Value : " + tail.data);
      for (int i = 0; i < size - 2; i++) {
        prev = prev.next;
      }
      prev.next = null;
      tail = prev;
      size--;
    }
  }

  public int search(int val) {
    int i = 0;
    Node temp = head;
    while (temp != null) {
      if (temp.data == val) {
        return i;
      } else {
        temp = temp.next;
        i++;
      }
    }
    return -1;
  }

  public int recursiveSearch(int key) {
    return helper(head, key);
  }

  public int helper(Node head, int key) {
    if (head == null) {
      return -1;
    }
    if (head.data == key) {
      return 0;
    }

    int index = helper(head.next, key);
    if (index == -1) {
      return -1;
    }

    return index + 1;
  }

  public void printLinkedList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      // System.out.print(temp.next + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void reverseLinkList() {
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public void removeNthElementFromLast(int n) {
    Node temp = head;
    int s = 0;
    while (temp != null) {
      temp = temp.next;
      s++;
    }
    if (n == s) {
      System.out.println("Deleted Value : " + head.data);
      head = head.next;
      size--;
      return;
    }

    int i = 1;
    int iMiN = s - n;
    Node prev = head;
    while (i < iMiN) {
      prev = prev.next;
      i++;
    }

    System.out.println("Deleted Value : " + prev.next.data);
    prev.next = prev.next.next;
    size--;
    return;
  }

  public Node findMiddle(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public boolean isPalindrome() {
    if (head == null || head.next == null) {
      return true;
    }

    Node middle = findMiddle(head);

    Node prev = null;
    Node curr = middle;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    Node right = prev;
    Node left = head;

    while (right != null) {
      if (right.data != left.data) {
        return false;
      }
      right = right.next;
      left = left.next;
    }

    return true;
  }

  public void addAtIndex(int index, int data) {
    if (index == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;

    while (i < index - 1) {
      temp = temp.next;
      i++;
    }

    newNode.next = temp.next;
    temp.next = newNode;
  }

  public void addLinearWay(int s) {
    LinkedList ll = new LinkedList();
    for (int i = 1; i <= s; i++) {
      ll.addLast(i);
    }
  }

  public boolean isCycle() {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }

    return false;
  }

  public void removeCycle() {
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        cycle = true;
        break;
      }
    }

    if (cycle == false) {
      return;
    }

    slow = head;

    Node prev = null;
    while (slow != fast) {
      prev = fast;
      slow = slow.next;
      fast = fast.next;
    }

    prev.next = null;
  }

  public Node getMid(Node head) {
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }

    return slow;
  }

  public Node merge(Node left, Node right) {
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while (left != null && right != null) {
      if (left.data <= right.data) {
        temp.next = left;
        left = left.next;
        temp = temp.next;
      } else {
        temp.next = right;
        right = right.next;
        temp = temp.next;
      }
    }

    while (left != null) {
      temp.next = left;
      left = left.next;
      temp = temp.next;
    }

    while (right != null) {
      temp.next = right;
      right = right.next;
      temp = temp.next;
    }

    return mergedLL.next;
  }

  public Node mergeShort(Node head) {
    if (head == null || head.next == null) {
      return head;
    }

    Node mid = getMid(head);

    Node rightHead = mid.next;
    mid.next = null;

    Node newLeft = mergeShort(head);
    Node newRight = mergeShort(rightHead);

    return merge(newLeft, newRight);
  }

  public void zigZag() {

    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    Node mid = slow;

    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;

    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    Node left = head;
    Node right = prev;
    Node nextRight, nextLeft;

    while (left != null && right != null) {
      nextLeft = left.next;
      left.next = right;
      nextRight = right.next;
      right.next = nextLeft;

      left = nextLeft;
      right = nextRight;
    }
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();

    ll.addLinearWay(5);

    ll.zigZag();

    ll.printLinkedList();
  }
}
