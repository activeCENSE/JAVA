package JavaPractice01.Interface;

public class Progammer implements Gamer{
    String name;
    int level;

    public Progammer(String name, int level){
        this.name = name;
        this.level = level;
    }
    @Override
    public void doGame() { //public 무조건 넣어야함. Interface에서 정의된 메소드는 public void doGame()이므로 자식 클래스는 같거나 더 넓은 클래스를 가져야 함
        System.out.println(name + "(" +level+") 이 게임 대회를 진행 중 입니다.");
    }
}
