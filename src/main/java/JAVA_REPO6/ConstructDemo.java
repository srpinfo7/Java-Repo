package JAVA_REPO6;

public class ConstructDemo {

    // Default constructor
    public ConstructDemo() {
        System.out.println("I am in the constructor");
        System.out.println("I am in the constructor lecture 1");
    }

    // Parameterized constructor (int, int)
    public ConstructDemo(int a, int b) {
        System.out.println("I am in the parameterized constructor");
        int c = a + b;
        System.out.println(c);
    }

    // Parameterized constructor (String)
    public ConstructDemo(String str) {
        System.out.println(str);
    }

    // Regular method
    public void getData() {
        System.out.println("I am the method");
    }

    public static void main(String[] args) {
        // Creating object using default constructor
        ConstructDemo cd = new ConstructDemo();

        // Creating object using String constructor
        ConstructDemo cds = new ConstructDemo("hello");

        // Creating object using int parameterized constructor
        ConstructDemo c = new ConstructDemo(4, 5);

        // The constructor is automatically called when an object is created
    }
}
