package JavaRush;

import java.io.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyFromTo {

/*    public static void main(String[] args) throws IOException {
        createAndWriteToFile("D:\\helloWorld.txt", "HelloWorld!");
    }

    public static void createAndWriteToFile(String fileName, String message) throws IOException {
        File newFile = new File(fileName);
        if (newFile.exists()) {
            newFile.createNewFile();
        }
        FileWriter fw = new FileWriter(newFile);
        fw.write(message);
        fw.close();
    }
}*/



    public static void main(String[] args) throws IOException {
        File newFile = new File("D:\\data.txt");
        if (!newFile.exists()){
            newFile.createNewFile();
        }
        FileWriter initialText = new FileWriter(newFile);
        initialText.write("Initial text to copy\n");
        initialText.close();

        FileInputStream fis = new FileInputStream("D:\\data.txt");
        FileOutputStream fos = new FileOutputStream ("D:\\result.txt");

        while (fis.available()>0) {
            int data = fis.read();
            fos .write(data);
        }
        fis.close();
        fos.close();




    }
}