package JavaPractice01.abstact;

public class League_of_legend__Gamer implements Gamer {
    String soloRank;
    final String TYPE = "리그오브레전드";
    int level;
    String name;
    League_of_legend__Gamer(String name, String soloRank, int level){
        //GAME_RANK = "123"; 상수 선언했으므로 에러임
        this.name = name;
        this.soloRank = soloRank;
        this.level = level;
    }

    @Override
    public void doGame() {
        System.out.println("해당 유저의 이름은 " +this.name+ " 이고, " +TYPE+ " 게임 플레이 중 입니다.");
        System.out.println("현재 솔로랭크는 " + this.soloRank + " 입니다.");
        System.out.println("현재 레벨은 " + this.level + " 이고, 최대 레벨은 " + GAME_MAX_LEVEL + " 입니다.");
        System.out.println("해당 유저는 " + JOB + " 입니다.");
    }

}
