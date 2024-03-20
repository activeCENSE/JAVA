package JavaPractice01.abstact;

public class Dog extends Animal{
    Dog(){
        super(5, 4);
    }

    @Override
    void bark(){
        System.out.println("멍멍");
    }

}
