package JavaPractice01.object;

import java.util.Objects;

public class Key1 {
    int num;
    public Key1(int num){
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if ((Key1)obj instanceof Key1) {
            Key1 other = (Key1) obj;
            return other.num == this.num;
        }
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
