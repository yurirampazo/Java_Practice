package genericassetmap.application;


import java.util.Arrays;
import java.util.List;

public class WildCardTypes {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Yuri", "Karen", "Katia");
        printList(myStrs);

    }
    public static void printList(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
