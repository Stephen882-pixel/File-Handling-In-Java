package org.example;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) {
        try{
            File f2 = new File("D:\\Files\\File1.txt");
            if(f2.exists()){
                f2.delete();
                System.out.println("The file has been deleted successfully");
            }else {
                System.out.println("The file does not exists.");
            }

        } catch (Exception e){
            System.out.println("Something unexpected happened");
            e.printStackTrace();
        }
    }
}
