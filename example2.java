// Class X
class ClassX {
    public void methodX() {
        System.out.println("ClassX's methodX is called");
    }
}

// Class Y
class ClassY {
    public void methodY() {
        System.out.println("ClassY's methodY is called");
    }
}

public class example2 {
    public static void main(String[] args) {
        // Create objects of ClassX and ClassY
        ClassX x = new ClassX();
        ClassY y = new ClassY();

        // Call the methods
        x.methodX();
        y.methodY();
    }
}

    

