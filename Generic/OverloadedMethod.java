package Generic;

public class OverloadedMethod {


//    public static void printArray(Integer[] arr){
//        System.out.println("printArray(Integer[] arr)");
//        for(Integer item: arr)
//            System.out.print(item +", ");
//        System.out.println();
//    }
//    public static void printArray(Character[] arr){
//        System.out.println("printArray(Character[] arr)");
//        for(Character item: arr)
//            System.out.print(item +", ");
//        System.out.println();
//    }
    public static <T> void printArray(T[] arr){
        System.out.println("printArray(T[] arr)");
        for(T item: arr)
            System.out.print(item +", ");
        System.out.println();
    }

//    public static  void printArray(Object[] arr){
//        System.out.println("printArray(T[] arr)");
//        for(Object item: arr)
//            System.out.print(item +", ");
//        System.out.println();
//    }



    public static void main(String[] args) {
        Object obj;
        Integer[] integers = {1,2,3,4,5};
        Double[] doubles = {1.1,2.2,3.3,4.4,5.5};
        Character[] characters = {'A','b','c','D','e'};
        String[] names = {"Ali", "Ahmad", "Ibraheam"};

        printArray(integers);
        printArray(doubles);
        printArray(characters);
        printArray(names);

    }
}
