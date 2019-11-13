package stitov.Lesson14_IO.Task3;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by user on 13.11.2019.
 */
public class Task3 {
  private static final String ESC = "#ESC";
  public static void main (String[] args) throws IOException{
    try{
      FileWriter writer = new FileWriter("src\\stitov\\Lesson14_IO\\Task3\\output.txt");
      readAndWrite(writer);
      writer.close();
    } catch (Exception e){
      System.out.println("File not found");
    }

  }
  private static void readAndWrite(FileWriter writer) throws IOException{
    System.out.println("Enter the  lines: ");
    Scanner scanner = new Scanner(System.in);
    String line;
    while (true){
      line = scanner.nextLine();
       if (checker(line, writer)){
         break;
       } else {
         writer.write(line+"\n");
       }
    }
  }
  private static void deleteEsc(String line){
    line.replaceAll(ESC, "");
  }
  private static boolean checker (String line, FileWriter writer) throws IOException{
    if (line.contains(ESC)) {
      deleteEsc(line);
      writer.write(line);
      return true;
    }
    return false;
  }
}
