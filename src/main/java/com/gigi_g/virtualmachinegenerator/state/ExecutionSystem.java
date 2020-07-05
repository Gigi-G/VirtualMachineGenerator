package com.gigi_g.virtualmachinegenerator.state;

import java.util.Map;
import java.util.function.Supplier;

public class ExecutionSystem {
    private IGenerateState generateState;
    private Map<Integer, Supplier<IGenerateState>> mapState;

    public ExecutionSystem() {
        mapState = Map.of(0, MachineName::new, 1, CloneName::new, 2, SetNic1::new, 3, SetNic1Option::new, 4, SetNic2::new, 5, SetNic2Option::new, 6, SetNic3::new, 7, SetNic3Option::new, 8, SetNic4::new, 9, SetNic4Option::new);
        generateState = new MachineName();
    }

    public String execute() {
        return generateState.execute(this);
    }

    public void setState(int key) {
        generateState = mapState.get(key).get();
    }
}