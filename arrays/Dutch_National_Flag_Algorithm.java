//Sort an array of 0's 1's & 2's 
//Dutch National Flag algorithm

class Dutch_National_Flag_Algorithm{
    public static void dutchNationalFlagalgorithm(int[]arr){
       int low=0,mid=0,high=arr.length-1;
       while(mid<=high){

          if (arr[mid]==0){
              int temp=arr[mid];
              arr[mid++]=arr[low];
              arr[low++]=temp;
          } 
          else if( arr[mid]==1){
             mid++;
          }else{
            int temp=arr[mid];
            arr[mid]=arr[high];
            arr[high--]=temp;
          }
       }
    }

    public static void main(String[] args){
        int[] arr={0,0,1,2,1,0,1,1,2,0};
        dutchNationalFlagalgorithm(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}

//Output = 0 0 0 0 1 1 1 1 2 2