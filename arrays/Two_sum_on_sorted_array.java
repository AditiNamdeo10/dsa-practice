class Two_sum_on_sorted_array{
    public static int[] twoSum(int arr[],int target){
        int n =arr.length;
        int left=0;
        int right=n-1;

        while(left<right){
            if(arr[left]+arr[right]==target){
                return new int[] {arr[left],arr[right]};
            }
            else if(arr[left]+arr[right] < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[] {-1};

    }
    public static void main(String[] args){
        int[] arr={2,3,4,5,6,7,8};
        int [] result=twoSum(arr,9);
        for(int i=0; i<2; i++){
            System.out.println(result[i]);
        }
    }
}

//Output : (for target= 9)
// 2
// 7