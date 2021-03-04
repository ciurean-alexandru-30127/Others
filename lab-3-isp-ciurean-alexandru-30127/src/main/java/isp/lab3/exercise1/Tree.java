package isp.lab3.exercise1;

public class Tree {
    private int height;

    /**
     * This constructor should initialize the height to 15;
     *
     */

    public Tree() {
        this.height = 15;
    }

    /**
     * This method should return the height of the tree
     *
     */

    public int getHeight() {
        return this.height;
    }

    /**
     * This method should add to the current height the meters given as long as meters >= 1
     *
     * @param meters represent the meters of the tree;
     */

    public void grow(int meters) {
        if (meters >= 1) {
            this.height += meters;
        }
    }


    /**
     *
     * @return the height of the tree;
     */

    public String toString() {
        return "" + height;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        String result = tree.toString();
        tree.grow(6);
        int height = tree.getHeight();
        System.out.println("The result of method tostring is " + result);
        System.out.println("The height of tree is " + height);
    }

}
