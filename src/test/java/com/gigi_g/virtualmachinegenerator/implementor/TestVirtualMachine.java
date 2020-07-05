package com.gigi_g.virtualmachinegenerator.implementor;

public class TestVirtualMachine {

    public static boolean testVirtualMachine() {
        IVirtualMachine virtualMachine;
        if(System.getProperty("os.name").equals("Linux")) {
            virtualMachine = new VirtualMachine(){
            
                @Override
                public void generateMachines(String command) {
                    processBuilder.command("bash", "-c", "VBoxManage " + command);
                    super.generateMachines(command);
                }
            };
            virtualMachine.generateMachines("pwd");
            return true;
        }
        else if(System.getProperty("os.name").contains("Windows")) {
            virtualMachine = new VirtualMachine(){
            
                @Override
                public void generateMachines(String command) {
                    processBuilder.command("cmd.exe", "/c", command);
                    super.generateMachines(command);
                }
            };
            virtualMachine.generateMachines("cd");
            return true;
        }
        else {
            return false;
        }
    }
}