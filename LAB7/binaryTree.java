class BinaryTree{
  public static class node{
      int value;
      node left;
      node right;
     node(int value){
        this.value=value;
        this.left=null;
        this.right=null;
}
   }
   public node root;
     binarry(int value){
        root=new node(value);
}
public void addchild(node parent, node leftchild, node rightchild){
       if(parent!=null){
         if(leftchild!=null){
          parent.left=leftchild;
       }
        if(rightchild!=null){
          parent.right=rightchild;
      }
}
}
public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.value+" ");
        inorder(root.right);
    }
  public static void main (String [] args){
    binarry b1=new binarry(7);
    node leftchild = new node(46);
    node rightchild = new node(32);
   b1.addchild(b1.root, leftchild,rightchild);
   b1.inorder(b1.root);
}
}