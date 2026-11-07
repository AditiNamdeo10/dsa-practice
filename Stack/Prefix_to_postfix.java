import java.util.Stack;
class Prefix_to_postfix{
    public static String prefixToPostfix(String s){
        Stack <String> st=  new Stack<>();
        for(int i=s.length()-1; i>=0; i--){
            char curr=s.charAt(i);
            if((curr>='A' && curr<='Z') || (curr>='a' && curr<='z') ||
            (curr>='0' && curr<='9')){
                st.push(String.valueOf(curr));
            }else{
                String t1=st.pop();
                String t2=st.pop();
                st.push(t1+t2+curr);
            }
        }
        return st.pop();
    }
    public static void main(String[] args){
        String s="/-AB*+DEF";
        String result=prefixToPostfix(s);
        System.out.println(result);
    }
}