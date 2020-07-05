package com.gigi_g.virtualmachinegenerator.operating_system;

import java.util.Map;
import java.util.function.Supplier;

import com.gigi_g.virtualmachinegenerator.implementor.IVirtualMachine;
import com.gigi_g.virtualmachinegenerator.implementor.VirtualMachineUnix;
import com.gigi_g.virtualmachinegenerator.implementor.VirtualMachineWindows;

public class OperatingSystem {
    private static Map<String, Supplier<IVirtualMachine>> genMap = Map.of("Linux", VirtualMachineUnix::new, "Windows", VirtualMachineWindows::new);

    private OperatingSystem() {}
    
    public static IVirtualMachine getOS() {
        return genMap.getOrDefault(System.getProperty("os.name").contains("Windows")?"Windows":"Linux", VirtualMachineUnix::new).get();
    }

}