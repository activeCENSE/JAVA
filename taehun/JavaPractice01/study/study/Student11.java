package JavaPractice01.study.study;

public class Student11 {
	int score;
	private String name;
	private String address;
	String sName;
	
	public Student11(int s, String n) {
		score = s;
		name = n;
		sName = "uc";
	}
	public Student11(int s, String n, String sn) {
		score = s;
		name = n;
		sName = sn;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	void printing(){
		System.out.println(sName+"에 다니는 "+ name +"의 점수는 "+ score+"점 입니다.");
	}
}
