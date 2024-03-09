package trees;

public  class InOrderTraversal {

    static class Node {
        int key ;
        Node left ;
        Node right ;

        Node (int key){
            this.key = key  ;
            this.left = null;
            this.right = null ;
        }
    }
    static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }

    static void preOrder(Node root){
        if(root!=null){
            System.out.print(root.key + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key + " ");
        }
    }


    static int heightOfBST(Node root){
        if(root == null){
            return  0 ;
        }else {
            return (Math.max(heightOfBST(root.left), heightOfBST(root.right)) +1);
        }
    }
    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.left.right.left = new Node(70);
        root.left.right.right = new Node(80);

        root.right.right = new Node(60);

        System.out.println("InOrder");
        inOrder(root);

        System.out.println("\n");


        System.out.println("PreOrder");
        preOrder(root);

        System.out.println("\n");


        System.out.println("PostOrder");
        postOrder(root);

        System.out.println("\n");

        System.out.println("Height of the BST");
        System.out.println(heightOfBST(root));

    }
}
