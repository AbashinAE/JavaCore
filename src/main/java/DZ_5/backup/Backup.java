package DZ_5;

import java.io.*;
import java.nio.file.*;;

public class Backup {
    public static void backUp(String path, Path backUp){
        File root = new File(path);
        try{
            for(File file: root.listFiles()){
                if(file.isDirectory()){
                    backUp(file.getAbsolutePath(), backUp);
                }
                else {
                    Path filePath = Paths.get(file.getAbsolutePath());
                    Path target = Paths.get(String.valueOf(backUp), file.getName());
                    System.out.println(filePath);
                    Files.copy(filePath,target, StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Path newBackUp(String directory) throws IOException {
        Path backUpDir = Paths.get(directory, "backup");
        Files.createDirectory(backUpDir);
        return backUpDir;
    }
}
