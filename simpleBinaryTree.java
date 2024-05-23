public class simpleBinaryTree {
    class Node{
        int data;
        Node left, right;
        public Node(int item){
            data = item;
            left = right = null;
        }
    }

    class binaryTree{
        Node root;
        public binaryTree(){
            root = null;
        }

        void printLevelOrder(){
            int h = height(root);
            int i;
            for(i=1; i<=h; i++){
                printCurrentLevel(root, i);
            }
        }

        int height(Node root){
            if(root == null){
                return 0;
            }
            else {
                int lheight = height(root.left);
                int rheight = height(root.right);

                if(lheight > rheight){
                    return (lheight+1);
                }
                else 
                    return (rheight+1);
            }
        }

        void printCurrentLevel(Node root, int level){
            if(root == null)
                return; 
            if(level == 1)
                System.out.println(root.data + " ");
            else if(level > 1){
                printCurrentLevel(root.left, level-1);
                printCurrentLevel(root.right, level-1);
            }
        }
        static simpleBinaryTree sp = new simpleBinaryTree();
        public static void main(String args[]){
            binaryTree tree = sp.new binaryTree();
            tree.root = sp.new Node(1);
            tree.root.left = sp.new Node(2);
            tree.root.right = sp.new Node(3);
            tree.root.left.left = sp.new Node(4);
            tree.root.left.right = sp.new Node(5);

            System.out.println("Level order traversal of"
                           + "binary tree is ");
        tree.printLevelOrder();
        }
    }

}
