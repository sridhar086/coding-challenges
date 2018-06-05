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
class Solution
{
    /*ice cream change problem 
    The cost of each icecream is 5$
    There are three bills given to a shop owner $5 $10 and $20 
    with 0$ in hand 
    can you sell all customers? served in order    
    */
    public static boolean icecreamchange(int[] st)
    {
        int i5 = 0;
        int i10 = 0;
        int i20 = 0;
        for(int i:st)
        {
            if(i == 5)
            {
                i5++;
            }
            else if (i==10)
            {
                if (i5!=0)
                {
                    i10++;
                    i5--;
                }
                else
                {
                    return false;
                }
            }
            else if (i==20)
            {
                if(i10 !=0 && i5 !=0)
                {
                    i10--;
                    i5--;
                    i20++;
                }
                else if (i10 ==0 && i5 >1)
                {
                    i5 = i5-2;
                    i20++;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
        
    }
}
public class Icecreamchangeproblem {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] change = {5,5,10,10,5,10,5,20};
        System.out.println(Solution.icecreamchange(change));
    }
    
}
