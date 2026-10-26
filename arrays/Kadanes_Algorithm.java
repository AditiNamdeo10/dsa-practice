//If there is no subarray with positive sum return 0

class Kadanes_Algorithm{
    public static  int kadanesAlgorithm(int arr[]){
        int maxele=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }else{
                maxele=Math.max(maxele,sum);
            }
        }

        return maxele;
    }
    public static void main(String[] args){
        int []arr={-2,-3,4,-1,-2,1,5,-3};
        int[] arr1={-4,-3,-2,-1};
        int result=kadanesAlgorithm(arr);
        System.out.println(result);
    }
}

//Time complexity= O(n)
//Space complexity= O(1)
