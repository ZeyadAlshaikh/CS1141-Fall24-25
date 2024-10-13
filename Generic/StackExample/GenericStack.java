package Generic.StackExample;

public class GenericStack <T> {
    private final T[] elements; // array stores stack elements
    private int number; // number of elements in stack

    // we can't create an array using generic type; new T[10] is prohibited
    // constructor receives an array representing the stack
    public GenericStack(T[] elements) {
        this.elements = elements;
        this.number = 0;
    }

    // push element onto stack
    public void push(T pushValue) {
        elements[number] = pushValue;
        number++;
    }

    // return the top element if not empty; else throw EmptyStackException
    public T pop() throws EmptyStackException {
        if (number == 0) // if stack is empty
            throw new EmptyStackException("Stack is empty, cannot pop");
        number--;
        return elements[number];
    }


    public static void main(String[] args) {
        double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        int[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.printf("%s",12.2);
        GenericStack<Integer> integerStack = new GenericStack<>(new Integer[10]);
        GenericStack<Double> doubleStack = new GenericStack<>(new Double[5]);
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




        // for double items
        for(Double item : doubleElements)
            doubleStack.push(item);

        try{
            while(true)
                System.out.print(doubleStack.pop() + " ,");

        }catch (EmptyStackException emptyStackException){
            System.out.println();
            System.out.println("No more item to pop. Stack is Empty");
        }

    }
}


