package Lecture_18;
public class TreeClientGeneric {

    public static void main(String[] args) {
        BinaryTreeGeneric tree = new BinaryTreeGeneric();

        tree.insert("10");
        tree.insert("20", 'l');
        tree.insert("25", 'r');
        tree.insert("30", 'l', 'r');
        tree.insert("40", 'r', 'r');

        tree.insert("35", 'l', 'r', 'r');

        tree.print();

        //System.out.println(tree.max());

    }
}