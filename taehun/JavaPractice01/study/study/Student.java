package JavaPractice01.study.study;

public class Student {
	private String SchoolName;
	private String name;
	private int score;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	void playGame() {
		System.out.println("저는 지금 테트리스 게임을 합니다...");
	}
}
