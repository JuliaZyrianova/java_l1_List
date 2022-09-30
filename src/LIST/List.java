package LIST;

/**
 * Class- a singly linked list
 */
public class List {
    /**
     * the field is a variable of the "node" type
     * @see Node#Node(int)
     * */
    private Node head;
    /**
     * Constructor-creating an empty list
     */
    public List(){
        head=null;
    }
    /**
     *The function of checking the emptiness of the list
     * @return  true if the list is empty
     */
    private boolean isEmpty(){
        return head==null;
    }
    /**
     * Function of adding an item to the top of the list
     * @param tmp - number
     */
    public void addToHead(int tmp){
        Node p=new Node(tmp);
        p.next=head;
        head=p;
    }
    /**
     * The function of removing an item from the beginning of the list
     */
    public void deleteFromHead(){
        head=head.next;

    }

    /**
     * Function of taking an item from the head of the list
     * @return the number from the head of the list
     */
    public int getFromHead(){
        return head.data;
    }
    /**
     * Function of taking an item from the tail of the list
     * @return tail of the list
     */
    Node getTail() {
        Node p=head;
        while(p.next!=null)
            p=p.next;
        return p;
    }
    /**
     * Function of adding an item to the tail of the list
     */
    public void addToEnd(int elem) {
        if(head==null) addToHead(elem);
        else {
            Node pNode = getTail();
            Node p = new Node(elem);
            p.next = pNode.next;
            pNode.next = p;
        }
    }

    /**
     * The function of removing an item from the tail of the list
     */
    public void deleteFromEnd() {
        if(head.next==null) deleteFromHead();
        else {
            Node p = head;
            while (p.next.next != null) p = p.next;
            p.next = null;
        }
    }
    /**
     * The function of find elem which the user enters
     *  @param key - elem which the user want to find
     *  @return elements number int the list. If there is no element,return -1
     */
    public int find_elem(int key){
        Node p=head;
        int k=0;
        int number_on_list=-1;
        while(p!=null) {
            if (p.data == key)
                number_on_list = k;
            p=p.next;
            k++;
        }
        return number_on_list;
    }
    /**
     * List printing function
     */
    public void print(){
        Node p=head;
        while (p !=null) {
            System.out.println(p.data);
            p=p.next;
        }
    }
}

