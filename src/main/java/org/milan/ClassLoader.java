package org.milan;

/**
 * Example of Class loading in java
 *
 * @author Milan Rathod
 */
public class ClassLoader {

    public static void main(String[] args) {
        System.out.println("ClassLoader of this class: " + ClassLoader.class.getClassLoader());

        try {
            Class.forName("org.milan.ClassLoader", true, ClassLoader.class.getClassLoader().getParent());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
