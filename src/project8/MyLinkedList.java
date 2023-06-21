package project8;

public class MyLinkedList {
        String value = null;
        MyLinkedList next = null;
        MyLinkedList() {
// do nothing
        }
        MyLinkedList(String headvalue) {
            value = headvalue;
        }
        void addToLast(String newvalue) {
            if (next == null) {
                next = new MyLinkedList(newvalue);
            } else {
                next.addToLast(newvalue);
            }
        }
        void printAllNodes() {
            if (value != null) {
                System.out.println(value);
            }
            if (next != null) {
                next.printAllNodes();
            }
        }

    /**
     * Progress 1
     * @param value
     * @return
     */
    public int indexOf(String value){
            return indexOf(value, -1);
    }
    private int indexOf(String value, int count){
        return value.equals(this.value) ? count : next != null ? next.indexOf(value, count + 1) : -1;
    }

    /**
     * Progress 2
     * @param value
     * @return
     */
    public boolean contains(String value){
            return indexOf(value) != -1;
    }

    /**
     * Progress 3
     * @param value
     * @return
     */
    public MyLinkedList search(String value){
        return value.equals(this.value) ? this : next != null ? next.search(value) : null;
    }

    /**
     * Progress 4
     * @param value
     */
    public void insertNext(String value){
        if(next != null){
            MyLinkedList nextTemp = next;
            next = new MyLinkedList(value);
            next.next = nextTemp;
        }else {
            next = new MyLinkedList(value);
        }
    }
    public void insertAfter(String key, String newValue){
        search(key).insertNext(newValue);
    }
}
