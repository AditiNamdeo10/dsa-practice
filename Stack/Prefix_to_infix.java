import java.util.Stack;
class Prefix_to_infix{
    public static String prefixToInfix(String s1){
        StringBuilder sb = new StringBuilder(s1);
        String s=sb.reverse().toString();

        Stack<String> st =new Stack<>();

        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if((curr>='A' && curr<='Z') || (curr>='a' && curr<='z') ||
            curr>='0' && curr<='9'){
                st.push(String.valueOf(curr));
            }else{
                String t1=st.pop();
                String t2=st.pop();
                String temp="(" + t1 + curr + t2 + ")";
                st.push(temp);
            }
        }
        return st.peek();
    }

    public static void main(String [] args){
        String s="*+PQ-MN";
        String result=prefixToInfix(s);
        System.out.println(result);
    }
}

// Output = ((P+Q)*(M-N))