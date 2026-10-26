class Print_subarrays_with_max_sum{
    public static void printSubarraysWithMaxSum(int arr[]){
        int maxele=Integer.MIN_VALUE;
        int sum=0;
        int ansStart=0,ansEnd=0;
        int start=0;

        for(int i=0;i<arr.length;i++){
            if(sum==0){
                start=i;
            }

            sum+=arr[i];
            if(sum>maxele){
                maxele=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0){
                sum=0;
            }   
        }
        for(int i=ansStart;i<=ansEnd;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
            int[] arr={-2,-3,4,-1,-2,5,-3};
            printSubarraysWithMaxSum(arr);
    }  
}