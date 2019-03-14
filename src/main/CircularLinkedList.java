package main;

public class CircularLinkedList
    {
        Node head= null;
         Node tail = null;
         int size =0;
        class Node {
            int data;
            Node next;
            public Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }

            public int getData() {
                return data;
            }

            public void setData(int data) {
                this.data = data;
            }

            public Node getNext() {
                return next;
            }

            public void setNext(Node next) {
                this.next = next;
            }

            public Node(int data) {
                this.data = data;
            }

        }
        public void addNodeToHead(int data)
        {
            Node n = new Node(data);
            if(size == 0)  {
                head= n ;
                tail = n;
                n.next=head;
            } else {
                Node temp = head;
                n.next = temp;
                head = n;
                tail.next= head;
            }
            size++;
        }

        public void print() {
            if(size == 0) {
                System.out.println("List is Empty");
            }
            else
            {
                Node temp = head;
                do {
                    System.out.println(" " + temp.data);
                    temp =temp.next;
                }
                while(temp != head);
                System.out.println("");
            }
        }

        public static void main(String[] args)
        {
        CircularLinkedList linkedList = new CircularLinkedList();
            for (int i = 0; i < 5; i++)
            {
            linkedList.print();
            }
        }
    }
