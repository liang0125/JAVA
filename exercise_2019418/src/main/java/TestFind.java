/**
 * Author:lorrie
 * Create:2019/4/18
 */
class Nodes{
    char value;
    Nodes left;
    Nodes right;
}

public class TestFind {
    /*
    再二叉树中查找一个value，找到了返回节点，找不到返回null
     */
    public static Nodes findValue(Nodes root,char v){
        if (root==null){
            return null;
        }
        if (root.value==v){
            return root;
        }
        if (root.left!=null) {
         Nodes leftNode=findValue(root.left, v);

             return leftNode;
        }
        return findValue(root.right,v);

    }
}
