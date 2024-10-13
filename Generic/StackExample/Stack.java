package Generic.StackExample;

public class Stack {
    private final int[] elements; // array stores stack elements
    private int number; // number of elements in stack

    // we can't create an array using generic type; new T[10] is prohibited
    // constructor receives an array representing the stack
    public Stack(int[] elements) {
        this.elements = elements;
        this.number = 0;
    }

    // push element onto stack
    public void push(int pushValue) {
        elements[number] = pushValue;
        number++;
    }

    // return the top element if not empty; else throw EmptyStackException
    public int pop() throws EmptyStackException {
        if (number == 0) // if stack is empty
            throw new EmptyStackException("Stack is empty, cannot pop");
        number--;
        return elements[number];
    }


    public static void main(String[] args) {
        //double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Stack<Double> doubleStack = new Stack<>(new Double[5]);
        Stack integerStack = new Stack(new int[10]);

        // push elements of doubleElements into Stack

        for(int item : integerElements)
            integerStack.push(item);

        try{
            while(true)
                System.out.print(integerStack.pop() + " ,");

        }catch (EmptyStackException emptyStackException){
            System.out.println();
            System.out.println("No more item to pop. Stack is Empty");
        }

    }
}



 class EmptyStackException extends RuntimeException {
    // no-argument constructor
    public EmptyStackException() {
        this("Stack is empty");
    }

    // one-argument constructor
    public EmptyStackException(String message) {
        super(message);
    }
} // end class EmptyStackException

