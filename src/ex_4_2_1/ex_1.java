package ex_4_2_1;

import java.util.LinkedList;
import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> l = new LinkedList<>();
        for (int i=0; i < n; i++) {
            l.add(sc.nextInt());
        }
        int s = 1;
        int el = l.get(0);
        int res = 0;
        for (int i=1; i < n; i++) {
            Integer x = l.get(i);
            if (x == el) {
                s++;
                if (s >= 3 && i == n-1) {
                    res += s;
                    while (s > 0) {
                        l.remove(i-s+1);
                        i--;
                        n--;
                        s--;
                    }
                    s = 0;
                    i = -1;
                }
            } else if (s >= 3) {
                res += s;
                while (s > 0) {
                    l.remove(i-s);
                    i--;
                    n--;
                    s--;
                }
                s = 0;
                i = -1;
            } else {
                el = l.get(i);
                s = 1;
            }
        }
        System.out.println(res);
    }
}
