package com.gigi_g.virtualmachinegenerator.abstraction;


public class TestSystemGenerateMachine {
    
    public static boolean testSystemCall() {
        SystemGenerateMachine systemGenerateMachine = new SystemGenerateMachine();
        if(System.getProperty("os.name").equals("Linux")) {
            systemGenerateMachine.systemCall("pwd");
            return true;
        }
        else if(System.getProperty("os.name").equals("Windows")) {
            systemGenerateMachine.systemCall("cd");
            return true;
        }
        else {
            return false;
        }
    }
}