package JavaPractice01.study.study;

import java.util.HashMap;

public class Code1127_1 {

	public static void main(String[] args) {
		HashMap<Key, String> telList = new HashMap<Key, String>();
		telList.put(new Key(1), "ulsan");
		telList.put(new Key(2),"busan");
		Key t = new Key(1);
		String value = telList.get(new Key(1));
		value = telList.get(t);
		System.out.println(value);

		HashMap<Member, String> mList = new HashMap<Member, String>();
		mList.put(new Member("ulsan"), "울산광역시");
		mList.put(new Member("busan"),"부산광역시");
		value = mList.get(new Member("ulsan"));
		System.out.println(value);
		
//		HashMap<int, String> tList = new HashMap<int, String>();
		HashMap<Integer, String> cList = new HashMap<Integer, String>();
		mList.put(new Member("ulsan"), "울산광역시");
		mList.put(new Member("busan"),"부산광역시");
		value = mList.get(new Member("ulsan"));
		System.out.println(value);

	}

}
