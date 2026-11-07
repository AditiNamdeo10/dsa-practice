import java.util.Stack;
class Postfix_to_infix{
    public static String postfixToInfix(String s){
        
        Stack<String> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if((curr>='A' && curr<='Z') || (curr>='a' && curr<='z') ||
            (curr>='0' && curr<='9')){
                st.push(String.valueOf(curr));
            }else{
                String t1=st.pop();
                String t2=st.pop();
                // StringBuilder sb= new StringBuilder();
                // sb.append('(').append(t2).append(curr).append(t1).append(')');
                String s1='(' + t2 + curr + t1 + ')' ;
                st.push(s1);
            }
        }
        String ans=st.pop();
        return ans;
        
    }
    public static void main(String [] args){
        String s="AB-DE+F*/";
        String result=postfixToInfix(s);
        System.out.println(result);
    }
}

//Output = ((A-B)/((D+E)*F))