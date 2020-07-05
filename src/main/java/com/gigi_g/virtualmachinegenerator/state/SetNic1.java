package com.gigi_g.virtualmachinegenerator.state;

public class SetNic1 implements IGenerateState {

    @Override
    public String execute(ExecutionSystem executionSystem) {
        System.out.println("Network card nic1 intnet/[none]: ");
        String input = keyListener.inputKey();
        input = !input.equals("none")?"intnet":"none";
        executionSystem.setState(input.equals("none")?4:3);
        return "--nic1 " + input + " " + executionSystem.execute();
    }
    
}