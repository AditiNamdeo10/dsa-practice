import java.util.Stack;
class Next_greater_element{
    public static int[] nextGreaterElement(int [] arr){
        int [] ans=new int[arr.length];
        Stack <Integer> st= new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }


    public static void main(String [] args){
        int[] arr={4,12,5,3,1,2,5,3,1,2,4,6};
        int[] result=nextGreaterElement(arr);
        for(int i=0;i<result.length;i++){
            System.out.print (result[i]+"\t");
        }

    }
}

//Output
// 12      -1      6       5       2       5       6       4       2       4       6       -1


///Time Complexity = O(2N) = O(N)
//while loop can only remove n elements in stack in total where n is the total number of elements in stack

//Space Complexity = O(N+N) = O(N) 
//N for storing n elemens=ts in stack and ans array