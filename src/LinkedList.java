public class LinkedList {
    Node head;

    void insert(int data) {
        Node node = new Node(data);


        if(head == null) { 
            head = node; // if no head node, make current node the head node
        } else {
            Node n = head;

            while(n.next != null) {
                n = n.next;
            }

            n.next = node;
        }
    }

    void insertAtStart(int data) {
        Node node = new Node(data);
        node.next = head; // point node to current head
        head = node; // set head to node
    }

    void insertAt(int index, int data) {
        Node node = new Node(data);
        Node n = head;

        for(int i=0;i<index-1;i++) {
            n = n.next; //travel node2node until get to the node before specified index
        }

        node.next = n.next; //new node points to original node
        n.next = node; //previous node points to new node
    }

    void deleteAt(int index) {
        if(index == 0) {
            head = head.next;
        } else {
            Node n = head;
            for(int i=0;i<index-1;i++) {
                n = n.next;
            }
            System.out.println("Deleted element '" + n.next.data + "' at index " + index);
            n.next = n.next.next;
        }
    }

    Node findMid() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //fast traverses list 2x faster, so when it's done, slow will be at length/2
        Node mid = slow;

        return mid;
    }

    void show() {
        Node n = head;

        while(n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data); // manually print data of last
    }
}
