package org.example;

import java.io.File;
import java.io.IOException;

public class FileInfomartion {
    public static void main(String[] args) {
        File obj2 = new File("D:\\File\\file1.txt");
        if(obj2.exists()){
            System.out.println("The file name is: " + obj2.getName());
            System.out.println("The file's absolute path is: " + obj2.getAbsolutePath());
            System.out.println("The file size is: " + obj2.length());
            System.out.println("Is the file readable: " + obj2.canRead()); // returns a boolean value
            System.out.println("Is the file writable: " + obj2.canWrite());
            String directoryPath = obj2.getAbsolutePath();
        } else {
            System.out.println("The file does not exists");
        }
    }
}
