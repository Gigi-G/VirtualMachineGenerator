package com.gigi_g.virtualmachinegenerator.state;

public class SetNic2 implements IGenerateState {

    @Override
    public String execute(ExecutionSystem executionSystem) {
        System.out.println("Network card nic2 intnet/[none]: ");
        String input = keyListener.inputKey();
        input = !input.equals("none")?"intnet":"none";
        executionSystem.setState(input.equals("none")?6:5);
        return "--nic2 " + input + " " + executionSystem.execute();
    }
}