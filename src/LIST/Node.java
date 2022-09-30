package LIST;

/**
 *Class-list node
 */
public class Node {
    /**
     *field is an integer type variable
     * */
    public int data;
    /**
     * field is a variable of the class type
     */
    public Node next;
    public Node() {
        next=null;
    }
    /**
     * Constructor - creating a new node
     *  with the value that the user enters
     * @param _d - number
     */

    public Node(int _d) {
        this.data=_d;
        next=null;
    }
}