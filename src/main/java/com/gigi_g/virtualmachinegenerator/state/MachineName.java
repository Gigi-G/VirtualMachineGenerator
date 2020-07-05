package com.gigi_g.virtualmachinegenerator.state;

public class MachineName implements IGenerateState {

    @Override
    public String execute(ExecutionSystem executionSystem) {
        System.out.println("Enter the name of the machine you want to clone: ");
        executionSystem.setState(1);
        return keyListener.inputKey();
    }

}