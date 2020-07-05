package com.gigi_g.virtualmachinegenerator.system;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

import com.gigi_g.virtualmachinegenerator.keylistener.KeyListener;

public class TestGenerate {

    public static boolean testGenerate() {
        Generate generate = new Generate();
        String path = "src/test/java/com/gigi_g/virtualmachinegenerator/system/Generate.txt";
        KeyListener keyListener = KeyListener.getInstance();
        File file = new File(path);
        InputStream in;
        PrintStream out = System.out;
        File fileOut = openFile("src/test/java/com/gigi_g/virtualmachinegenerator/system/TestGenerate.logs");
        setOutSystem(fileOut);
        try {
            in = new FileInputStream(file);
            System.setIn(in);
            keyListener.resetBuffer();
            generate.testGenerate();
            System.out.println("TestApp.testApp(): OK");
            System.setOut(out);
            return true;
        } catch (IOException e) {
            System.out.println("TestApp.testApp(): OK");
            e.printStackTrace();
            System.setOut(out);
            return false;
        }
    }

    private static File openFile(String path) {
        File file = new File(path);
        if (file.exists())
            file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    private static void setOutSystem(File file) {
        try {
            System.setOut(new PrintStream(file.getPath()));
            printInfo();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void printInfo() {
        System.out.println();
        System.out.println("***Si consiglia di visualizzare il file Test.logs con il comando cat***");
        System.out.println();
    }
}