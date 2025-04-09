class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int a,b;
        for(String s:tokens){
            switch(s){
                case "+":
                    st.push(st.pop() + st.pop());
                    break;
                case "-":
                    a=st.pop();
                    b=st.pop();
                    st.push(b-a);
                    break;
                case "*":
                    st.push(st.pop() * st.pop());
                    break;
                case "/":
                    a=st.pop();
                    b=st.pop();
                    st.push(b/a);
                    break;
                default:
                    st.push(Integer.parseInt(s));
                    break;
            }
        }
        return st.pop();
    }
}