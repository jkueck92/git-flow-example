package de.jkueck;

public class Main {

    public Main() {
        System.out.println("call constructor");
    }

    public static void main(String[] args) {
        System.out.println("starting application...");
    }

    public int calculate(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

}
