package ex_4_10_2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, TreeMap<String, Integer>> db = new TreeMap<>();
        String v1, v2;
        Integer v3;
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();
            String[] lineSplit = nextLine.split(" ");
            v1 = lineSplit[0];
            v2 = lineSplit[1];
            v3 = Integer.parseInt(lineSplit[2]);
            if (db.containsKey(v1)) {
                if (db.get(v1).containsKey(v2)) {
                    db.get(v1).replace(v2, db.get(v1).get(v2) + v3);
                } else {
                    db.get(v1).put(v2, v3);
                }
            } else {
                TreeMap<String, Integer> v4 = new TreeMap<>();
                v4.put(v2, v3);
                db.put(v1, v4);
            }
        }

//        System.out.println(db);

        for (Map.Entry entry: db.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Map.Entry entry1: ((TreeMap<String, Integer>)entry.getValue()).entrySet()) {
                System.out.println(entry1.getKey() + "\n" + entry1.getValue());
            }
        }

        sc.close();
    }
}
