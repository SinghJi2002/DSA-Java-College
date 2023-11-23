package Lab7_23_09_30;

import java.util.Stack;

public class A_infix_postfix {

    public static int precedence(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return(-1);
    }

    public static String postfix(String s){
        Stack<Character> stack=new Stack<Character>();
        String solutionString="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(Character.isLetterOrDigit(c)){
                solutionString=solutionString+c;
            }

            else if(c=='('){
                stack.push(c);
            }

            else if(c==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    solutionString=solutionString+stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            else{
                while(precedence(c)<=stack.peek() && !stack.isEmpty()){
                    solutionString=solutionString+stack.peek();
                    stack.pop();
                }
                stack.push(c);  
            }
            while (!stack.isEmpty()) {
                if (stack.peek() == '(')
                    return "Invalid Expression";
                solutionString += stack.peek();
                stack.pop();
            }
            
            
        }
        return solutionString;
    }

    public static void main(String[] args) {
        String toBeConvertString="(a+b)/c*d-e^f";
        String postfix=postfix(toBeConvertString);
        System.out.println(postfix);
    }
}
