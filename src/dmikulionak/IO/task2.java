package dmikulionak.IO;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.String.*;

//Написать программу, которая создаст текстовый файл и запишет в него список файлов (путь, имя, дата создания) из заданного каталога.
public class task2 {
   public static void main(String[] args) throws IOException, ParseException {

        PrintWriter writer = new PrintWriter("fileInfo.txt", StandardCharsets.UTF_8);
        File myFolder = new File("C:\\Users\\mikulionk\\Google Диск\\JC2019-09\\src\\dmikulionak\\IO"); //Укажите каталог
        File[] files = myFolder.listFiles();

        assert files != null;
        BasicFileAttributes attr;

        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for (File file : files) {
            Path path = Paths.get(valueOf(file));
            attr = Files.readAttributes(path, BasicFileAttributes.class);
            FileTime date_s = attr.creationTime();
            Date date = dt.parse(valueOf(date_s));
            writer.write(file + "   ");
            writer.write(dt1.format(date) + System.lineSeparator());
            }

        writer.close();
        }
    }

