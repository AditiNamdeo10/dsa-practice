import java.util.Stack;
class Valid_paranthesis{
    public static boolean balancedParanthesis(String s){
        Stack <Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(curr=='[' || curr=='{' || curr=='('){
                st.push(curr);
            }else{
                if(st.isEmpty()){
                    return false;
                }else{
                    char peek=st.peek();
                    if(curr=='}' && peek=='{'){
                        st.pop();
                    }else if(curr==')' && peek=='('){
                        st.pop();
                    }else if(curr==']' && peek=='['){
                        st.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args){
        String s="({{[]}})";
        boolean result=balancedParanthesis(s);
        System.out.println(result);
    }
}

//Output : true

//Time complexity = O(n)
//Space complexity = O(n)