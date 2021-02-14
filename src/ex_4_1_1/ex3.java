package ex_4_1_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);
        for (int i=0; i < n; i++) {
            al.add(sc.nextInt());
        }
        Integer res_max = al.get(0);
        for (Integer x: al) {
            if (x > res_max) {
                res_max = x;
            }
        }
        System.out.print(res_max);
    }
}
