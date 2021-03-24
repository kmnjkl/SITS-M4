package ctest;

import java.io.File;
import java.util.Stack;

public class gs {
    public static void main(String[] args) {
        new Thread(new Test()).start();

    }

    public void getFileInfo(String fileName) {
        File file = new File(fileName);
        System.out.println(file.getTotalSpace());
        System.out.println(file.getAbsolutePath());
    }
}

class Monstr {
    private int health; // private, т.к. в UML "-"
    private int damage; // private, т.к. в UML "-"
    protected void attack() {}  // protected, т.к. в UML "#"
    public boolean isAlive(int health) { return true; }   // private, т.к. в UML "+"
}

class Test extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
