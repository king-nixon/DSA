public class Solution {
    public static int getSingleElement(int []arr){
        // Write your code here.
         int a=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            a^=arr[i];
        }
       return a;
    }
}
