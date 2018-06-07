/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floydslinkedlistalgorithm;

/**
 *
 * @author sridhar
 */

 //Implementing floyds algorithm to find if there is a loop in a singly linked list
 //Have two pointers. One pointer strides one node at a time and other strides two nodes at a time
 //At any point if nodes touches same point then there is a loop
 
 
// Linked List Class

    class Node
    {
        int data;
        Node next;
          
        // Constructor to create a new node
        Node(int d) 
        {data = d; next = null;}
        public void Next(Node n)
        {next = n;}
    }  



public class floyds {
    
    /* This function is in LinkedList class. Inserts a
   new Node at front of the list. This method is 
   defined inside LinkedList class shown above */
    
    
    public static void main()
    {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        n1.Next(n2);
        n2.Next(n3);
        n3.Next(n4);
        n4.Next(n5);
        n5.Next(n2);
        
        Node ptr1 = n1;
        Node ptr2 = n1;
        while(true)
        {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            if (ptr1 == ptr2)
            {
                //System.out.println("ptr1 val "+ptr1.data+" ptr2 val "+ptr2.data);
                System.out.println("Detected loop");
                break;
            }           
        }
        
    }


    
}
