package JavaPractice01.Work;

import java.util.ArrayList;

public class StringStack implements StackInterface {
    private final ArrayList<String> stack = new ArrayList<>();

    @Override
    public int length() {
        return stack.size();
    }

    @Override
    public Object pop() {
        if(stack.isEmpty()) {
            System.out.println("스택이 비어 있습니다.");
            return null;
        } else {
            String get = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return get;
        }
    }

    @Override
    public boolean push(Object ob) {
        if(ob instanceof String) {
            stack.add(ob.toString());
            return true;
        }
        else {
            System.out.println("객체 타입이 문자열이 아닙니다.");
            return false;
        }
    }
}
