import java.util.Stack;
class Infix_to_prefix{
    public static String reverseString(String s){
        StringBuilder sb= new StringBuilder(s);
        int i=0,j=s.length()-1;
        for(int k=0;k<s.length();k++){
            if(sb.charAt(k)=='('){
                sb.setCharAt(k,')');
            }else if(sb.charAt(k)==')'){
                sb.setCharAt(k,'(');
            }
        }
        while(i<j){
            
            char ch=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,ch);

            i++;
            j--;
        }
        return sb.toString();
    }

    public static int priority(char ch){
        if(ch=='^'){
            return 3;
        }else if(ch=='/' || ch=='*'){
            return 2;
        }else if(ch=='+' || ch=='-'){
            return 1;
        }else{
            return -1;
        }
    }

    public static String infixToPrefix(String exp){
        Stack <Character> st =new Stack<>();
        
        String s=reverseString(exp);
        StringBuilder ans= new StringBuilder();

        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);

            if((curr>='A' && curr<='Z') || (curr>='a' && curr<='z')||
            (curr>='0' && curr<='9') ){
                ans.append(curr);
            }else if(curr=='('){
                st.push(curr);
            }else if(curr==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans.append(st.pop());
                }
                st.pop();
            }else{
                if(curr=='^'){
                    while(!st.isEmpty() && priority(curr)<=priority(st.peek())){
                        ans.append(st.pop());
                    }
                    st.push(curr);
                }else{
                    while(!st.isEmpty() && priority(curr)<priority(st.peek())){
                        ans.append(st.pop());
                    }
                    st.push(curr);
                }
            }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans=ans.reverse();
        return ans.toString();
    }

    public static void main(String [] args){
        String s="(A+B)*C-D+F";
        String result=infixToPrefix(s);
        System.out.println(result);
    }
}
// Output = +-*+ABCDF