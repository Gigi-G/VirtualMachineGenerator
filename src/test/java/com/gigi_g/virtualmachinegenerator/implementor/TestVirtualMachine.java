package com.gigi_g.virtualmachinegenerator.implementor;

public class TestVirtualMachine {

    public static boolean testVirtualMachine() {
        IVirtualMachine virtualMachine;
        if(System.getProperty("os.name").equals("Linux")) {
            virtualMachine = new VirtualMachineUnix();
            virtualMachine.generateMachines("pwd");
            return true;
        }
        else if(System.getProperty("os.name").equals("Windows")) {
            virtualMachine = new VirtualMachineWindows();
            virtualMachine.generateMachines("cd");
            return true;
        }
        else {
            return false;
        }
    }
}