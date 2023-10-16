package org.javapractice.eclipes.study.InstanceFolder;

import java.util.*;

public class SetUser {
	//private Scanner sc = new Scanner(System.in);
	private static Long sequence = 0L;
	private String id;
	private String name;
	private int num;
	private static final Map<Long, List<String>> STORE = new HashMap<>();
	
	public SetUser(int num) {
		this.num = num; //사용자 선언 가능 메소드 외 접근 제어자 private 설정
	}
	
	public void roopInputUser(SetUser user) {
		for(int i = 0; i<num; i++) {
			++sequence;
			System.out.println(sequence+"번째 유저의 ID를 입력하세요 : ");
			setId(sequence);
			System.out.println(sequence+"번째 유저의 이름를 입력하세요 : ");
			setName(sequence);
		}
	}
	
	public void setId(Long key) {
		this.id = InstanceDoubleArray.printScan.next();
		STORE.computeIfAbsent(key, k -> new ArrayList<>()).add(this.id);
		/* computeIfAbsent 메서드는 맵(Map)에서 특정 키(key)에 대한 값을 가져오는 동시에,
		 * 만약 그 키가 맵에 존재하지 않는 경우에는 지정된 기본 값을 사용하여 값을 설정합니다.
		 * 즉, no 키가 맵에 이미 존재한다면 해당 키에 연결된 리스트(List)를 가져오고,
		 * 그렇지 않다면 새로운 ArrayList를 생성하고 해당 키에 연결합니다.
		 */
	}
	public void setName(Long key) {
		this.name = InstanceDoubleArray.printScan.next();
		STORE.computeIfAbsent(key, k -> new ArrayList<>()).add(this.name);
	}
	public static void getUser() {
		System.out.println("-=-=-=-=- 유저 정보 -=-=-=-=-");
        for (Map.Entry<Long, List<String>> entry : STORE.entrySet()) { 
        	//Entry는 여러 값들을 순회하는데 필요한 메서드임
            Long no = entry.getKey();
            List<String> info = entry.getValue();
            System.out.print("no : " + no);
            for(String infos : info) {
            	if(info.indexOf(infos)==0) {
            		System.out.print("   유저 아이디 : "+infos);
            	}
            	else {
            		System.out.print("   유저 이름 : "+infos);
            	}
            }
            System.out.println("");
        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
	}
}
