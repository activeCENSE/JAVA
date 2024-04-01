package JavaPractice01.Work;

import java.util.ArrayList;

public class ObjectStack implements ObjectInterface {
    private final ArrayList<Integer> intStack = new ArrayList<>();
    private final ArrayList<String> stringStack = new ArrayList<>();

    public boolean isEmpty(String type){
        if(type.equals("정수"))
            return intStack.isEmpty();
        else
            return stringStack.isEmpty();
    }
    @Override
    public int length(String type) {
        if(type.equals("정수")){
            return intStack.size();
        } else {
            return stringStack.size();
        }
    }

    @Override
    public Object pop(String type) {
        if(type.equals("정수")) {
            if (intStack.isEmpty()) {
                System.out.println("스택이 비어 있습니다.");
                return null;
            } else {
                Integer get = intStack.get(intStack.size() - 1);
                intStack.remove(intStack.size() - 1);
                return get;
            }
        } else {
            if (stringStack.isEmpty()) {
                System.out.println("스택이 비어 있습니다.");
                return null;
            } else {
                String get = stringStack.get(stringStack.size() - 1);
                stringStack.remove(stringStack.size() - 1);
                return get;
            }
        }
    }


    @Override
    public boolean push(Object ob) {
        if(ob instanceof Integer) {
            intStack.add((Integer) ob);
            return true;
        }
        else if(ob instanceof String) {
            stringStack.add((String) ob);
            return true;
        }
        else {
            System.out.println("해당 객체는 정수 또는 문자열이 아닙니다.");
            return false;
        }
    }
}
