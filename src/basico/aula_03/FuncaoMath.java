package basico.aula_03;

public class FuncaoMath {
    public static void main(String[] args) {
        
        double x = 3.0, y = 4.0, z = -5.0, A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(z);
        System.out.println("SQRT de " + x + " = " + A);
        System.out.println("SQRT de " + y + " = " + B);
        System.out.println("SQRT de " + z + " = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + "^" + y + " = " + A);
        System.out.println(x + "^" + 2 + " = " + B);
        System.out.println(5 + "^" + 2 + " = " + C);

        A = Math.abs(x);
        B = Math.abs(y);
        C = Math.abs(z);
    
        System.out.println("Valor absoluto de "+x+ " = " + A);
        System.out.println("Valor absoluto de "+y+ " = " + B);    
        System.out.println("Valor absoluto de "+z+ " = " + C);
    }
    
}
