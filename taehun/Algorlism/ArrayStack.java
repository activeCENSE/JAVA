package Algorlism;

public class ArrayStack implements StackInterface{
    private Integer[] stack;
    private int topIndex;
    private static final int DEFAULT_CAP = 64;

    public ArrayStack(int n){
        stack = new Integer[n];
        topIndex = -1;
    }
    public ArrayStack(){
        stack = new Integer[DEFAULT_CAP];
        topIndex = -1;
    }

    private boolean isFull(){
        return topIndex == stack.length-1;
    }
    @Override
    public void push(Integer newItem) {
        if(isFull()){
            System.out.println("꽉 차 있어서 값 삽입이 안돼용");
            return;
        }
        stack[++topIndex] = newItem;
    }

    @Override
    public Integer pop() {
        if(isEmpty()){
            System.out.println("비어있어요");
            return null;
        }
       return stack[topIndex--];
    }

    @Override
    public Integer top() {
        if(isEmpty()){
            System.out.println("비어있어요");
            return null;
        }
        return stack[topIndex];
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public void popAll() {
        stack = new Integer[stack.length]; //메모리 관리를 위함 - Garbage Collector
        topIndex= -1;
    }
}
