package com.gigi_g.virtualmachinegenerator.implementor;

public class VirtualMachineUnix extends VirtualMachine {

    @Override
    public void generateMachines(String command) {
        processBuilder.command("bash", "-c", "VBoxManage " + command);
        super.generateMachines(command);
    }
    
}