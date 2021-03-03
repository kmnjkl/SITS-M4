package l_03_03_21;

public class Main {
    public static void main(String[] args) {
        MyTree<Integer> tree = new MyTree<>();
        for (int i = 5; i < 10; i++) {
            System.out.print(i + " ");
            tree.add(i);
        }
        for (int j = 4; j > 0; j--) {
            System.out.print(j + " ");
            tree.add(j);
        }
        System.out.println();
        int dl = tree.deep(tree.head.left);
        int dr = tree.deep(tree.head.right);
        boolean b = Math.abs(dl-dr) <= 1;
        System.out.println(dl + "\t" + dr + "\n" + "balance: " + (b ? "yes" : "no") + "\n");
        tree.add(10);
        tree.add(11);
        dl = tree.deep(tree.head.left);
        dr = tree.deep(tree.head.right);
        b = Math.abs(dl-dr) <= 1;
        System.out.println(dl + "\t" + dr + "\n" + "balance: " + (b ? "yes" : "no"));
    }
}
