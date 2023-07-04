/**
 Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий)
 во вновь созданную папку ./backup
 */
package TASK1;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.createDirectory;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Main {
    public static void main(String[] args)  {
        File folder = new File(".");
        try {
        Path backuoDirectory = createDirectory(Paths.get("./BACKUP"));
        } catch (FileAlreadyExistsException e) {
            System.out.println("Directory already exist");
        } catch (IOException e) {}


        for (File file:folder.listFiles()) {
            if (file.isFile()){
                try {
               Path copyFile = Files.copy(Paths.get(file.getPath()),
                        Path.of("./BACKUP/"+file.getName()),REPLACE_EXISTING);
                }catch (IOException e){
                    System.out.println("SOMETHING WRONG");
                }
            }
        }
    }
}
