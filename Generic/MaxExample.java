package Generic;

public class MaxExample {

//    public static Integer max(Integer n1, Integer n2, Integer n3){
//        System.out.println("Integer max(Integer n1, Integer n2, Integer n3)");
//        Integer max = n1;
//        if(n2 > max)
//            max = n2;
//        if(n3 > max)
//            max = n3;
//
//        return max;
//    }

    public static <T extends Comparable<T>> T max(T n1, T n2, T n3){
        System.out.println("Integer max(Integer n1, Integer n2, Integer n3)");
        T max = n1;
        if(n2.compareTo(max) > 0)
            max = n2;
        if(n3.compareTo(max) > 0)
            max = n3;

        return max;
    }

//    public static Comparable max(Comparable n1, Comparable n2, Comparable n3){
//        System.out.println("Integer max(Integer n1, Integer n2, Integer n3)");
//        Comparable max = n1;
//        if(n2.compareTo(max) > 0)
//            max = n2;
//        if(n3.compareTo(max) > 0)
//            max = n3;
//
//        return max;
//    }





    public static void main(String[] args) {

        System.out.println(max(2,6,1));
        System.out.println(max(2.2,6.7,1.0));
        System.out.println(max("Ali", "Ahmad","Abdullah"));
    }
}
