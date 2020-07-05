package com.gigi_g.virtualmachinegenerator.implementor;

public interface IVirtualMachine {
    final ProcessBuilder processBuilder = new ProcessBuilder();
    public void generateMachines(String command);
}