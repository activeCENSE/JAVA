package org.javapractice.iot;


public class Speaker {
	String _id;
	public Speaker(String id) {
		this._id = id;
	}
	public Boolean makeVoice(String content) {
		System.out.println(this._id + " -> Speaker on : " + content);
		return true;
	}
}