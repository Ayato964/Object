package project8;

public class LinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addToLast("banana");
        list.addToLast("apple");
        list.addToLast("orange");
        list.insertAfter("apple", "temp");
        list.printAllNodes();
    }
}