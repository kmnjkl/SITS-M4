package ex_4_9_1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        TreeSet<String> strSet = new TreeSet<>();
        while (!x.equals("#")) {
//            System.out.println("=== " + x);
//            String[] r = x.split(" ");
            if (x.equals("+")) {
                x = sc.next();
                strSet.add(x);
            } else if (x.equals("?")) {
                x = sc.next();
                System.out.println(strSet.contains(x) ? "YES" : "NO");
            }
            x = sc.next();
        }
    }
}
