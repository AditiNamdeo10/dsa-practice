import java.util.Stack;
class Infix_to_postfix{
    public static int priority(char c){
        if(c=='^'){
            return 3;
        }else if(c=='*' || c=='/'){
            return 2;
        }else if(c=='+' || c=='-'){
            return 1;
        }else{
            return -1;
        }
    }
    public static String infixToPostfix(String s){
        Stack<Character> st= new Stack<>();
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if((curr>='A' && curr<='Z' ) ||
               (curr>='a' && curr<='z')  || 
               (curr>='0' && curr<='9') ){
                      ans.append(curr);
            }
            else if(curr=='('){
                st.push(curr);
            }else if(curr==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans.append(st.pop());
                }
                st.pop();  //for removing the open paranthesis
            }
            else{
                while(!st.isEmpty() && (priority(st.peek())>=priority(curr))){
                    ans.append(st.pop());
                }
                st.push(curr);
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
    }
    public static void main(String [] args){
        String s="a+b*(c^d-e)";
        String result=infixToPostfix(s);
        System.out.println(result);
    }
}