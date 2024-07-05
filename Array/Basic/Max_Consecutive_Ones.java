import java.util.* ;
import java.io.*; 
public class Solution {
	public static int consecutiveOnes(int n, int[] arr) {
		// Write your code here.

		 int cnt = 0;
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }

            maxi = Math.max(maxi, cnt);
        }
        return maxi;

	}
}
