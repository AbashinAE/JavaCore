package DZ_5;

import java.io.*;
import java.nio.file.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Path backUp = Backup.newBackUp(".\\src\\main\\java\\DZ_5");

        Backup.backUp(".\\src\\main\\java\\DZ_5", backUp);

    }
}
