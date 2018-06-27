/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author RadioactiveScript
 */
public class FileManipulation {

    public static void showFiles(String path) {
        File dir = new File(path);
        File[] filesList = dir.listFiles();
        System.out.println("------ File list starts here ------");
        for (File file : filesList) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
        System.out.println("------ File list ends here ------");
    }

    public static void writeFile(String fileName) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

            String content = "YOU ARE HACKED BY RISE";
            bw.write(content);
            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the directory path [ex: C:/Dummypath/dir/]: ");
        String path = scanner.next();

        showFiles(path);

        System.err.println("Enter file name with extension[ex: readme.txt]: ");
        String fileName = scanner.next();

        writeFile(path + "\\" + fileName);
    }
}
