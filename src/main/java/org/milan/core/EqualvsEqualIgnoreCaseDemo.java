package org.milan.core;

public class EqualvsEqualIgnoreCaseDemo {
    public static void main(String[] a) {
        String s1 = "yash";
        String s2 = "Yash";

        if (s1.equals(s2)) {
            System.out.println("case wise they are equal");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("they are equal ignoring case");
        }


    }
}