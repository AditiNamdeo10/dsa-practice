import java.util.Stack;
class Next_greater_element_II{
    public static int[] nextGreaterElementII(int [] arr){
        Stack <Integer> st= new Stack<>();
        int n=arr.length;

        int [] nge= new int[n];

        for(int i=2*n-1 ; i>=0; i--){                       //O(2N)
            while(!st.isEmpty() && st.peek()<=arr[i%n]){
                st.pop();                                   //O(N)
            }
            if(i<n){
                if(st.isEmpty()){
                    nge[i]=-1;
                }else{
                    nge[i]=st.peek();
                }
            }
            st.push(arr[i%n]);                              //O(N)
        }
        return nge;
    }


    public static void main(String [] args){
        int [] arr={2,10,12,1,11};
        int[] result=nextGreaterElementII(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+"\t");
        }
    }
}

//Output = 10      12      -1      11      12

//Time complexity = O(4N)
//Space complexity = O(2N + N)  2N for stack and N for nga array to return the answer