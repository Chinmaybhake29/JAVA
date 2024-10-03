package Staticnested;

class OuterClass {
    private static String msg = "Welcome to Nested Classes";

    public static class NestedStaticClass {
        public void printMessage() {
            // Print message from the static nested class
            System.out.println("Message from nested static class: " + msg);
        }
    }

    public static class InnerClass {
        public void display() {
            // Print message from the non-static inner class
            System.out.println("Message from non-static class: " + msg);
        }
    }
}

public class ClassNested {
    public static void main(String[] args) {
        // Create an instance of the static nested class and print the message
        OuterClass.NestedStaticClass p = new OuterClass.NestedStaticClass();
        p.printMessage();

        // Create an instance of the outer class
        OuterClass outer = new OuterClass();
        // Create an instance of the inner class and display the message
        InnerClass inner = new InnerClass();
        inner.display();
    }
}
