package stitov.Lesson12_Stream.Task1;
import stitov.utilsST.Splitter;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try{
            FileReader fReader = new FileReader("src\\stitov\\Lesson12_Stream\\Task1\\request.txt");
            Scanner scanner = new Scanner(fReader);
            String line = scanner.hasNextLine() ? scanner.nextLine() : null;
            ArrayList<String> requestArray = Splitter.splitRequest(line);
            StringBuilder request = new StringBuilder("\"");
            for (int i= 0; i<requestArray.size();i+=2){
                if ((!requestArray.get(i).equals("null")) && (!requestArray.get(i+1).equals("null"))){
                    if (request.length()>1){
                        request.append(" and ");
                    }
                    request.append(requestArray.get(i)).append(" = \'").append(requestArray.get(i + 1)).append("\'");
                }
            }
            request.append("\"");
            System.out.println(request);
            fReader.close();
        } catch (IOException e){
            System.out.println("File not found");
        }

    }
}
