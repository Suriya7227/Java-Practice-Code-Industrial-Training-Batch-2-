import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        String str=sc.nextLine();
        String result="";
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                s.push(ch[i]);
            }
            else{
                if(s.isEmpty()){
                    result="Not balanced";
                    break;
                }
                char top=s.pop();
                if(ch[i]==')'&&top!='('){
                    result="Not balanced";
                    break;
                }
            }
        }
        if(s.isEmpty()){
            result="Balanced";
        }
       System.out.println(result); 
    }
}
class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Stack{
    Node top;
    Stack(){
        this.top=null;
    }
    void push(int val){
        Node n=new Node(val);
        n.next=top;
        top=n;
    }
    int pop(){
        if(top!=null) {
            int t=top.data;
            top=top.next;
            return t;
        }
        return -1;
    }

int peek(){
    if(top!=null) {
            int t=top.data;
            return t;
        }
        return -1;
}
boolean isEmpty(){
    return top==null;
}
void display() { 
    Node temp=top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
}
}