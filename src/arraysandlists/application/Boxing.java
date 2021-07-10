package arraysandlists.application;

public class Boxing {
    public static void main(String[] args) {
        
        int x = 20;

        Object obj = x; //boxing

        System.out.println(obj);

        //int y = obj  - necessário casting para unboxing
        int y = (int) obj;

        System.out.println(y);

        
    }
}
