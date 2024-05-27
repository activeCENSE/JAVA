package Algorlism;

public class IntegerArrayList implements IntegerListIF {

    private Integer[] item;
    private int numItem;
    private static final int DEFAULT_CAPACITY = 64;

    public IntegerArrayList(){
        item = new Integer[DEFAULT_CAPACITY];
        numItem = 0;
    }

    public IntegerArrayList(int length){
        item = new Integer[length];
        numItem = 0;
    }
    @Override
    public void add(int i, Integer x) {
        if(numItem >= item.length){
            System.out.println("overflow");
            return;
        }
        for(int j = numItem - 1; j >= i; j--){
            item[j+1] = item[j];
        }
        item[i] = x;
        numItem++;
    }

    @Override
    public void append(Integer x) {
        if(numItem >= item.length){
            System.out.println("overflow");
            return;
        }

        item[numItem++] = x;
    }

    @Override
    public Integer remove(int i) {
        if(isEmpty() || i<0 || i > numItem - 1) {
            System.out.println("underflow");
            return null;
        }
        Integer temp = item[i];
        for(int j=i; j<=numItem-2; j++){
            item[j] = item[j+1];
        }
        numItem--;
        return temp;
    }

    @Override
    public boolean removeItem(Integer x) {
        for(int i = 0; i<numItem; i++){
            if(item[i] == x){
                for(int j=i; j<=numItem-2; j++){
                    item[j] = item[j+1];
                }
                numItem--;
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer get(int i) {
        if(i>=0 && i < numItem) {
            return item[i];
        }
        return null;
    }

    @Override
    public void set(int i, Integer x) {
        if(i>=0 && i < numItem) {
            item[i] = x;
        } else {
            System.out.println("Out of Length");
        }
    }

    @Override
    public int indexOf(Integer x) {
        for(int i = 0; i<numItem; i++) {
            if (item[i] == x) {
                return x;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return numItem;
    }

    @Override
    public boolean isEmpty() {
        return numItem == 0;
    }

    @Override
    public void clear() {
        item = new Integer[item.length];
        numItem = 0;
    }
}
