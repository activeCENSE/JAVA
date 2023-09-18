package org.javapractice.iot;

public class Elevator {
	String _id;
	public Elevator(String id) { //String id를 인스턴스로 받아와
		this._id = id; //해당객체의 _id값으로 저장함
	}

	public Boolean callForUp(int stopFloor) { //정수 stopFloor을 인스턴스로 받아오고 printIn문구로 출력 후 true변경
		System.out.println(this._id+" -> Elevator callForUp stopFloor : "+stopFloor);
		return true;
	}
	
	public Boolean callForDown(int stopFloor) {
		System.out.println(this._id+" -> Elevator callForDown : "+stopFloor);
		return true;
	}
}