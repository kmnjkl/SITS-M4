package ctest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] a = {"1", "2", "spring"};
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> c9 = new ArrayList<>();
        ArrayList<String> c10 = new ArrayList<>();
        ArrayList<String> c11 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int c = sc.nextInt();
            if (c == 9) {
                c9.add(sc.next());
            } else if (c == 10) {
                c10.add(sc.next());
            } else {
                c11.add(sc.next());
            }
        }
        for (int i = 0; i < c9.size(); i++) {
            System.out.println("9 " + c9.get(i));
        }
        for (int i = 0; i < c10.size(); i++) {
            System.out.println("10 " + c10.get(i));
        }
        for (int i = 0; i < c11.size(); i++) {
            System.out.println("11 " + c11.get(i));
        }
    }
}
