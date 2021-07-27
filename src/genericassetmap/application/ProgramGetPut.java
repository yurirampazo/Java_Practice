package genericassetmap.application;

import java.util.ArrayList;
import java.util.List;

public class ProgramGetPut {
    public static void main(String[] args) {

        //Covariância
        //Get = OK
        //Put = Error

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0);

        //list.add(20);  //erro de compilação
    }
}
