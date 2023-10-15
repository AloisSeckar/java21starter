package cz.aloisseckar.starter;

/**
 * This is my starter template for Java 21 project.
 * 
 * @author alois.seckar@gmail.com
 */
public class Main {
    
    /**
     * Simple main method.
     * 
     * @param args not supported (ignored) in this starter template
     */
    public static void main(String[] args) {

        // prints out current JDK info
        // https://stackoverflow.com/a/19165338/3204544
        System.out.println("JVM INFO");
        System.out.println(System.getProperty("java.vm.name"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.specification.vendor"));
        
    }
    
}
