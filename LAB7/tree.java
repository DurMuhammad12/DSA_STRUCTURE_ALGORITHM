class Node{
String data;
Node child[];
int childcount;
Node(String s,int nochild){
this.data=s;
this.child=new Node[nochild];
this.childcount=0;
}
public void addchild(Node node){
if(childcount<child.length){
child[childcount++]=node;
System.out.println("Node added");
}else{

System.out.print("Node is full");
}
}
public void display(){
System.out.println(this.data);
for(int i=0; i<child.length; i++){
if(child[i]!=null){
System.out.print("Child of : "+ this.data + " is ");
child[i].display();
}
}}

}
class SimpleTree{
Node root;
SimpleTree(String s,int nochild){
root=new Node(s,nochild);
}


public static void main(String args[]){
SimpleTree A=new SimpleTree("A",2);
Node B=new Node("B",30);
Node C=new Node("C",20);
Node D=new Node("D",200);
Node E=new Node("E",200);
Node F=new Node("F",2);
A.root.addchild(B);
A.root.addchild(C);
B.addchild(D); 
B.addchild(E);
B.addchild(F);
A.root.display();
}

}