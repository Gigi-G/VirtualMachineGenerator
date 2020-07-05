package com.gigi_g.virtualmachinegenerator.state;

import com.gigi_g.virtualmachinegenerator.keylistener.KeyListener;

public interface IGenerateState {
    final KeyListener keyListener = KeyListener.getInstance();
    public String execute(ExecutionSystem executionSystem);
}