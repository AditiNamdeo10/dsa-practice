class Moores_Voting_Algorithm{
    public static int mooresVotingAlgorithm(int arr[]){
        int ele=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(cnt==0){
                ele=arr[i];
            }
            if(arr[i]==ele){
                cnt++;
            }else{
                cnt--;
            }
        }
        int ans=-1;
        int cnt2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                cnt2++;
            }
        }
        if(cnt2>(arr.length/2)){
            return ele;
        }else{
            return -1;
        }

    }
    public static void main(String[] args){
        int[] arr={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        int result=mooresVotingAlgorithm(arr);
        System.out.println(result);
    }
}

//Output= 5
//Time complexity= O(n)
//Space complexity= O(1)