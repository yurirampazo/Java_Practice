package basico.aula_07;

public class FuncoesString {

    public static void main(String[] args) {


        String original = "ABCBabcSD ABCSDF, abcmd OAJ   ";
        String sLower = original.toLowerCase();
        String sUpper = original.toUpperCase();
        String sTrim = original.trim(); /*Remove os espaços vazios entre a String e as aspas*/
        String sSubString = original.substring(4);
        

        System.out.println("Original = " + original);
        
        //CASE (UPPER/LOWER)
        System.out.println("ToLowerCase() = " + sLower);
        System.out.println("ToUpperCase() = " + sUpper);
        System.out.println("");
        

        //SUBSTRING
        System.out.println("Original = " + original);
        System.out.println("trim() = " + sTrim); /*Remove os espaços  entre as aspas e uma String e as aspas*/
        
        System.out.println("subtring(i) = " + sSubString); /* Indica onde quer iniciar a iteração da String*/
        
        sSubString = original.substring(3,8); /* Indica onde quer iniciar e finalizar a iteração da String*/
        System.out.println("substring(i,n) = " + sSubString); // número final não é inclusivo
        System.out.println("");


        //REPLACE
        System.out.println("Original = " + original);
        String sReplace = original.replace('a','3'); /* Indica o caractere que queremos substituir e o seu substituto*/
        System.out.println("replace('i', 'n') = " + sReplace);

        String sReplaceString = original.replace("abc", "123"); /* Indica a string a se substituir e o sua substituta*/
        System.out.println("replace(\"abc\", \"123\") = " + sReplaceString);    
        System.out.println("");

        //INDEX OF
        System.out.println("Original = " + original);
        int sIndexOf = original.indexOf('a'); /*Indica o indice onde ocaractere informado está */
        System.out.println("indexOf('a' ) = " + sIndexOf);
        
        sIndexOf = original.indexOf("bc"); /*Indica o indice onde a String informada está */
        System.out.println("indexOf(\"bc\" ) = " + sIndexOf);
        System.out.println("");
        //LAST INDEX OF
        System.out.println("Original = " + original);
        sIndexOf = original.lastIndexOf('a'); /*Indica o indice onde ocaractere informado está */
        System.out.println("lastIndexOf('a' ) = " + sIndexOf);

        sIndexOf = original.lastIndexOf("bc"); /*Indica o ultimo indice onde a String informada*/
        System.out.println("lastIndexOf(\"bc\" ) = " + sIndexOf);



        



        
    }
    
}
