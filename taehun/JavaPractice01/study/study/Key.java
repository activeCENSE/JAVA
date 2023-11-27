package JavaPractice01.study.study;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	public boolean equals(Object obj){
		if(obj instanceof Key) {
			Key temp = (Key) obj;
			if(this.number == temp.number)
				return true;
		}
		return false;
	}
	public int hashCode() {
		return number;
	}
}
