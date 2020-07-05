package com.gigi_g.virtualmachinegenerator.state;

public class CloneName implements IGenerateState {

    @Override
    public String execute(ExecutionSystem executionSystem) {
        System.out.println("Enter the name of the new clone: ");
        executionSystem.setState(2);
        return keyListener.inputKey();
    }
    
}