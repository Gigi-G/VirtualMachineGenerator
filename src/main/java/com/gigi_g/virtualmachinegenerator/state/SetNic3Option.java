package com.gigi_g.virtualmachinegenerator.state;

public class SetNic3Option implements IGenerateState {

    @Override
    public String execute(ExecutionSystem executionSystem) {
        System.out.println("Enter the name of the lan for nic3: ");
        String input = keyListener.inputKey();
        executionSystem.setState(8);
        return "--intnet3 " + input + " " + executionSystem.execute();
    }
}