package com.gigi_g.virtualmachinegenerator.keylistener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyListener {
    private BufferedReader input;
    private static KeyListener keyListener = null;
    
    private KeyListener() {
        input = new BufferedReader(new InputStreamReader(System.in));
    }

    public static KeyListener getInstance() {
        if(null == keyListener) keyListener = new KeyListener();
        return keyListener;
    }

    public String inputKey() {
        try {
            String in = input.readLine();
            if(null != in && in.length() > 0) return String.valueOf(in.toCharArray());
            else return "none";
        } catch (IOException io) {
            io.printStackTrace();
        }
        return null;
    }

    public void resetBuffer() {
        input = new BufferedReader(new InputStreamReader(System.in));
    }

}