package com.gigi_g.virtualmachinegenerator.state;

public class SetNic4 implements IGenerateState {

    @Override
    public String execute(ExecutionSystem executionSystem) {
        System.out.println("Network card nic4 intnet/[none]: ");
        String input = keyListener.inputKey();
        input = !input.equals("none")?"intnet":"none";
        if(input.equals("none")) {
            executionSystem.setState(1);
            return "--nic4 " + input;
        }
        executionSystem.setState(9);
        return "--nic4 " + input + " " + executionSystem.execute();
    }
}