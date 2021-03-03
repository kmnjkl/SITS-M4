package l_03_03_21;

public class MyTree<T extends Comparable<? super T>> {
    class Node {
        T data;
        Node left;
        Node right;
    }

    Node head;
    int size = 0;

    MyTree(){
        head = null;
    }

    public void add(T data){
        if(head == null) {
            head = new Node();
            head.data = data;
        } else {
            Node cur = head;
            while (true) {
                if (data.compareTo(cur.data) > 0) {
                    if (cur.right != null) {
                        cur = cur.right;
                    } else {
                        cur.right = new Node();
                        cur.right.data = data;
                        break;
                    }
                } else {
                    if (cur.left != null) {
                        cur = cur.left;
                    } else {
                        cur.left = new Node();
                        cur.left.data = data;
                        break;
                    }
                }
            }
        }
    }

    public int deep(Node node) {
        int l=0, r=0;
        if (node.left == null && node.right == null) {
            return 1;
        }
        if (node.left != null) {
            l = deep(node.left);
        }
        if (node.right != null) {
            r = deep(node.right);
        }
        return Math.max(l, r) + 1;
    }
}
