package JavaPractice01.abstact;

public class Study_240320 {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.bark();
        c.bark();
        d.printInfo();
        c.printInfo();
    }
}
