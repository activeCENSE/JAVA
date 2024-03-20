package JavaPractice01.abstact;

public class Cat extends Animal{
    Cat(){
        super(7, 4);
    }

    @Override
    void bark() {
        System.out.println("냐 옹 ~");
    }
}
