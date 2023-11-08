// Interface for Pets
interface Pets {
    void speak();
}

// Class for Dog implementing the Pets interface
class Dog implements Pets {
    @Override
    public void speak() {
        System.out.println("Dog says Woof!");
    }
}

// Class for Cat implementing the Pets interface
class Cat implements Pets {
    @Override
    public void speak() {
        System.out.println("Cat says Meow!");
    }
}

// Class for Bird implementing the Pets interface
class Bird implements Pets {
    @Override
    public void speak() {
        System.out.println("Bird chirps!");
    }
}
//class for Mouse implementing the Pets interface
class Mouse implements Pets {
    @Override
    public void speak (){
    System.out.println("Mouse squeaks ");   
    }
}

// Class to demonstrate calling methods
public class mypets {
    public static void main(String[] args) {
        Pets dog = new Dog();
        Pets cat = new Cat();
        Pets bird = new Bird();
        Pets mouse = new Mouse();

        dog.speak();
        cat.speak();
        bird.speak();
        mouse.speak();
    }
}


