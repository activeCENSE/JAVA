package JavaPractice01.abstact;

public abstract class Animal {
    int age;
    int legLength;
    public Animal(int age, int legLength){
        this.age = age;
        this.legLength = legLength;
    }
    abstract void bark();
    void printInfo(){
        System.out.println("나이 : " + this.age + "\t다리 수 : " + this.legLength);
    }
}
