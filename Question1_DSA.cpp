#include <iostream>
using namespace std;

class Node{
public:
  int data;
  Node* next;
  
  Node(int value){
      data=value;
      next=NULL;
  }
}; 
  
 class list{
    Node* head;
    Node* tail;
 
    public:
  list(){
      head=tail=NULL;
  }
  
public:
  list(){
      head=tail=NULL;
  }

    void push_front(int value){
    Node* newnode = new Node(value);
    if(head==NULL){
        head=tail=newnode;
        return;
    }
    else{
        newnode->next = head;
        head=newnode;
    }
};
};


int main() {
    list ll;
    ll.push_front(2);
    ll.push_front(3);
    ll.push_front(4);
    ll.push_front(5);
}