import java.util.Stack;
class Nearest_smaller_element{
    public static int[] nearestSmallerElement(int[] arr){
        Stack<Integer> st= new Stack<>();
        int[] ans= new int[arr.length];
        for(int i=0;i<arr.length; i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
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
        int[] arr={4,5,2,10,8};
        int[] result=nearestSmallerElement(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+"\t");
        }
    }
}

//Output = -1      4       -1      2       2


//Time complexity = O(2N)
//Space complexity = O(N) + O(N)  = O(2N)