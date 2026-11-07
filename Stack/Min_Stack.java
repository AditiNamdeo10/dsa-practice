import java.util.Stack;
class MinStack{
    Stack <Integer> st= new Stack<>();
    int mini=Integer.MAX_VALUE;
    int currsize=0;

    public void push(int x){
        if(st.isEmpty()){
            mini=x;
            st.push(x);
        }else{
            if(x<mini){
                int newVal=(2*x)-mini;
                st.push(newVal);
                mini=x;
            }else{
                st.push(x);
            }
        }
        currsize++;
    }
    public int pop(){
        if(st.isEmpty()) return -1;
        currsize--;
        if(st.peek()>mini){
            return st.pop();
        }else{
            int temp=mini;
            mini=(2*mini)-st.peek();
            if(st.isEmpty()) mini = Integer.MAX_VALUE;         
            return temp;
        }
        
    }

    public int getMin(){
        return mini;
    }

    public int peek(){
        if(st.isEmpty()) return -1;
        return Integer.max(mini,st.peek());
    }

    public int size(){
        return currsize;
    }
}

class Min_Stack{
    public static void main(String[] args){
        MinStack m= new MinStack();
        m.push(12);
        m.push(15);
        m.push(10);
        
        System.out.println(m.getMin());
        System.out.println(m.pop());

        System.out.println(m.getMin());
        System.out.println(m.peek());
        m.push(10);
        System.out.println(m.peek());
    }
}

//Time complexity - for every operation = O(1)
//Space complexity = O(n) (At max one value is stored everytime)