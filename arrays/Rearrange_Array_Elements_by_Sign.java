//Equal number oof negative and positive numbers in array

class Rearrange_Array_Elements_by_Sign{
    public static int[] rearrangeArrayElementsBySign(int arr[]){
        int[] ans=new int[arr.length];
        int odd=1;
        int even=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                ans[odd]=arr[i];
                odd+=2;
            }else{
                ans[even]=arr[i];
                even+=2;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr={3,1,-2,-5,2,-4};
        // System.out.println(rearrangeArrayElementsBySign(arr));
        int[] result=rearrangeArrayElementsBySign(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(result[i]);
        }
    }
} 

//Time complexity: O(n)
//Space complexity: O(n)  (for ans array)