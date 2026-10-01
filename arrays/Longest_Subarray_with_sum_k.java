class Longest_Subarray_with_sum_k{
    public static int longestSubarrayWithSumK(int [] arr, long k){
        
        int left=0, right=0;
        long sum=arr[0];
        int n=arr.length;
        int maxLen=0;

        while(right<n){

            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }

            if(sum==k){
                maxLen=Math.max(maxLen, right - left + 1);
            }

            right++;
            if(right<n){
                sum+=arr[right];
            }
        }
        return maxLen;
    }

    public static void main(String[] args){

        int [] arr= {1,2,3,1,1,1,1,3,3};
        int k=6;

        int result=longestSubarrayWithSumK(arr,k);
        System.out.println(result);
    }
}