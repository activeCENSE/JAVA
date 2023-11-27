package JavaPractice01.study.study;

public class SingleObject {
	private static SingleObject instance = new SingleObject();
	private SingleObject(){
		
	}
	static SingleObject getInstance(){
		return instance;
	}
	public void showMessage() {
		System.out.println("i am singleton example");
	}
}
