package ex_4_1_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);
        for (int i=0; i < n; i++) {
            al.add(sc.nextInt());
        }
        int res=0;
        for (int i=0; i < n-1; i++) {
            if (al.get(i) < al.get(i+1))
                res++;
        }
        System.out.println(res);
    }
}
