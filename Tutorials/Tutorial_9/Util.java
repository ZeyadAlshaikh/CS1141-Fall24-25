package Tutorials.Tutorial_9;

public class Util {
    public static <K,V> boolean compare(Pair p1,Pair  p2){
        if (p1.getKey().equals(p2.getKey())&& p1.getValue().equals(p2.getValue()))
            return true;
        return false;
        //return p1.getKey().equals(p2.getKey())&& p1.getValue().equals(p2.getValue());
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] arr, T e){
        int count = 0 ;
        for( int i = 0; i< arr.length; i++){
            if(e.compareTo(arr[i])< 0){

                count++;
            }

        }


        return count;
    }



    public static void main(String[] args) {

        Integer[] ints   = {1, 8, 5, 6, 7, 0};
        Double[] doubles = {1.1, 8.8, 5.5, 6.6, 7.7, 0.0};
        String[] strings = {"apple", "kiwi", "Mango", "orange", "banana"};

        System.out.println(countGreaterThan(ints,5));
        System.out.println(countGreaterThan(doubles,5.0));
        System.out.println(countGreaterThan(strings,"grappes"));

//        Pair<String,Integer> p1 = new OrderedPair<>("ABC", 123);
//        Pair<String,String> p2 = new OrderedPair<>("ABC", "1234567");
//
//        if (compare(p1, p2) == true)
//            System.out.println("They are equals");
//        else
//            System.out.println("They are not equals");
    }
}
