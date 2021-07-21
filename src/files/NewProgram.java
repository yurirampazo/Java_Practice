package files;

import java.io.File;
import java.util.Scanner;

public class NewProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);


        //CONSULTA DE FOLDERS NO DIRETÓRIO INSERIDO
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders){
            System.out.println(folder);

        }

        System.out.println();

        //CONSULTA DE FILES NO DIRETÓRIO INSERIDO
        System.out.println("FILES: ");
        File[] files = path.listFiles(File::isFile);
        for (File file : files){
            System.out.println(file);
        }

        //CRIAÇÃO DE SUBPASTA A PARTIR DA PATH TEMP
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created succefully: " + success);


        sc.close();
    }
}
