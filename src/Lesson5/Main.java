package Lesson5;

import Lesson5Example.FIleObject;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static final String header = "Value 1"+ ";" + "Value 2" + ";" + "Value 3" + System.getProperty("line.separator");
    public static final String line1 = 100 + ";" + 200 + ";" + 123 + System.getProperty("line.separator");
    public static final String line2 = 300 + "," + 400 + "," + 500 + System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
          File file = new File("saveRecord.csv");

            if (!file.exists())
                file.createNewFile();

            PrintWriter pw = new PrintWriter(new FileOutputStream("saveRecord.csv", false));
            pw.write(header);
            pw.write(line1);
            pw.write(line2);
            pw.close();

            br = new BufferedReader(new FileReader("saveRecord.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error" + e);
            }
        }
    }
}

