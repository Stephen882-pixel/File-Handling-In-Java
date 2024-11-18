package org.example;


import java.io.File; // import file class
import java.io.IOException;  // Class fot handling errors

public class CreateFile {
    public static void main(String[] args) {
        try{
            // create an object of the file
            File obj = new File("D:\\File\\file2.txt");
            if(obj.createNewFile()){
                System.out.println("File " + obj.getName() + " has been created successfully:");
            }else {
                System.out.println("The file already exists");
            }
        }catch (IOException e){
            System.out.println("Something went wrong please try again");
            e.printStackTrace();
        }
    }
}
