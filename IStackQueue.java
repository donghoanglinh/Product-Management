package AS02;

/**
 * interface for stack and queue
 */
public interface IStackQueue {

    // add node
    public void push(Product infor);

    // remove node
    public void pop();

    //check it's empty
    public boolean isEmpty();

    //to String
    public String toString();


}
