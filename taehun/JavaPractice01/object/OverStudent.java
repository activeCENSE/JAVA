package JavaPractice01.object;

import java.util.Objects;

public class OverStudent {
    String name;
    int score;
    public OverStudent(String n, int s){
        name = n;
        score = s;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

//    @Override
//    public boolean equals(Object obj){
//        OverStudent other = (OverStudent) obj;
//        return name.equals(other.name) && score == other.score;
//    }

    @Override
    public int hashCode(){
        return Objects.hash(name, score);
    }
}
