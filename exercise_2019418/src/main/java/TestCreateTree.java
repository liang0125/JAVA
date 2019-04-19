import java.util.Arrays;

/**
 * Author:lorrie
 * Create:2019/4/18
 */
class RV{
    Node node;
    int used;
    public RV(Node node,int used){
        this.node=node;
        this.used=used;
    }
}
class Node{
    char value;
    Node left;
    Node right;
    public Node(char value){
        this.value=value;
    }
}
public class TestCreateTree {
    /*
        根据先序遍历创建带有空结点的二叉树
     */
   public static RV createTree(char[] preOrder){
        if (preOrder.length==0){
            return new RV(null,0);
        }

        //根节点
        char rootValue=preOrder[0];
        if(rootValue=='#'){
            return new RV(null,1);
        }
        Node root=new Node(rootValue);

        //左子树
        char[] leftPreOrder=new char[preOrder.length-1];
        leftPreOrder=Arrays.copyOfRange(preOrder,1,preOrder.length);
        RV leftValue=createTree(leftPreOrder);
        root.left=leftValue.node;

        //右子树
       char[] rightPreOrder=new char[preOrder.length-1-leftValue.used];
       rightPreOrder=Arrays.copyOfRange(preOrder,1+leftValue.used,preOrder.length);
       RV rightValue=createTree(rightPreOrder);
       root.right=rightValue.node;

       return new RV(root,1+leftValue.used+rightValue.used);
    }

    public static void main(String[] args) {
        char[] inOrder={'C','D','B','A','E'};
        char[] postOrder={'D','C','B','E','A'};
        Node root=createBTP_I(postOrder,inOrder);
        System.out.println("yes");


    }

    public static int find(char[] arr,char c){
       for (int i=0;i<arr.length;i++){
           if (arr[i]==c){
               return i;
           }
       }
       return -1;
    }
    //根据后序遍历和中序遍历创建二叉树
    public static Node createBTP_I(char[] postOrder,char[] inOrder){
       if (postOrder.length==0||inOrder.length==0){
           return null;
       }
       char post=postOrder[postOrder.length-1];
       int index=find(inOrder,post);
       if (index==-1){
           return null;
       }
       Node root=new Node(post);

       //左子树
       char[] leftPost=Arrays.copyOfRange(postOrder,0,index);
       char[] leftIn=Arrays.copyOfRange(inOrder,0,index);
        root.left=createBTP_I(leftPost,leftIn);


       //右子树
       char[] rightPost=Arrays.copyOfRange(postOrder,index,postOrder.length-1);
       char[] rightIn=Arrays.copyOfRange(inOrder,index+1,inOrder.length);
       root.right=createBTP_I(rightPost,rightIn);

       return root;
    }
}
