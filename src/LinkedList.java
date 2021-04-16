

public class LinkedList {
    private Node head;
    private int numNodes;

   public LinkedList (Object data) {
       head = new Node(data) ;
   }
   private class Node{
       private Node next;
       private Object data;

       public Node (Object data) {
           this.data = data;
       }
       public Object getData() {
           return this.data;
       }
   }
    public void  add (int index , Object data){
       Node temp = head;

        for (int i = 0; i < index-1 && temp.next != null ; i++) {
            temp = temp.next;
        }

         temp.next = new Node(data);
        numNodes++;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        LinkedList a = new LinkedList(1);
        a.add(1,1);
        a.add(2,3);
        a.printList();
    }
}
