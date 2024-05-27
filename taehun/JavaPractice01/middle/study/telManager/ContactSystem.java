package JavaPractice01.middle.study.telManager;

import JavaPractice01.middle.study.Library.Book;
import JavaPractice01.middle.study.Library.DuplicateBookException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ContactSystem {
    private HashMap<Key, Contact> map;

    public ContactSystem(){
        map = new HashMap<>();
    }

    public void addContact(Key key, Contact contact) throws DuplicateBookException {
        try{
            map.put(key, contact);
            System.out.println("성공적으로 추가되었습니다 : " + contact);
        } catch (Exception e){
            throw new DuplicateBookException("중복된 연락처 : " + contact);
        }
    }

    public void listContact(){
        ArrayList<Contact> list = new ArrayList<>();
        for (Map.Entry<Key, Contact> entry : map.entrySet()) {
            list.add(entry.getValue()); // 100, 200, 300 출력
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("연락처 고유번호\t|\t성명\t|\t전화번호");
        for (Contact contact : list) {
            System.out.println(contact.hashCode() + "\t|\t" + contact + "\t|\t" + contact.getTel());
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
