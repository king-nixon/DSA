import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int l = arr[0];
        for(int i = 1 ; i< arr.length;i++)
        {
            if(arr[i]>l)
            {
                l = arr[i];
            }
        }

          return l;

    }
}
