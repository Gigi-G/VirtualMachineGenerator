package com.gigi_g.virtualmachinegenerator.state;

public class SetNic3 implements IGenerateState {

    @Override
    public String execute(ExecutionSystem executionSystem) {
        System.out.println("Network card nic3 intnet/[none]: ");
        String input = keyListener.inputKey();
        input = !input.equals("none")?"intnet":"none";
        executionSystem.setState(input.equals("none")?8:7);
        return "--nic3 " + input + " " + executionSystem.execute();
    }
}