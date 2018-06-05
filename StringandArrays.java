/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringandArrays;

import java.util.Arrays;

/**
 *
 * @author sridhar
 */

class Solution
{
    //Ques 1.1 Interview questions arrays and strings
    public static boolean unique_string(String str)
    {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        
        for(int i =0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
             return false;   
            }            
        }
        return true;
    }
    
    //Ques 1.3 
    public static boolean check_permutation(String str1, String str2)
    {
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);
        
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);
        if(arr1.length != arr2.length)
        {
            System.out.println("the array length is not same");
            return false;
        }
        for(int i =0;i<arr1.length;i++)
        {
            if (arr1[i] != arr2[i])
            {
                return false;
            }
        }       
        return true;
    }
    //Ques 1.4
    public static String addpercentage20(String str)
    {
        String st = str.trim();
        char[] arr = st.toCharArray();
        StringBuilder st1 = new StringBuilder();
        for(int i = 0;i<arr.length;i++)
        {            
            if(arr[i] == ' ')
            {
                st1.append("%20");
            }
            else
            {
                st1.append(arr[i]);                
            }
        }
        return st1.toString();
        
    }
    
    
}
        
public class StringandArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "asldfhjkl";
        //System.out.println(Solution.unique_string(str));
        String str1= "abcdfg";
        String str2 = "adfgbc";
        System.out.println(Solution.check_permutation(str1,str2));
        String space = "Mr. will smith    ";
        System.out.println(Solution.addpercentage20(space));
        
        
    }
    
}
