public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This is my list:");
        LinkedList myList = new LinkedList();
        myList.insert(5);
        myList.insert(45);
        myList.insert(12);
        myList.insertAtStart(25);
        myList.insertAt(2,55);
        myList.deleteAt(3);
        myList.show();
    }
}
