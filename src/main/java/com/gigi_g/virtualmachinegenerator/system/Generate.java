package com.gigi_g.virtualmachinegenerator.system;

import com.gigi_g.virtualmachinegenerator.abstraction.SystemGenerateMachine;
import com.gigi_g.virtualmachinegenerator.keylistener.KeyListener;
import com.gigi_g.virtualmachinegenerator.state.ExecutionSystem;

public class Generate {
    private ExecutionSystem executionSystem;
    private SystemGenerateMachine systemGenerateMachine;
    private KeyListener keyListener = KeyListener.getInstance();
    private String nameMachine;

    public Generate() {
        systemGenerateMachine = new SystemGenerateMachine();
        executionSystem = new ExecutionSystem();
    }

    public void init() {
        nameMachine = executionSystem.execute();
        systemGenerateMachine.systemCall("snapshot " + nameMachine + " delete Snapshot");
        systemGenerateMachine.systemCall("snapshot " + nameMachine + " take Snapshot");
    }

    private void initTest() {
        nameMachine = executionSystem.execute();
        System.out.println("snapshot " + nameMachine + " delete Snapshot");
        System.out.println("snapshot " + nameMachine + " take Snapshot");
    }

    private int machineNumber() {
        System.out.println("Enter the number of virtual machines to be created: ");
        return Integer.parseInt(keyListener.inputKey());
    }

    public void generateMachine() {
        int n = machineNumber();
        String cloneName;
        for(int i=0; i<n; i++) {
            cloneName = executionSystem.execute();
            systemGenerateMachine.systemCall("clonevm " + nameMachine + " --snapshot Snapshot --name " + cloneName + " --options link --register");
            systemGenerateMachine.systemCall("modifyvm " + cloneName + " " + executionSystem.execute());
        }
    }

    private void generateMachineTest() {
        int n = machineNumber();
        String cloneName;
        for(int i=0; i<n; i++) {
            cloneName = executionSystem.execute();
            System.out.println("VBoxManage clonevm " + nameMachine + " --snapshot Snapshot --name " + cloneName + " --options link --register");
            System.out.println("VBoxManage modifyvm " + cloneName + " " + executionSystem.execute());
        }
    }

    public void testGenerate() {
        initTest();
        generateMachineTest();
    }
    
}