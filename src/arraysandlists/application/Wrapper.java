package arraysandlists.application;

public class Wrapper {
    /* As Wrapper classes são classes que fornecem métodos  de objeto aos oito tipos primitivos de java.*/
    public static void main(String[] args) {
        
        int x = 20;
    
       Integer inteiro = x; //boxing
    
        System.out.println(inteiro.intValue());
    
       
        int y = inteiro; // unboxing
    
        System.out.println(y);
    }
}
