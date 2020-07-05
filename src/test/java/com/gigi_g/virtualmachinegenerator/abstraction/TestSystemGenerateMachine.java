package com.gigi_g.virtualmachinegenerator.abstraction;


public class TestSystemGenerateMachine {
    
    public static boolean testSystemCall() {
        SystemGenerateMachine systemGenerateMachine = new SystemGenerateMachine();
        if(System.getProperty("os.name").equals("Linux")) {
            systemGenerateMachine.systemCall("list vms");
            return true;
        }
        else if(System.getProperty("os.name").contains("Windows")) {
            systemGenerateMachine.systemCall("list vms");
            return true;
        }
        else {
            return false;
        }
    }
}