/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changeproblems;

/**
 *
 * @author sridhar
 */
public class InMemoryOrdering 
{    
    /*Question There are 2 sorted arrays A and B. 
    B contains k elements
    A contains n elements + k empty spaces
    Idea is to arrange both of them in place in array A    
    */
    static int[] orderarrays(int[] arr1, int arr1_elements, int[] arr2, int arr2_elements)
    {
        try{
        int p = arr1_elements-1;
        int q = arr2_elements-1;
        for(int i = arr1_elements+arr2_elements-1;i>=0;i--)
        {            
            if(p>=0 && arr1[p]>=arr2[q])
            {              
                arr1[i] = arr1[p];
                p = p-1;                
            }
            else if(q>=0)
            {
                arr1[i] = arr2[q];                
                q=q-1;
            }
        }
        }catch(Exception e)
        {//System.out.println("the exception is "+e.toString());            
        }
        return arr1;        
    }    
    public static void main(String[] args)
    {
        int[] arr1 = {1,4,6,0,0,0,0};
        int arr1_elements = 3;
        int[] arr2={2,3,5,7};
        int arr2_elements = 4;
        int[] fullarr = orderarrays(arr1,arr1_elements, arr2,arr2_elements);
        for(int i:fullarr)
        {
        System.out.print(i+" ");
        }
        
    }
    
}
