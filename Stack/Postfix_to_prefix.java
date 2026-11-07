import java.util.Stack;
class Postfix_to_prefix{
    public static String postfixToPrefix(String s){
        Stack<String> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if((curr>='A'&& curr<='Z') || (curr>='a' && curr<='z' ||
            curr>='0' && curr<='9')){
                st.push(String.valueOf(curr));
            }else{
                String t1=st.pop();
                String t2=st.pop();
                // String temp=curr+t2+t1;
                st.push(curr+t2+t1);
            }
        }
        return st.peek();

    }
    public static void main(String [] args){
        String s="AB-DE+F*/";
        String result=postfixToPrefix(s);
        System.out.println(result);
    }
}

//Output = /-AB*+DEF 