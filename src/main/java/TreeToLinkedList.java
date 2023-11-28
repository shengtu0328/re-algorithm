public class TreeToLinkedList {


    public  TreeNode process(TreeNode treeNode){


        TreeNode left = treeNode.getLeft();
        TreeNode right = treeNode.getRight();
        treeNode.setRight(left);
        treeNode.setLeft(null);

        process(treeNode.getRight());
        process(right);


        TreeNode t = treeNode.getRight();
        while(treeNode!=null){
            t= t.getRight();
        }
        t.setRight(right);

        return null;

    }

}
