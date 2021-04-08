public class BinarySearchTreeMain {
    public static void main(String[] args) {
        Node root = new Node(50);
        Node n1 = new Node(40);
        Node n2 = new Node(60);
        Node n3 = new Node(70);
        Node n4 = new Node(65);
        Node n5 = new Node(80);

        BinarySearchTree.insert(null, root);
        BinarySearchTree.insert(root, n1);
        BinarySearchTree.insert(root, n2);
        BinarySearchTree.insert(root,n3);
        BinarySearchTree.insert(root,n4);
        BinarySearchTree.insert(root,n5);
        BinarySearchTree.InOrder(root);
        System.out.println(BinarySearchTree.Search(root,n3));



    }
}
