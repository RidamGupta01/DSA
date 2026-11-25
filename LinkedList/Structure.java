package LinkedList;

public class Structure {
    // To store data and pointers we create "Node" class.
    class Node{
        String data;
        Node next;          //Pointer

        // Constructor of the "Node" class.
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        // Create the object of the class.
        Structure list = new Structure();
    }
}
