package com.gigi_g.virtualmachinegenerator.abstraction;

import com.gigi_g.virtualmachinegenerator.implementor.IVirtualMachine;
import com.gigi_g.virtualmachinegenerator.operating_system.OperatingSystem;

public class SystemGenerateMachine {
    private IVirtualMachine operatingSystem;

    public SystemGenerateMachine() {
        init();
    }

    private void init() {
        operatingSystem = OperatingSystem.getOS();
    }

    public void systemCall(String command) {
        operatingSystem.generateMachines(command);
    }

}