package Strings;

import java.util.Stack;

public class RemoveOuterMostParanthesis {

    public static void main(String[] args) {

        String s = "(()(()))";

        System.out.println(removeOuterMostParanthesis(s));

    }
    static String removeOuterMostParanthesis(String s){

        Stack<Character> stack = new Stack<>();
        StringBuilder response = new StringBuilder();

        for(char c:s.toCharArray()){
           if(c == '('){
               if(stack.size() > 0){
                   response.append(c);
               }
               stack.push(c);
           }else{
               stack.pop();
               if (stack.size() > 0){
                   response.append(c);
               }
           }
        }

        return response.toString();


    }

    // This is a way to do it without using stack in may interviews they might ask such scenario
    static String removeOuterWithoutStack(String s){

        // if (len <= 2) return "";
        StringBuilder newString = new StringBuilder();
        int open = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
                if (open > 1) newString.append('(');
            }
            else {
                if (open > 1) newString.append(')');
                open--;
            }
        }
        return newString.toString();


    }


}
