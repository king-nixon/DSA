class Solution {
    public int missingNumber(int[] nums) {
        int num = nums.length;
        int sum = 0;
        int miss = 0;
        for( int i =0 ; i< num; i++)
        {
             sum+=nums[i];
        }

        miss = num*(num+1)/2;
         return miss - sum;


        
    }
}
