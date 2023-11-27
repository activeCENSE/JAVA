package JavaPractice01.javapractice;

import java.util.HashMap;

public class keyclass {
        public static void main(String[] args){
            Key tel;

            HashMap<Key, String> telList = new HashMap<>();
            telList.put(new Key(1), "ulsan");
            telList.put(new Key(2), "busan");
            String value = telList.get(new Key(1));
            System.out.println(value);

            HashMap<Member, String> mList = new HashMap<>();
            mList.put(new Member("ulsan"), "울산광역시");
            mList.put(new Member("busan"), "부산광역시");
            String value1 = mList.get(new Member("ulsan"));
            System.out.println(value1);

            HashMap<Integer, String> iList = new HashMap<>();
            mList.put(new Member("ulsan"), "울산광역시");
            mList.put(new Member("busan"), "부산광역시");
            String value2 = mList.get(new Member("ulsan"));
            System.out.println(value1);
        }
}
