package LIST;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @org.junit.jupiter.api.Test
    void test_addToHead() {
        List list= new List();
        list.addToHead(10);
        assertEquals(10,list.getFromHead());
    }

    @org.junit.jupiter.api.Test
    void test_deleteFromHead() {
        List list= new List();
        list.addToHead(10);
        list.addToHead(20);
        list.deleteFromHead();
        assertEquals(10,list.getFromHead());
    }

    @org.junit.jupiter.api.Test
    void test_getFromHead() {
        List list = new List();
        list.addToHead(50);
        assertEquals(50,list.getFromHead());
    }

    @org.junit.jupiter.api.Test
    void test_getTail() {
        List list = new List();
        list.addToHead(50);
        list.addToHead(10);
        assertEquals(50,list.getTail().data);
    }

    @org.junit.jupiter.api.Test
    void test_addToEnd() {
        List list = new List();
        list.addToEnd(100);
        //list.addToEnd(200);
        assertEquals(100,list.getTail().data);
    }

    @org.junit.jupiter.api.Test
    void test_deleteFromEnd() {
        List list = new List();
        list.addToEnd(50);
        list.addToEnd(20);
        list.deleteFromEnd();
        assertEquals(50,list.getTail().data);
    }

    @org.junit.jupiter.api.Test
    void test_find_elem() {
        List list = new List();
        list.addToEnd(50);
        list.addToEnd(20);
        list.addToEnd(30);
        assertEquals(-1,list.find_elem(70));
        assertEquals(1,list.find_elem(20));
    }
}