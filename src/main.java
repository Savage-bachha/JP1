interface Animal {
    void sound(); // abstract method
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Woof Woof!");
    }
}

public class main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}
