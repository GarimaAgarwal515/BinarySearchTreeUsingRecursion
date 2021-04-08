public class BinarySearchTree {
    public static Node insert(Node root, Node new_node) {
        if (root == null) {
            root = new_node;
            return root;
        }
        if (root.data > new_node.data) {
            if (root.left == null) {
                root.left = new_node;
            } else {
                insert(root.left, new_node);
            }
        } else if (root.data < new_node.data) {
            if (root.right == null) {
                root.right = new_node;
            } else {
                insert(root.right, new_node);
            }
        }
        return root;
    }

public static void InOrder(Node root){
    if(root==null) {
        return;
    }
    InOrder(root.left);
    System.out.println(root.data);
    InOrder(root.right);


    }
    public static boolean Search(Node root, Node search_node){
        if(root==null){
            return false;
        }
        if(root.data==search_node.data){
            return true;
        }
        Boolean result = false;
        if(root.data>search_node.data){
            result = Search(root.left, search_node);
        }
        if(root.data<search_node.data){
            result=Search(root.right,search_node);
        }
        return result;
    }
}




