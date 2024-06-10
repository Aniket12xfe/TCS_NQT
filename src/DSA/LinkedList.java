package DSA;

public class LinkedList {
    private Node Head;
    public LinkedList(){
        this.Head = null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if (Head == null){
            Head = newNode;
        }
        else {
            Node current = Head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added "+data+" to the list.");
    }

    public void remove(int data){
        if (Head == null){
            System.out.println("List is empty. Cannot remove.");
            return;
        }
        if (Head.data == data){
            Head = Head.next;
            System.out.println("Removed "+data+" from the list.");
        }

        Node current = Head;
        Node previous = null;
        while (current != null && current.data != data){
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println(data + " not found in the list.");
        } else {
            previous.next = current.next;
            System.out.println("Removed " + data + " from the list.");
        }
    }

    public boolean search(int data) {
        Node current = Head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printList() {
        Node current = Head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int size() {
        int count = 0;
        Node current = Head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean isEmpty(){
        return Head == null;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        list.printList();

        System.out.println("List contains 20: " + list.search(20));
        System.out.println("List contains 40: " + list.search(40));

        list.remove(20);
        list.printList();

        list.remove(40); // Trying to remove a non-existent element

        System.out.println("List size: " + list.size());
        System.out.println("Is list empty: " + list.isEmpty());
    }
}
