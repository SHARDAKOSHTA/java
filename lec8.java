import java.util.LinkedList;

import org.w3c.dom.Node;

public class lec8 {
 static class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
 static class LinkedList{
    Node head;
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }
    
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newNode;
}
void insertatbeg(int data){
    Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }
         newNode.next=head;
head=newNode;


}

void print(){
     Node temp=head;
     while(temp!=null){
        System.out.println(temp.data+" ");
        temp=temp.next;
     }
    }
}
public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insert(1);
     list.insert(2);
      list.insert(3);
       list.insert(4);
        list.insert(5);
    list.insertatbeg(10);
        list.print();
       
}
}

