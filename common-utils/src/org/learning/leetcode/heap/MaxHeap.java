package org.learning.leetcode.heap;

public class MaxHeap{

    private int currentSize;
    private Node root;

    public MaxHeap(){
        root = new Node();
    }

    public void insert(int i) {
        Node item = new Node(i,null,null);
        Node parent = getInsertNodeParent(root);
        if(null == parent.left)
            parent.left = item;
        else
            parent.right = item;

        /*重置排序*/
    }

    public Node getInsertNodeParent(Node root){
        Node item = null;
        if(0 == root.value)item = root;
        if(null != root.left)
            item = getInsertNodeParent(root.left);
        if(null != root.right)
            item = getInsertNodeParent(root.right);

        return item;
    }

    public Node getLastNodeParent(Node root){
        Node item = null;
        if(0 == root.value)item = root;
        if(null != root.left){
            if(null != root.right)
                item = getLastNodeParent(root.right);
            item = getLastNodeParent(root.left);
        }
        return item;
    }

    public void MaxHeapSort(Node root){

    }

    class Node{
        int value;
        Node left;
        Node right;

        public Node(){}
        public Node(int value,Node left,Node right){
            this.value = value;
            this.left = left;
            this.right = right;
        }


    }



}
