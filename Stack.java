package AS02;

/**
 * create stack class
 * include methods: push, pop, check empty, toString
 */
public class Stack implements IStackQueue{

    Node head;

    public Stack() {
        head = null;
    }

    // push node
    @Override
    public void push(Product infor) {
        Node newNode = new Node(infor);
        newNode.setNext(head);
        this.head = newNode;
    }

    // pop node
    @Override
    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            this.head = this.head.getNext();
        }
    }

    //check stack empty or not
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    //String stack
    @Override
    public String toString() {
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
