package genericassetmap.application;

import java.util.ArrayList;
import java.util.List;

public class Program2GetPut {
    public static void main(String[] args) {

        /*
         Princípio Get/Put - CONTRAVARIÂNCIA:
            Get = Error
             Put = OK
         */

        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("João");

        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(3.14);


        //Number x =  myNums.get(0);  //Erro de compilação



    }
}
