package Lecture_18;

public class BinaryTreeGeneric {

    public Node root;

    public void insert(String value, char... dirs) {
        this.root = insert(root, value, dirs, 0);
    }

     public void inorder11(Node node){
        if(node==null){
            return;
        }
         inorder11(node.left);
         System.out.println(node.value);
         inorder11(node.right);
     }
    public void preorder1(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value);
        preorder1(node.left);
        preorder1(node.right);
    }
    public void postorder1(Node node){
        if(node==null){
            return;
        }

        postorder1(node.left);
        postorder1(node.right);
        System.out.println(node.value);
    }


    public int depth(Node node){
        if(node==null){
            return 0;
        }
        return Math.max(depth(node.left),depth(node.right));

    }


    public int diameter1(Node node){
        if(node==null){
            return 0;
        }
        int max=depth(node.left)+depth(node.right) + 1;
    int left=diameter1(node.left);
    int right=diameter1(node.right);

    return Math.max(max,Math.max(left,right));
    }

    public Node insert(Node node, String value, char[] dirs, int index) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (dirs[index] == 'l') {
            node.left = insert(node.left, value, dirs, index + 1);
        }
        else {
            node.right = insert(node.right, value, dirs, index + 1);
        }

        return node;
    }

    public void print() {
        print(root, "", "root");
    }

    public void print(Node node, String indent, String type) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.value + " " + type);
        print(node.left, indent + "\t", "left");
        print(node.right, indent + "\t", "right");
    }

    public String max() {
        return max(root);
    }

    public String max(Node node) {
        if (node == null) {
            return null;
        }

        String max = node.value;

        String left = max(node.left);
        String right = max(node.right);

        if (left != null && left.compareTo(max) > 0) {
            max = left;
        }

        if (right != null && right.compareTo(max) > 0) {
            max = right;
        }

        return max;
    }

        public class Node {
        String value;
        Node left;
        Node right;

        public Node(String value) {
            this.value = value;
        }
    }

}
