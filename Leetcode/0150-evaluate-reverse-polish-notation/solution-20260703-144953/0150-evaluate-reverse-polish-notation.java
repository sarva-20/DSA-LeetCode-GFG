class Solution {
    public int evalRPN(String[] tokens) {
        
        // Create stack to store elements in array and perform ops
        Stack<Integer> stack = new Stack<>();
        
        // Iterate the array 
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                // Whenever any arithmetic op is found, take them out in a variable with the int's
                int a = stack.pop();
                int b = stack.pop();

                switch(token){
                    case "+":
                        stack.push(b+a);
                        break;
                    case "-":
                        stack.push(b-a);
                        break;
                    case "*":
                        stack.push(b*a);
                        break;
                    case "/":
                        stack.push(b/a);
                        break;
                }
            } else {
                // No arithmetic op in the array while iterating, then it is a element
                
                // Convert string to integer
                stack.push(Integer.parseInt(token));
                
            }
        }
        return stack.pop();
        // After all elements, only 1 element is left in the stack, so we return it
    }
}