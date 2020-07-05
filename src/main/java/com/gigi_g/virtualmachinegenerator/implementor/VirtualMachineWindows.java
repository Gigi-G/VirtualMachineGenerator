package com.gigi_g.virtualmachinegenerator.implementor;

public class VirtualMachineWindows extends VirtualMachine {

    @Override
    public void generateMachines(String command) {
        processBuilder.command("cmd.exe", "/c", "C:\\Programmi\\Oracle\\VirtualBox\\VBoxManage.exe " + command);
        super.generateMachines(command);
    }
    
}