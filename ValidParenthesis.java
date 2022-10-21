//import java.util.String;
import java.beans.beancontext.BeanContext;
import java.util.Stack;
public class ValidParenthesis {
    public static void main(String[] args) {
    Stack<Character> s1 = new Stack<>();
        String s = "({}]";
    
        for(char c : s.toCharArray()){
                  if(c=='(' || c=='{' ||c=='['){
                    s1.push(c);
                  }
                  else{
                    if(s1.isEmpty()){
                        System.out.println("wrong string");
                       break;
                    }
                    else{
                        char top = s1.peek();
                        if((top == '(' && c==')') || (top == '{' && c=='}') || (top == '[' && c==']')){
                            s1.pop();
                        }
                        else{
                            System.out.println("wrong string");
                        }
                    }
                  }
        }
        if(s1.isEmpty()){
            System.out.println("Perfect string");
        }
    }
   
}
