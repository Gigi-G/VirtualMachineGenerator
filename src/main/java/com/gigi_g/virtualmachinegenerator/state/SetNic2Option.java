package com.gigi_g.virtualmachinegenerator.state;

public class SetNic2Option implements IGenerateState {

    @Override
    public String execute(ExecutionSystem executionSystem) {
        System.out.println("Enter the name of the lan for nic2: ");
        String input = keyListener.inputKey();
        executionSystem.setState(6);
        return "--intnet2 " + input + " " + executionSystem.execute();
    }
}