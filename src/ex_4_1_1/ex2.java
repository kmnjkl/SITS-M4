package ex_4_1_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);
        for (int i=0; i < n; i++) {
            al.add(sc.nextInt());
        }
        Integer last = al.get(n-1);
        for (int j=n-1; j > 0; j--) {
            al.set(j, al.get(j-1));
        }
        al.set(0, last);
        for (Integer x: al) {
            System.out.print(x + " ");
        }
    }
}
