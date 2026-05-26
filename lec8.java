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


void rev(){
    Node curr=head;
    Node next=null;
    Node prev=null;
    while(curr!=null){
        next=curr.next;
curr.next=prev;
prev=curr;
curr=next;
    }
    head= prev;
}
void mid(){
    if(head==null){
        return ;
    }
    Node slow=head;
    Node fast=head;
    
     
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    System.out.println("mid val is : "+slow.data);
}

void detectcycle(){
    if(head==null){
        return ;
    }
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    
    if(slow==fast){
        System.out.println("detected");
        return;
    }
    }
      System.out.println("not detected");
}

void nthnode(){
    Node first=head;
    Node sec=head;
first=first.next.next;
while(first!=null){
    first=first.next;
    sec=sec.next;
}
System.out.println(sec.data);
}

void tar(){
    int key=5;
        Node curr=head;
        while(curr!=null){
            
            if(curr.data==key){
                System.out.println("present");
                return;
            }
            curr=curr.next;
        }
       
        System.out.println("not present");
}

void insertend(int data){
    Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return ;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
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
        list.insert(6);
        list.insert(7);
        list.insert(8);
        
// list.mid();
// list.detectcycle();
// list.nthnode();
// list.tar();
list.insertend(60);
//   list.rev();
    // list.insertatbeg(10);
        list.print();
          
    
       
}
}

