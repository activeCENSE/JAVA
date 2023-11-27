package JavaPractice01.javapractice;

public class Key {
    public int number;

    public Key(int number){
        this.number = number;
    }
    public boolean equals(Object obj){
        if(obj instanceof Key temp)
    {
        return this.number == temp.number;
    }
        return false;
    }
    @Override
    public int hashCode() {
        return number;
    }
}
