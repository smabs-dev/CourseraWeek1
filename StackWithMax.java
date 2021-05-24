import java.util.*;
class GfG {
  
static class StackWithMax 
{ 
    // main stack 
    static Stack<Integer> mainStack = new Stack<Integer> (); 
  
    // stack to keep track of max element 
    static Stack<Integer> trackStack = new Stack<Integer> (); 
  
static void push(int x) 
    { 
        mainStack.push(x); 
        if (mainStack.size() == 1) 
        { 
            trackStack.push(x); 
            return; 
        } 
  
        // Pushes the greatest element to top of stack.
        if (x > trackStack.peek()) 
            trackStack.push(x); 
        else
            trackStack.push(trackStack.peek()); 
    } 
  
    static int getMax() 
    { 
        return trackStack.peek(); 
    } 
  
    static void pop() 
    { 
        mainStack.pop(); 
        trackStack.pop(); 
    } 
}; 
  
// Test
public static void main(String[] args) 
{ 
    StackWithMax s = new StackWithMax(); 
    s.push(20); 
    System.out.println(s.getMax()); 
    s.push(10); 
    System.out.println(s.getMax()); 
    s.push(50); 
    System.out.println(s.getMax()); 
}
} 
