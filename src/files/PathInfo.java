package files;

import java.io.File;
import java.util.Scanner;

public class PathInfo {
    public static void main(String[] args) {
        //Programa para obter informações dos paths de um arquivo

        Scanner sc = new Scanner(System.in);

        System.out.println("Type a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " +  path.getName());
        System.out.println("getParent " + path.getParent());  //Pega somente o caminho sem o nome da file
        System.out.println("getPath" + path.getPath());  // Pega o nome do path + o nome da file


        sc.close();
    }
}
