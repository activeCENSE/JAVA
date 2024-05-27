package JavaPractice01.middle.study.telManager;

public class Key {
    public int number;

    public Key(Contact contact){
        this.number = contact.hashCode();
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
