package org.example;

import java.io.File;
import java.io.IOException;

public class list_files_in_a_directory {
    public static void main(String[] args) {
        // specify the directory path
        //String directoryPath = "D:\\Files";
        // create a file object representing the directory
        File directory = new File("D:\\Files");
        String directoryPath = directory.getAbsolutePath();
        //check if the given path is a valid directory
        if(directory.isDirectory()){
            // use the listfiles() method to get an array of file objects in the directory
            File[] files = directory.listFiles();

            // check if the directory is not empty
            if(files != null && files.length > 0){
                System.out.println("Files and directories in " + directoryPath + ":");


                // loop through each file object in the array
                for(File file:files){
                    // check if the current file object is a file
                    if(file.isFile()){
                        System.out.println("File: " + file.getName()); // print the file name
                        System.out.println("File path: " + file.getAbsolutePath()); // print the file path
                        System.out.println("File size: " + file.length()); // print the  size of the file
                        System.out.println("============================================================");
                    }
                    // check if the current file object is a directory
                    else if(file.isDirectory()){
                        System.out.println("Directory: " + file.getName()); // print the directory name
                    }
                }
            } else{
                // if the directory is empty print a message
                System.out.println("The directory is empty");
            }
        }else{
            // if the given path is not a directory,print a message
            System.out.println(directoryPath + " is not a directory path");
        }
    }
}
