package com.gigi_g.virtualmachinegenerator.operating_system;

import com.gigi_g.virtualmachinegenerator.implementor.IVirtualMachine;

public class TestOperatingSystem {
    
    public static boolean testGetOS() {
        IVirtualMachine virtualMachine = OperatingSystem.getOS();
        if(null != virtualMachine){
            System.out.println("TestOperatingSystem.testGetOS(): OK");
            return true;
        }
        else {
            System.out.println("TestOperatingSystem.testGetOS(): FAILED");
            return false;
        }
    }
}