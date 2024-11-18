package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter obj3 = new FileWriter("D:\\File\\File1.txt");
            obj3.write("Hell everybody welcome to our JUG talk series");
            obj3.close();
            System.out.println("Content is successfully wrote to the file");
        }catch (IOException e){
            System.out.println("Unexpected error occured");
            e.printStackTrace();
        }
    }
}
