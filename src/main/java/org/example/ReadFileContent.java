package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileContent {
    public static void main(String[] args) {
        try{
            File f1 = new File("D:\\File\\File1.txt");
            Scanner sc = new Scanner(f1);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }catch (Exception e){
            System.out.println("An unexpected error occured");
            e.printStackTrace();
        }
    }
}
