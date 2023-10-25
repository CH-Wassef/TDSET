package org.example;


import java.util.HashSet;
import java.util.TreeSet;

//TD SET
public class Main {
    public static void main(String[] args) {

        Enseignent e1 = new Enseignent(1, "Chargui", "Wassef");
        Enseignent e2 = new Enseignent(2, "Attia", "Imed");
        Enseignent e3 = new Enseignent(3, "Khalil", "Bahaw");

        System.out.println(e3.equals(e2));
        System.out.println(e1);

    }
}