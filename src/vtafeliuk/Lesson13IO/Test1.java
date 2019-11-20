package vtafeliuk.Lesson13IO;

import java.io.File;
import java.io.IOException;

public class Test1 {

    public static final String PATHNAME = "src" + File.separator + "vtafeliuk" + File.separator + "Lesson13IO";

    public static void main(String[] args) throws IOException {
        File resourceDirectory = new File(PATHNAME);
        boolean directoryCreated = resourceDirectory.mkdir();
        System.out.println(directoryCreated);

        File file = new File(resourceDirectory, "poem.txt");
        boolean fileCreated = file.createNewFile();
        System.out.println(fileCreated);
        System.out.println(resourceDirectory.getAbsolutePath());
        System.out.println(resourceDirectory.getCanonicalPath());
    }
}
