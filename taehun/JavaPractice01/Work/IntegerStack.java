package JavaPractice01.Work;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class IntegerStack implements StackInterface {
    private final ArrayList<Integer> stack = new ArrayList<>();

    public boolean isEmpty(){
        return stack.isEmpty();
    }
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
            Integer get = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return get;
        }
    }

    @Override
    public boolean push(Object ob) {
        if(ob instanceof Integer) {
            stack.add((Integer) ob);
            return true;
        }
        else {
            System.out.println("객체 타입이 정수가 아닙니다.");
            return false;
        }
    }
}
