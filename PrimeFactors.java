import java.util.*;
public class PrimeFactors {
	public static void main(String[] args) {
		System.out.print("Enter a positive number: ");
	    Scanner scanner = new Scanner (System.in);
	    int n = scanner.nextInt();
	    StackOfIntegers stack = new StackOfIntegers();    
	    while (n%2==0) 
        { 
            stack.push(2); 
            n /= 2; 
        } 
	    for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            
            while (n%i == 0) 
            { 
                stack.push(i); 
                n /= i; 
            } 
        } 
	    scanner.close();
  
        // This condition is to handle the case whien 
        // n is a prime number greater than 2 
        if (n > 2) 
            stack.push(n); 
        while(stack.empty()==false)
        {
        	System.out.print(stack.pop()+",");
        }
	}
	
}
class StackOfIntegers {
private int[] elements;
private int size;

/** Construct a stack with the default capacity 16 */
  public StackOfIntegers() {
    this(16);
 }

 /** Construct a stack with the specified maximum capacity */
 public StackOfIntegers(int capacity) {
   elements = new int[capacity];
 }

 /** Push a new integer into the top of the stack */
 public int push(int value) {
   if (size >= elements.length) {
     int[] temp = new int[elements.length * 2];
     System.arraycopy(elements, 0, temp, 0, elements.length);
     elements = temp;
   }

   return elements[size++] = value;
 }

 /** Return and remove the top element from the stack */
 public int pop() {
   return elements[--size];
 }   

 /** Return the top element from the stack */
 public int peek() {
   return elements[size - 1];
 }

 //whether the stack is empty */
 public boolean empty() {
   return size == 0;
 }

  /** Return the number of elements in the stack */
 public int getSize() {
   return size;
 }
 }

