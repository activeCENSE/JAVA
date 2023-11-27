package JavaPractice01.study.study;

public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member temp = (Member) obj;
			if(this.id.equals(temp.id))
				return true;
		}
		return false;
	}
	public int hashCode() {
		return id.hashCode();
	}
}
