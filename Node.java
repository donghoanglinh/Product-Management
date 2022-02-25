package AS02;

/**
 * create node to contain data and next
 */
public class Node {
    Product infor;
    Node next;

    public Node(){}

    public Node(Product infor, Node next) {
        this.infor = infor;
        this.next = next;
    }

    public Node(Product infor) {
        this.infor = infor;
        this.next = null;
    }

    //getter
    public Product getInfor() {
        return infor;
    }

    public Node getNext() {
        return next;
    }

    //setter
    public void setInfor(Product infor) {
        this.infor = infor;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    //to String node
    @Override
    public String toString() {
        return infor.getId() + " - " + infor.getName() + " - " + infor.getPrice() + " - " + infor.getQuantity();
    }
}
