package com.gigi_g.virtualmachinegenerator.state;

public class SetNic1Option implements IGenerateState {

    @Override
    public String execute(ExecutionSystem executionSystem) {
        System.out.println("Enter the name of the lan for nic1: ");
        String input = keyListener.inputKey();
        executionSystem.setState(4);
        return "--intnet1 " + input + " " + executionSystem.execute();
    }
}