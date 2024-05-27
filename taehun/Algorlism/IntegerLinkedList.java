package Algorlism;

public class IntegerLinkedList implements IntegerListIF{
    int numItems;
    Node head;

    public IntegerLinkedList(){
        numItems = 0;
        head = null;
    }
    @Override
    public void add(int i, Integer x) {
        if(i > numItems){
            System.out.println("Invalid Index");
            return;
        }
        Node node = new Node(x);
        if(i == 0){
            node.next = head.next;
            head = node;
            numItems++;
        } else {
            Node prevNode = getNode(i-1);
            node.next = prevNode.next;
            prevNode.next = node;
        }
    }

    public Node getNode(int i){
        Node current = head;
        if(i==0){
            return head;
        }
        if( i < 0 || i >= numItems) {
            return null;
        }
        for(int j = 0; j< i; j++){
            current = current.next;
        }
        return current;
    }

    @Override
    public void append(Integer x) {
        add(numItems, x);
        numItems++;
    }

    @Override
    public Integer remove(int i) {
        if(i == 0){
            Node current = head.next;
            head.next = current.next;
            numItems--;
            return current.item;
        }
        Node prevNode = getNode(i-1);
        Node current = prevNode.next;
        prevNode.next = current.next;
        numItems--;
        return current.item;
    }

    @Override
    public boolean removeItem(Integer x) {
        int index = indexOf(x);
        if(index == -1){
            System.out.println("없어요");
            return false;
        }
        return true;
    }
    @Override
    public Integer get(int i){
        return -1;
    }

    @Override
    public void set(int i, Integer x) {
        
    }

    @Override
    public int indexOf(Integer x) {
        Node temp = head.next;
        for(int j = 0; j<numItems; j++){
            if(temp.item == x){
                return j;
            }
            temp = temp.next;
        }
        return -1;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public void clear() {

    }
}
