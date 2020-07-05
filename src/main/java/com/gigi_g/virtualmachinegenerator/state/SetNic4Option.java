package com.gigi_g.virtualmachinegenerator.state;

public class SetNic4Option implements IGenerateState {

    @Override
    public String execute(ExecutionSystem executionSystem) {
        System.out.println("Enter the name of the lan for nic4: ");
        String input = keyListener.inputKey();
        executionSystem.setState(1);
        return "--intnet4 " + input;
    }
}