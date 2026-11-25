package LinkedList;
    
public class Deletion  {
    Node head;
    private int size;

    Deletion(){
        this.size = 0;
    }   
      class Node{
        String data;
        Node next;          //Pointer

        // Constructor of the "Node" class.
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }


    // We can add data in linked list in 2 types->
    // 1-> Addition in front.

    public void addFront(String data){
        Node newNode = new Node(data);          // Create a new Node and pass the data
        if(head == null){
            head = newNode;
            return;
        }
        // If list already exist
        newNode.next = head;
        head = newNode;
    }

    // 2->  Addition from last.
    public void addLast(String data){
        Node newNode = new Node(data);      // Create a new Node.
        if(head == null){
            head = newNode;
            return;
        }
        // If the list already exist.
        Node currNode = head;
        while(currNode.next != null){               //Traverse till head.next != null
            currNode = currNode.next;               // Update the currr pointer to its next.
        }
        // When reach in lastNode
        currNode.next = newNode;
    }
    
    // To display the data
    public void printList() {
        if(head == null){                   //If the list is empty print list is empty.
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){               //Traverse till currNode is not equal null.
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // Deletion of the node from the linked list.
    // 1-> Deletion from front.
    public void deleteFront(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // 2-> Deletion from last.
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){               //If there is only one node in the list.
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){               //head.next != null means there is only one node in the list.   
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        // Create the object of the class.
        Deletion list = new Deletion();
        list.addFront("a");
        list.addFront("is");
        list.printList();

        list.addLast("Linked");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFront("this");
        list.printList();

        list.deleteFront();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

        list.addFront("Front");
        list.printList();

        System.out.println(list.getSize());
        
    }
}

