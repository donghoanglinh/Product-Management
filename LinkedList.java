package AS02;

import java.util.Scanner;

public class LinkedList {
    Node head;
    Node tail;

    // add new Node into list
    public void insertAtTail(Product infor){
        Node newNode = new Node(infor);
        if (this.head == null){
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        if (this.tail != null){
            this.tail.setNext(newNode);
            this.tail = newNode;
        }

    }

    public boolean isEmpty(){
        return this.head == null;
    }
    //define string for list
    @Override
    public String toString() {
        if(lengthList() == 0) System.out.println("No have data");
        String result = "";
        Node current = this.head;
        while (current != null){
            result += current + "\n";
            current = current.getNext();
        }
        return result;
    }

    //find node follow id
    public void search(String id){
        Node current = this.head;
        int i = -1;
        while(current != null) {
            if (current.getInfor().getId().equalsIgnoreCase(id)) {
                i = 0;
                System.out.println("information of product: ");
                System.out.println(current);
            }
            current = current.getNext();
        }
        if (i == -1){
        System.out.println("No have data for this id: " + id);
        }
    }

    //calculate length of list
    public int lengthList(){
        Node current = this.head;
        int length = 0;
        while(current != null){
            length++;
            current = current.getNext();
        }
        return length;
    }
    //remove node follow id
    public void removeNode(String id) {

        int i = -1;
        Node current = this.head;
        Node nextNode = head.getNext();

        // check list null or not
        if (lengthList() == 0) System.out.println("No have data");

        // remove node in list which only have 1 node
        if (lengthList() == 1) {
            if (current.getInfor().getId().equalsIgnoreCase(id)) {
                this.head = null;
                this.tail = null;
            }
        }

        //remove node in list which more than 1 node
        if (lengthList() > 1) {

            //remove first node
            if (current.getInfor().getId().equalsIgnoreCase(id)) {
                this.head = nextNode;
                return;
            }

            // remove after first node
            while (nextNode != null) {
                if (nextNode.getInfor().getId().equalsIgnoreCase(id)) {
                    i = 0;
                    current.setNext(nextNode.getNext());
                    if (current.getNext() == null){
                        this.tail = current;
                    }
                    return;
                }
            }
            if (i == -1) {
                System.out.print("No have data for this id: " + id);
            }
        }
    }

    // sort Linked list
    public void sortList(){

        if(lengthList() == 0){
            System.out.println("No have data");
        } else {
            Node current = this.head;
            while (current != null){
                Node nextIndex = current.getNext();
                while (nextIndex != null){
                    if (current.getInfor().getId().compareTo(nextIndex.getInfor().getId()) > 0){
                        Product temp = current.getInfor();
                        current.setInfor(nextIndex.getInfor());
                        nextIndex.setInfor(temp);
                    }
                    nextIndex = nextIndex.getNext();
                }
                current = current.getNext();
            }
        }
    }
}
