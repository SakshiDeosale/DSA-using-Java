package Link_List;

public class demo {
    public static class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        //step 1:create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
             head = tail = newNode;
             return;
        }

        //step2 : newNode next =head
        newNode.next = head;

        //step 3:head = newNode
        head = newNode;
    }


    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx-1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return -1;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return -1;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key){
         if(head == null){
            return -1;
         }
         if(head.data == key){
            return 0;
         }
         int idx = helper(head.next, key);
         if(idx == -1){
            return -1;
         }

         return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void RemoveNthNodeEnd(int n){
        int sz = 0;
        Node temp = head;

        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(sz == n){
            head = head.next; //removing from end beacause of that sz= n is the head
            return;
        }

        int i = 1;
        int iToFind = sz-n;
        Node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        demo l1 = new demo();
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(3);
        l1.addLast(4);
        l1.add(2,5);
        l1.print();
        System.out.println("size="+l1.size);
       // System.out.println(l1.removeFirst());
        System.out.println("Key found at:"+l1.itrSearch(3));
        System.out.println("Key found at:"+l1.recSearch(4));
        l1.reverse();;
        l1.print();
        l1.RemoveNthNodeEnd(2);
        l1.print();
    }
}
