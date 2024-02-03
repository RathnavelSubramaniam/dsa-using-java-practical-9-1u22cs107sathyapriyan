import java.util.*;
public class ArrayStack{	
protected int capacity;
// Array used to implement the stack.
protected int[] stack;
// Index of the top element of the stack in the array.
protected int top = -1;
// Initializes the stack to use an array of given length.
public ArrayStack(int cap) {
capacity = cap;
stack = new int[capacity]; // compiler may give warning, but this is ok
}
public int size()
{
    return (top+1);
}
// Inserts an element at the top of the stack. This method runs in O(1) time.
public void push(int data) 
{
}
// Inspects the element at the top of the stack. This method runs in O(1) time.
public int pop() 
{
}
public boolean isFull()
{
   
}
public boolean isEmpty()
{
    
}
public void display()
{
    if(isEmpty())
    System.out.println("Stack is Underflow. No elements to display in Empty Stack");
    else
    {
     System.out.println("Stack Elements");
    for(int i=top;i>=0;i--)
    System.out.println(stack[i]);
    }
}
public static void main(String[] args)
{
    ArrayStack s=new ArrayStack(5);
    Scanner sc=new Scanner(System.in);
    int data,ch;
    do
    {
        System.out.println("1.Push");
    System.out.println("2.Pop");
    System.out.println("3.Display Stack");
    System.out.println("4.Exit");
    System.out.println("Enter your choice:"); 
    ch=sc.nextInt();
    switch(ch)
    {
        case 1: 
            System.out.println("Enter the element to insert:");
            data=sc.nextInt();
            s.push(data);
            break;
        case 2:            
            data=s.pop();
            if(data!=-1)
            System.out.println("Popped Element:"+data);
            break;
            case 3:
                s.display();
                break;
              } }while(ch<4);
}
}

