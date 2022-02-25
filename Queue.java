package AS02;

/**
 * create queue class
 * include methods: push, pop, check empty, toString
 */

public class Queue implements IStackQueue{

    Node head;
    Node tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    // push node
    @Override
    public void push(Product infor) {
        Node newNode = new Node(infor);
        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }

    }

    //pop node
    @Override
    public void pop() {
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        if (head == tail){
            head = null;
            tail = null;
        } else {
            head = head.getNext();
        }
    }


    //check queue empty or not
    @Override
    public boolean isEmpty() {
        return (head == null) && (tail == null);
    }

    // String queue
    @Override
    public String toString(){
        if(isEmpty()) System.out.println("No have data");
        String result = "";
        Node current = this.head;
        while (current != null){
            result += current + "\n";
            current = current.getNext();
        }
        return result;
    }
}
