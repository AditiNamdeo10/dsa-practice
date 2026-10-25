import java.util.*;
class Majority_element{
    public static int majorityElement(int arr[]){
        int n=arr.length;
        HashMap<Integer,Integer> map  = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int num : map.keySet()){
            if(map.get(num)>(n/2)){
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr={2,2,3,3,1,2,2};
        int result=majorityElement(arr);
        System.out.println(result);

    }
}

//Output= 2
//Time complexity= O(n+n)= O(2n)= O(n)  (for two loops)
//Space complexity=O(n)