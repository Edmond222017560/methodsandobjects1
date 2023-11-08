// Define an interface
interface MyInterface {
    void myMethod();
}

// Class A implements the interface
class ClassA implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("ClassA's myMethod is called");
    }
}

// Class B implements the interface
class ClassB implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("ClassB's myMethod is called");
    }
}

public class example1 {
    public static void main(String[] args) {
        // Create objects of ClassA and ClassB
        ClassA a = new ClassA();
        ClassB b = new ClassB();

        // Call the methods
        a.myMethod();
        b.myMethod();
    }
}

    

