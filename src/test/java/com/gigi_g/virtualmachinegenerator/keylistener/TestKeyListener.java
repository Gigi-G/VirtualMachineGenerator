package com.gigi_g.virtualmachinegenerator.keylistener;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TestKeyListener {
    
    private static void init(KeyListener keyListener, String inp) {
        String input = inp;
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        keyListener.resetBuffer();
    }

    public static boolean testSingleton() {
        KeyListener keyListener = KeyListener.getInstance();
        init(keyListener, "Prova1\nProva2\n");
        KeyListener keyListener2 = KeyListener.getInstance();
        if(keyListener.inputKey().equals("Prova1") && keyListener2.inputKey().equals("Prova2")) {
            System.out.println("TestKeyListener.testSingleton(): OK");
            return true;
        }
        else {
            System.out.println("TestKeyListener.testSingleton(): FAILED");
            return false;
        }
    }

    public static boolean testNullInput() {
        KeyListener keyListener = KeyListener.getInstance();
        init(keyListener, "\n");
        if(keyListener.inputKey().equals("none")) {
            System.out.println("TestKeyListener.testNullInput(): OK");
            return true;
        }
        else {
            System.out.println("TestKeyListener.testNullInput(): FAILED");
            return false;
        }
    }
}