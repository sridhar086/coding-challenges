/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author sridhar
 */

// Binary Tree to doubly linked list using recursion and O(1) space complexity
//Sample binary tree chosen here

/*
                                                10
                                            /        \
                                        12              15
                                      /    \           / 
                                    25      30        36
                                          /             \
                                         8               244
                                       /   \
                                      5     1

*/


class Node
{
    int data;
    Node left, right;
  
    Node(int item) 
    {
        data = item;
        left = right = null;
    }
}

class BinaryTree
{
    static Node root;
    static Node head;
    static int flag = 0;
    
    Node btree2dll(Node node)
    {
        try{

        Node carry = null;
        if (node.left != null)
        {            
            Node left_returned = btree2dll(node.left);
            if(flag == 0)
            {head = left_returned;flag=1;}            
            left_returned.right = node;
            node.left = left_returned;            
            carry = node;

        }
        if (node.right != null)
        {         
            Node temp = btree2dll(node.right);
            Node right_returned = temp;
            Node attach;
            while(true)
            {
                //System.out.println("in here "+temp.data);
                if(temp.left == null)
                {
                attach = temp;break;
                }
                else if (temp.left.left == null)
                {
                    attach = temp.left;                    
                    break;
                }
                else{temp = temp.left;}                
            }
            //System.out.println("***");
            node.right = attach;
            attach.left = node;
            carry = right_returned;
        }
        if(node.right!=null || node.left!=null){return carry;}

        
    }catch(Exception e){System.out.println("Exception here "+e.toString());}
        return node;
    }           
            
}
public class Trees {

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(12);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(25);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(36);
        tree.root.right.left.right = new Node(244);
        tree.root.left.right.left = new Node(8);
        tree.root.left.right.left.left = new Node(5);
        tree.root.left.right.left.right = new Node(1);
        tree.btree2dll(tree.root);
        try{
        while(true)
        {
            System.out.print(BinaryTree.head.data+" ");            
            BinaryTree.head = BinaryTree.head.right;
            if(BinaryTree.head == null){break;}
            
        }}catch(Exception e){System.out.println("exception while printing "+e.toString());}
        
    }


    
}
