package org.milan.coreJava.CollectionsDemo;

import java.util.Properties;

/**
 *
 * @author Aspire
 */
public class PropertiesDemo {
    public static void main(String[] a){
        try{
        Properties p=new Properties();
        p=System.getProperties();
        System.out.println(p.toString());
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }

}
